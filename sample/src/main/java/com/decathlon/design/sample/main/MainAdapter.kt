package com.decathlon.design.sample.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.decathlon.design.sample.components.model.Component
import com.decathlon.design.sample.databinding.ItemComponentBinding

class MainAdapter(
    private val components: List<Component>,
    private val navigateTo: (navDirection: Int) -> Unit
) : RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }

    override fun getItemCount(): Int {
        return components.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val component = components[position]
        holder.bind(component)
        holder.itemView.setOnClickListener {
            navigateTo(component.navDirection)
        }
    }

    class ViewHolder
    private constructor(
        private val binding: ItemComponentBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(component: Component) {
            binding.textView.setText(component.nameRes)
            binding.imageView.setImageResource(component.imageRes)
        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val inflater = LayoutInflater.from(parent.context)
                return ViewHolder(
                    ItemComponentBinding.inflate(inflater, parent, false)
                )
            }
        }
    }
}
