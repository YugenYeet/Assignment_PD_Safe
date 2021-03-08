package com.example.pdsafe

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Bt_Emergency_Contact.setOnClickListener {
            val intent_EmC = Intent( this, EmergencyContact::class.java)
            startActivity(intent_EmC)
        }

        Bt_Basic_First_Aid.setOnClickListener {
            val intent_BasicFA = Intent(this, BasicFirstAid::class.java)
            startActivity(intent_BasicFA)
        }

        Bt_Personal_Info.setOnClickListener {
            val intent_PersonalI = Intent(this, PersonalInfo::class.java)
            startActivity(intent_PersonalI)
        }
    }
}