package com.example.pdsafe

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_emergency_contact.*
import kotlinx.android.synthetic.main.activity_personal_details.*
import kotlinx.android.synthetic.main.activity_personal_info.*

class PersonalDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personal_details)

        val sharedPref = getSharedPreferences("myData", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()

        ImBt_Arrow_Back_3_1.setOnClickListener {
            val intent_PersonalI = Intent( this, PersonalInfo::class.java)
            startActivity(intent_PersonalI)
        }

        Bt_AddInfo.setOnClickListener {
            val fullName = etPersonalName.text.toString()
            val ageEnter = etPersonalAge.text.toString().toInt()
            val bloodType = etPersonalBloodType.text.toString()
            val idNum = etPersonalIC.text.toString()

            Toast.makeText(this,"Data Saved", Toast.LENGTH_SHORT).show()

            editor.apply {
                putString("STRING_NAME", fullName)
                putInt("INT_AGE", ageEnter)
                putString("STRING_BLOOD", bloodType)
                putString("STRING_ID", idNum)
                apply()
            }
        }

        Bt_LoadInfo.setOnClickListener {
            val fullName =sharedPref.getString("STRING_NAME", null)
            val ageEnter = sharedPref.getInt("INT_AGE", 0)
            val bloodType = sharedPref.getString("STRING_BLOOD", null)
            val idNum = sharedPref.getString("STRING_ID", null)

            etPersonalName.setText(fullName)
            etPersonalAge.setText(ageEnter.toString())
            etPersonalBloodType.setText(bloodType)
            etPersonalIC.setText(idNum)
        }
    }
}