package com.example.swoosh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Skill_layout : AppCompatActivity() {

    var league = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill_layout)

        league = intent.getStringExtra(EXTRA_LEAGUE).toString()
        print(league)
    }



}