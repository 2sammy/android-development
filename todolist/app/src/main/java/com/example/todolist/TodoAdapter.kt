package com.example.todolist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TodoAdapter (
    private val todos: MutableList<Todo>): RecyclerView.Adapter<TodoAdapter.TodoViewHolder>(){
    class TodoViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
      return TodoViewHolder(
          LayoutInflater.from(parent.context).inflate(
              R.layout.item_todo,
              parent,
               false

          )
      )
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
     val curTodo = todos[position]
        holder.itemView.apply {
            tvTodoTitle.text = curTodo.title
            cbDone.isChecked

        }
    }

    override fun getItemCount(): Int {
        return  todos.size

    }
}