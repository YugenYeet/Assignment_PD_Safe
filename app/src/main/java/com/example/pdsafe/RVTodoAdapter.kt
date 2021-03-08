package com.example.pdsafe

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.format_to_do_list.view.*


class RVTodoAdapter(
    private val todoList: MutableList<RVTodoList>
) : RecyclerView.Adapter<RVTodoAdapter.ToDoViewHolder>() {

    class ToDoViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToDoViewHolder {
        return ToDoViewHolder(
                LayoutInflater.from(parent.context).inflate(
                        R.layout.format_to_do_list,
                        parent,
                        false
                )
        )
    }

    fun addPCList(PCList: RVTodoList) {
        todoList.add(PCList)
        notifyItemInserted(todoList.size - 1)
    }

    fun delPCList() {
        todoList.removeAll { PCList ->
            PCList.isChecked
        }
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: ToDoViewHolder, position: Int) {
        val curRVPersonalEmC = todoList[position]
        holder.itemView.apply {
            tvPCList.text = curRVPersonalEmC.todos
            cbCheck.isChecked = curRVPersonalEmC.isChecked
            cbCheck.setOnCheckedChangeListener { _, isChecked ->
                curRVPersonalEmC.isChecked = !curRVPersonalEmC.isChecked
            }
        }
    }

    override fun getItemCount(): Int {
        return todoList.size
    }
}