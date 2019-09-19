package com.example.dailytask

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.edit
import com.example.dailytask.R.id.tasktitle
import com.google.android.gms.tasks.Task
import com.google.android.material.textfield.TextInputEditText
import kotlinx.android.synthetic.main.activity_add.*
import org.w3c.dom.Text
import java.lang.reflect.Array.get

class addActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)




okbutton.setOnClickListener {

    var title = ""
    var desc= ""
    var date = ""
    if (checkBox.isChecked){
        title = "❗" + tasktitle.text.toString()
        desc = description.text.toString()
        date = dat_input.text.toString()

    }else{
        title= tasktitle.text.toString()

    }
    var prefs = getSharedPreferences("com.example.dailytask", Context.MODE_PRIVATE)
    var todos = prefs.getStringSet("todostrings", setOf())?.toMutableSet()
    todos?.add(title)
    todos?.add(desc)
    todos?.add(date)
     prefs.edit().putStringSet("todostrings", todos).apply()

    finish()
}

        }






       }














