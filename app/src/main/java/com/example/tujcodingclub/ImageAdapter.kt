package com.example.tujcodingclub

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter(_imageItems : Array<Int>, _callback : (Int)->Unit): RecyclerView.Adapter<ImageAdapter.ImageItemViewHolder>() {
    private val imageItems = _imageItems
    private val callback = _callback
    inner class ImageItemViewHolder(layout : View) : RecyclerView.ViewHolder(layout)
    {
        val imageView = layout.findViewById<ImageView>(R.id.mainPageImage)
        init{
            imageView.setOnClickListener{callback(imageItems[adapterPosition])}
        }

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageItemViewHolder {
        return ImageItemViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item_main, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return imageItems.size
    }

    override fun onBindViewHolder(holder: ImageItemViewHolder, position: Int) {

    }
}