package com.example.pdsafe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cardiac_arrest_procedure.*
import kotlinx.android.synthetic.main.activity_heart_attack_procedure.*

class CardiacArrestProcedure : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cardiac_arrest_procedure)

        ImBt_Arrow_Back_2_2.setOnClickListener {
            val intent_BasicFA = Intent( this, BasicFirstAid::class.java)
            startActivity(intent_BasicFA)
        }
    }
}