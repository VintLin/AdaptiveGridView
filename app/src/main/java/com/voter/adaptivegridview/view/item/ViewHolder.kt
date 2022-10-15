package com.voter.adaptivegridview.view.item

import android.view.View
import android.widget.TextView
import com.voter.adaptivegridview.R
import com.voter.adaptivegridview.core.BaseGridAdapter

class ViewHolder(itemView: View) : BaseGridAdapter.ItemViewHolder(itemView) {

    private val textView: TextView = itemView.findViewById<View>(R.id.textview) as TextView

    fun bind(item: ItemData) {
        textView.text = "${item.position}"
    }
}