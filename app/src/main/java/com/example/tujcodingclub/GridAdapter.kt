package com.example.tujcodingclub

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

class GridAdapter(_context : Context, _count : Int) : BaseAdapter() {
    private val context = _context
    private val count = _count
    override fun getCount(): Int {
        return count
    }

    override fun getItem(position: Int): Any? {
        return position
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view: View
        if (convertView == null) {
            val inflater = LayoutInflater.from(context)
            view = inflater.inflate(R.layout.grid_item, parent, false)
        } else {
            view = convertView
        }
        return view
    }

}