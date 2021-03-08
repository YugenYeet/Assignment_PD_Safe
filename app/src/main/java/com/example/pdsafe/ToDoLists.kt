package com.example.pdsafe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_to_do_lists.*

class ToDoLists : AppCompatActivity() {

    private lateinit var todoAdapter: RVTodoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_to_do_lists)

        ImBt_Arrow_Back_1_1.setOnClickListener {
            val intent_PersonalI = Intent(this, PersonalInfo::class.java)
            startActivity(intent_PersonalI)
        }

        todoAdapter = RVTodoAdapter(mutableListOf())

        rvPersonalToDo.adapter = todoAdapter
        rvPersonalToDo.layoutManager = LinearLayoutManager(this)

        addPersonalListbtn.setOnClickListener {
            val PEmC = etPersonalList.text.toString()
            if (PEmC.isNotEmpty()) {
                val PCList = RVTodoList(PEmC)
                todoAdapter.addPCList(PCList)
                etPersonalList.text.clear()
            }
        }

        delPersonalToDobtn.setOnClickListener {
            todoAdapter.delPCList()
        }
    }
}
