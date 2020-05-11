package com.syngenta.uikit.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.syngenta.uikit.R
import kotlinx.android.synthetic.main.item_color.view.*

class ColorItem(var colorName: String, var colorId: Int)

class ColorsAdapter(var context: Context, var list: Array<ColorItem>) :
    RecyclerView.Adapter<ColorsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ColorsViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.item_color, parent, false)
        return ColorsViewHolder(view)
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: ColorsViewHolder, position: Int) {
        holder.colorName.text = list[position].colorName
        holder.colorCode.text =
            "#${context.resources.getString(0 + list[position].colorId).substring(3)}"
        holder.colorView.setBackgroundColor(context.resources.getColor(list[position].colorId))
    }

}

class ColorsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val colorName: TextView = itemView.text_color_name
    val colorCode: TextView = itemView.text_color_code
    val colorView: ImageView = itemView.color_view
}