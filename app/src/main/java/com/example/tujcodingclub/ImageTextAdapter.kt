package com.example.tujcodingclub

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ImageTextAdapter(_imageItems : Array<ImageItem>, _callback : (ImageItem)->Unit?, _layout : Int) : RecyclerView.Adapter<ImageTextAdapter.ImageItemViewHolder>()
{
    private val imageItems = _imageItems
    private val callback = _callback
    private val layout = _layout
    inner class ImageItemViewHolder(layout : View) : RecyclerView.ViewHolder(layout)
    {
        val imageView = layout.findViewById<ImageView>(R.id.studentProjextImageView)
        val textView = layout.findViewById<TextView>(R.id.srudentProjectTextView)

        init{
            imageView.setOnClickListener{callback(imageItems[adapterPosition])}
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageItemViewHolder {
        return ImageItemViewHolder(
            LayoutInflater.from(parent.context).inflate(layout, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ImageItemViewHolder, position: Int) {
        holder.imageView.setImageResource(imageItems[position].id)
        holder.textView.text = imageItems[position].name
    }

    override fun getItemCount(): Int {
        return imageItems.size
    }

}