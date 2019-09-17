package com.example.dailytask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.android.gms.tasks.Task
import kotlinx.android.synthetic.main.activity_add.*

class addActivity : AppCompatActivity() {
    companion object Factory{
        fun create(): addActivity = addActivity()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)



       }



    }




