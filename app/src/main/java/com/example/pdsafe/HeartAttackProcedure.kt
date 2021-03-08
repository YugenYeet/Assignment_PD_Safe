package com.example.pdsafe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_emergency_contact.*
import kotlinx.android.synthetic.main.activity_heart_attack_procedure.*

class HeartAttackProcedure : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_heart_attack_procedure)

        ImBt_Arrow_Back_2_1.setOnClickListener {
            val intent_BasicFA = Intent( this, BasicFirstAid::class.java)
            startActivity(intent_BasicFA)
        }
    }
}