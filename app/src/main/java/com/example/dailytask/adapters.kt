package com.example.dailytask

import android.icu.text.CaseMap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_add.view.*
import kotlinx.android.synthetic.main.content_main.view.*
import kotlinx.android.synthetic.main.list_item.view.*
import kotlinx.android.synthetic.main.activity_add.view.textView3 as textView31

class adapterss : ListAdapter < ToDo, ToDoViewHolder>(object :DiffUtil.ItemCallback<ToDo>(){
    override fun areItemsTheSame(oldItem: ToDo, newItem: ToDo): Boolean =oldItem == newItem

    override fun areContentsTheSame(oldItem: ToDo, newItem: ToDo): Boolean = oldItem == newItem }){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToDoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ToDoViewHolder(view)

    }

    override fun onBindViewHolder(holder: ToDoViewHolder, position: Int) {
       holder.bind(getItem(position))
    }

    }
class ToDoViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    fun bind(todos: ToDo){
        //itemView.findViewById<TextView>(R.id.createDate).setText(todo.createdAt)
        itemView.findViewById<TextView>(R.id.tasktitle).setText(todos.title)
        itemView.findViewById<TextView>(R.id.description).setText(todos.desc)
        itemView.findViewById<TextView>(R.id.dat_input).setText(todos.date)



    }
}


data class Todos(var todoID: Int = 0, var title: String = "", var desc: String = "", var date: String = "")






