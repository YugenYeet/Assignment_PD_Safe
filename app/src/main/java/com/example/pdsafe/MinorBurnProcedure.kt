package com.example.pdsafe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_heart_attack_procedure.*
import kotlinx.android.synthetic.main.activity_minor_burn_procedure.*

class MinorBurnProcedure : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_minor_burn_procedure)

        ImBt_Arrow_Back_2_4.setOnClickListener {
            val intent_BasicFA = Intent( this, BasicFirstAid::class.java)
            startActivity(intent_BasicFA)
        }
    }
}