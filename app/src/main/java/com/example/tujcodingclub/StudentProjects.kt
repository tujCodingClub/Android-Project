package com.example.tujcodingclub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class StudentProjects : AppCompatActivity() {
    lateinit var projectRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_projects)
        projectRecyclerView = findViewById(R.id.studentProjectRecycler)
        val images = arrayOf(
            ImageItem(R.drawable.aipython, "ProjectAIPython"),


            )
        val callback = {item : ImageItem ->
            val intent = when(item.name) {
                "ProjectAIPython" -> Intent(this@StudentProjects, ProjectAIPython::class.java)
                // Add all other potential activity names here
                else -> null
            }
            intent?.let { startActivity(it) }

        }

        projectRecyclerView.adapter = ImageTextAdapter(images, callback, R.layout.recyclerview_item_stident_projects)
        projectRecyclerView.layoutManager = GridLayoutManager(this, 2)

    }
}