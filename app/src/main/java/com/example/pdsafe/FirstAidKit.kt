package com.example.pdsafe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first_aid_kit.*
import kotlinx.android.synthetic.main.activity_heart_attack_procedure.*

class FirstAidKit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_aid_kit)

        ImBt_Arrow_Back_2_5.setOnClickListener {
            val intent_BasicFA = Intent( this, BasicFirstAid::class.java)
            startActivity(intent_BasicFA)
        }
    }
}