package com.example.pdsafe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_emergency_contact.*
import kotlinx.android.synthetic.main.activity_hospital_hotline__west_m_y.*

class HospitalHotline_WestMY : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hospital_hotline__west_m_y)

        ImBt_Arrow_Back_1_2.setOnClickListener {
            val intent_EmC = Intent( this, EmergencyContact::class.java)
            startActivity(intent_EmC)
        }
    }
}