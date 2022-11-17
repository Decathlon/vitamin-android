package com.decathlon.design.sample.components.screens.resources.common

import android.annotation.SuppressLint
import android.content.res.Configuration
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.decathlon.design.sample.components.screens.ComponentFragment
import com.decathlon.design.sample.databinding.FragmentResourceSearchBinding
import com.decathlon.design.sample.databinding.ItemResourceBinding

abstract class AbstractResourcesFragment : ComponentFragment() {

    protected abstract fun getData(): LiveData<List<ResourceModel>>

    private lateinit var binding: FragmentResourceSearchBinding

    protected val resourcesViewModel: ResourcesViewModel by viewModels(ownerProducer = {
        requireActivity()
    })

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentResourceSearchBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupResourcesList()
    }

    private fun setupResourcesList() {
        val resourcesAdapter = ResourcesAdapter()
        binding.recyclerView.apply {
            // Layout Manager
            val spanCount =
                if (resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT) {
                    2
                } else {
                    4
                }
            layoutManager = GridLayoutManager(context, spanCount)
            // Adapter
            adapter = resourcesAdapter
        }
        getData().observe(viewLifecycleOwner) { resources ->
            resourcesAdapter.resources = resources
        }
    }

    inner class ResourcesAdapter : RecyclerView.Adapter<ResourceViewHolder>() {

        var resources: List<ResourceModel> = emptyList()
            @SuppressLint("NotifyDataSetChanged")
            set(value) {
                field = value
                notifyDataSetChanged()
            }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResourceViewHolder {
            return ResourceViewHolder(
                ItemResourceBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
        }

        override fun onBindViewHolder(holder: ResourceViewHolder, position: Int) {
            resources.getOrNull(position)?.let { holder.bind(it) }
        }

        override fun getItemCount(): Int {
            return resources.size
        }

    }

    inner class ResourceViewHolder(
        val binding: ItemResourceBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(resource: ResourceModel) {
            binding.image.setImageDrawable(resource.src)
            binding.label.text = resource.name
        }
    }
}