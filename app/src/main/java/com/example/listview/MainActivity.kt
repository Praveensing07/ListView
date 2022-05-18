package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val cityname= arrayOf("Delhi","Mumbai","Ahemdabad","Patna","Lucknow","Bhopal")
        val cities =findViewById<ListView>(R.id.listview)
        var cityAdapter= ArrayAdapter(this,android.R.layout.simple_list_item_1,cityname)
        cities.adapter=cityAdapter
        cities.setOnItemClickListener { adapterView, view, positon, id ->
            val city:TextView=view as TextView
            Toast.makeText(this,city.text,Toast.LENGTH_SHORT).show()
        }

        }
    }