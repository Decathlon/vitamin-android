package com.decathlon.design.sample.main

import android.content.res.Configuration
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import com.decathlon.design.sample.components.model.ComponentProvider
import com.decathlon.design.sample.databinding.FragmentMainBinding
import com.google.android.material.transition.MaterialSharedAxis

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        exitTransition = MaterialSharedAxis(MaterialSharedAxis.Z, true)
        reenterTransition = MaterialSharedAxis(MaterialSharedAxis.Z, /* forward= */ false)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        binding.recyclerView.apply {
            val spanCount =
                if (resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT) {
                    2
                } else {
                    4
                }
            layoutManager = GridLayoutManager(this.context, spanCount)
            addItemDecoration(
                DividerItemDecoration(this.context, DividerItemDecoration.HORIZONTAL)
            )
            addItemDecoration(
                DividerItemDecoration(this.context, DividerItemDecoration.VERTICAL)
            )
            adapter = MainAdapter(ComponentProvider.getAll()) {
                findNavController().navigate(it)
            }
        }
    }

}