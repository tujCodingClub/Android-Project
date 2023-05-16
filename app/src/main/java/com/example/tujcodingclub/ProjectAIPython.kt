package com.example.tujcodingclub

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.GridView
import android.widget.TextView
import android.widget.Toast

class ProjectAIPython : AppCompatActivity() {
    //TODO: Introduction Fragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_project_aipython)

        val gridItemSize = 25
        val gridViewA: GridView = findViewById(R.id.gridViewA)
        val gridViewB: GridView = findViewById(R.id.gridViewB)
        val gridViewC: GridView = findViewById(R.id.gridViewC)
        val adapter = GridAdapter(this, gridItemSize)
        gridViewSetUp(gridViewA, adapter)
        gridViewSetUp(gridViewB, adapter)
        gridViewSetUp(gridViewC, adapter)
    }

    private fun gridViewSetUp(_gridView: GridView, _adapter: GridAdapter) {
        _gridView.adapter = _adapter
        _gridView.setOnItemClickListener { _, v, _, _ ->
            colorChange(v)
        }
    }

    private fun colorChange(_v: View): Int {
        val item = _v.findViewById<TextView>(R.id.textGrid)
        val backgroundDrawable = item.background
        val color = (backgroundDrawable as ColorDrawable).color
        if (color == Color.parseColor("Black")) {
            item.setBackgroundColor(Color.parseColor("White"))
        } else {
            item.setBackgroundColor(Color.parseColor("Black"))
        }
        return color


    }


}