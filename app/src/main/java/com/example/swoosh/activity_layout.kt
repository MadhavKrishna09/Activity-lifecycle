package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_layout.*

class activity_layout : BaseActivity() {

    var selectedleague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout)
    }

    fun onmensclicked(view: View) {
        womensclickedbtn.isChecked = false
        coedclickedbtn.isChecked = false

        selectedleague= "mens"
    }

    fun onwomensclicked(view: View){
        mensclickedbtn.isChecked = false
        coedclickedbtn.isChecked = false

        selectedleague = "womens"
    }

    fun oncoedclicked(view: View){
        mensclickedbtn.isChecked = false
        womensclickedbtn.isChecked = false

        selectedleague = "co-ed"
    }

    fun leagueNextClicked(view: View) {

        if (selectedleague != ""){
            val skill_layout= Intent(this, Skill_layout::class.java)
            skill_layout.putExtra(EXTRA_LEAGUE,skill_layout)
            startActivity(skill_layout)
        }
        else
            Toast.makeText(this ,"please select a league", Toast.LENGTH_SHORT).show()

    }
}