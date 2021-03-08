package com.example.pdsafe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_basic_first_aid.*
import kotlinx.android.synthetic.main.activity_emergency_contact.*

class BasicFirstAid : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic_first_aid)

        ImBt_Arrow_Back_2.setOnClickListener {
            val intent_Main = Intent( this, MainActivity::class.java)
            startActivity(intent_Main)
        }

        Tv_HeartAttack.setOnClickListener {
            val intent_HeartAttack = Intent( this, HeartAttackProcedure::class.java)
            startActivity(intent_HeartAttack)
        }

        Tv_CardiacArrest.setOnClickListener {
            val intent_CardiacArrest = Intent( this, CardiacArrestProcedure::class.java)
            startActivity(intent_CardiacArrest)
        }

        Tv_MinorWound.setOnClickListener {
            val intent_MinorWound = Intent( this, MinorWoundProcedure::class.java)
            startActivity(intent_MinorWound)
        }

        Tv_MinorBurn.setOnClickListener {
            val intent_MinorBurn = Intent( this, MinorBurnProcedure::class.java)
            startActivity(intent_MinorBurn)
        }

        Tv_FirstAidKit.setOnClickListener {
            val intent_FirstAidKit = Intent( this, FirstAidKit::class.java)
            startActivity(intent_FirstAidKit)
        }
    }
}