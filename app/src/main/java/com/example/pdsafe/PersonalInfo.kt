package com.example.pdsafe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_personal_info.*

class PersonalInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personal_info)

        ImBt_Arrow_Back_3.setOnClickListener {
            val intent_Main = Intent( this, MainActivity::class.java)
            startActivity(intent_Main)
        }

        Tv_Personal_Details.setOnClickListener {
            val intent_PersonalD = Intent( this, PersonalDetails::class.java)
            startActivity(intent_PersonalD)
        }

        Tv_To_Do_List.setOnClickListener {
            val intent_TDList = Intent( this, ToDoLists::class.java)
            startActivity(intent_TDList)
        }
    }
}