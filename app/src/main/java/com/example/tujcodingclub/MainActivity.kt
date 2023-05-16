package com.example.tujcodingclub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var mainRecyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mainSpinner = findViewById<Spinner>(R.id.mainSpinner)
        val spinnerTexts = arrayOf(
            "TUJ CODING",
            "Resources",
            "Tools",
            "Services",
            "Contact",
            "Student Projects",
        )
        mainSpinner.adapter = ArrayAdapter(this, R.layout.spinner_selection, spinnerTexts)
        mainSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View, position: Int, id: Long
            ) {
                if(position == 1)
//                    setContentView(R.layout.activity_resources)
                else if(position == 2)
//                    setContentView(R.layout.activity_tools)
                else if(position == 3)
//                    setContentView(R.layout.activity_services)
                else if(position == 4)
//                    setContentView(R.layout.activity_contact)
                else if(position == 5) {
                    val intent = Intent(this@MainActivity, StudentProjects::class.java)
                    startActivity(intent)

                }


            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // write code to perform some action
            }
        }


        mainRecyclerView = findViewById(R.id.mainRecyclerView)
        val images = arrayOf(
            R.drawable.logo,

        )
        val callback = {item : Int ->

        }
        mainRecyclerView.adapter = ImageAdapter(images, callback)
        mainRecyclerView.layoutManager = LinearLayoutManager(this)
    }
}