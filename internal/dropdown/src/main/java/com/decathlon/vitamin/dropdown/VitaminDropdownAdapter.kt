package com.decathlon.vitamin.dropdown

import android.view.View
import android.view.ViewGroup

import android.content.Context

import android.view.LayoutInflater
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.*
import androidx.annotation.LayoutRes


class VitaminDropdownAdapter(
    private val context: Context,
    @LayoutRes private val layout: Int,
    private val items: List<Item>
): BaseAdapter(), Filterable {
    override fun getCount(): Int = items.size

    override fun getItem(position: Int) = items[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val viewHolder: ViewHolder
        val newConvertView: View = if (convertView == null) {
            val view = LayoutInflater.from(context).inflate(layout, parent, false)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
            view
        } else {
            viewHolder = convertView.tag as ViewHolder
            convertView
        }
        viewHolder.bind(getItem(position))
        return newConvertView
    }

    override fun getFilter(): Filter = ArrayFilter(items, this)
}

private class ArrayFilter<T>(val list: List<T>, val adapter: BaseAdapter) : Filter() {
    override fun performFiltering(prefix: CharSequence?): FilterResults {
        val results = FilterResults()
        results.values = list
        results.count = list.size
        return results
    }

    override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
        if (results != null && results.count > 0) {
            adapter.notifyDataSetChanged()
        } else {
            adapter.notifyDataSetInvalidated()
        }
    }
}

private class ViewHolder(view: View) {
    val leftIcon: ImageView = view.findViewById(R.id.vtmnDropdownLeftIcon)
    val rightIcon: ImageView = view.findViewById(R.id.vtmnDropdownRightIcon)
    val text: TextView = view.findViewById(R.id.vtmnDropdownText)

    fun bind(item: Item) {
        if (item.leftIcon != null) {
            leftIcon.setImageResource(item.leftIcon)
            leftIcon.visibility = VISIBLE
        } else {
            leftIcon.visibility = GONE
        }
        if (item.rightIcon != null) {
            rightIcon.visibility = VISIBLE
            rightIcon.setImageResource(item.rightIcon)
        } else {
            rightIcon.visibility = GONE
        }
        text.text = item.text
    }
}

