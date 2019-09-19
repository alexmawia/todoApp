package com.example.dailytask

import android.annotation.SuppressLint
import android.content.Context
import com.google.firebase.database.DatabaseReference
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import android.widget.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.*

import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_add.*

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.recyclerView
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.list_item.*
import java.util.*
import android.widget.Adapter as AndroidWidgetAdapter

class MainActivity : AppCompatActivity() {




    //var todoList = mutableListOf<ToDo>()




    val recAdapter = adapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)





        //recyclerView.layoutManager = LinearLayoutManager(this.applicationContext)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(applicationContext)
        recyclerView.adapter= recAdapter
        recAdapter.submitList(todos)









        fab.setOnClickListener { view ->
            val intent= Intent(this, addActivity::class.java)
            startActivity(intent)


            }


            }

    override fun onResume() {
        super.onResume()
        var prefs = getSharedPreferences("com.example.dailytask", Context.MODE_PRIVATE)
        var todos = prefs.getStringSet("todostrings", setOf())?.toMutableSet()









    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)


}}
