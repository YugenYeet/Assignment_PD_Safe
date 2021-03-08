package com.example.pdsafe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_emergency_contact.*
import kotlinx.android.synthetic.main.activity_main.*

class EmergencyContact : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emergency_contact)

        ImBt_Arrow_Back_1.setOnClickListener {
            val intent_Main = Intent( this, MainActivity::class.java)
            startActivity(intent_Main)
        }

        Tv_HospitalHotline_WestMY.setOnClickListener {
            val intent_HostpitalH = Intent( this, HospitalHotline_WestMY::class.java)
            startActivity(intent_HostpitalH)
        }
    }
}