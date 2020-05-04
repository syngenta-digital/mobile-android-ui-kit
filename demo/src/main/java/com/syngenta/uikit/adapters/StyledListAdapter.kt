package com.syngenta.uikit.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.syngenta.uikit.R
import kotlinx.android.synthetic.main.item_generic.view.*

interface StyledListItem {
    fun getImageUrl(): Int?
    fun getMainText(): String?
    fun getSubText1(): String?
    fun getSubText2(): String?
}

interface StyledItemCallback {
    fun onClick(item: StyledListItem)
}

class StyledListAdapter<T : StyledListItem>() : RecyclerView.Adapter<GenericViewHolder>() {

    var list: Array<T>? = null
    var context: Context? = null
    var callback: StyledItemCallback? = null

    constructor(
        context: Context,
        items: Array<T>,
        recyclerView: RecyclerView,
        callback: StyledItemCallback? = null
    ) : this() {
        this.context = context
        this.list = items
        this.callback = callback
        val layoutManager = LinearLayoutManager(context)
        recyclerView.layoutManager = layoutManager
        recyclerView.addItemDecoration(
            DividerItemDecoration(
                recyclerView.context,
                layoutManager.orientation
            )
        )

        recyclerView.adapter = this
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GenericViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_generic, parent, false)
        return GenericViewHolder(view)
    }

    override fun getItemCount() = list?.size ?: 0

    override fun onBindViewHolder(holder: GenericViewHolder, position: Int) {
        list?.let { list ->
            val item = list[position]
            val imageUrl = item.getImageUrl()
            if (imageUrl != null) {
                holder.imageView.setImageResource(imageUrl)
                holder.imageView.visibility = View.VISIBLE
            } else {
                holder.imageView.visibility = View.GONE
            }

            if (item.getMainText() != null) {
                holder.mainText.text = item.getMainText()
                holder.mainText.visibility = View.VISIBLE
            } else {
                holder.mainText.visibility = View.GONE
            }

            if (item.getSubText1() != null) {
                holder.subText1.text = item.getSubText1()
                holder.subText1.visibility = View.VISIBLE
            } else {
                holder.subText1.visibility = View.GONE
            }

            if (item.getSubText2() != null) {
                holder.subText2.text = item.getSubText2()
                holder.subText2.visibility = View.VISIBLE
            } else {
                holder.subText2.visibility = View.GONE
            }
            holder.v.setOnClickListener {
                callback?.onClick(item)
            }
        }
    }

    fun setItems(items: Array<T>) {
        this.list = items
        notifyDataSetChanged()
    }

}

class GenericViewHolder(var v: View) : RecyclerView.ViewHolder(v) {
    val imageView: ImageView = v.image_view
    val mainText: TextView = v.text_main
    val subText1: TextView = v.text_sub1
    val subText2: TextView = v.text_sub2
}