package com.ahmed.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.ahmed.swoosh.EXTRA_LEAGUE
import com.ahmed.swoosh.EXTRA_SKILL
import com.ahmed.swoosh.R
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league = ""
    var skills = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE).toString()
        //league = intent.getStringExtra(EXTRA_LEAGUE)
    }
    fun onBeginnerClicked(view: View){
        ballaerbtn.isChecked = false
        skills = "Beginner"
    }

    fun onBallerClicked(view: View){
        biginnerbtn.isChecked = false
        skills = "Baller"
    }
    
    fun onFinishClicked(view: View){
        if (skills != ""){
            val finishActivity = Intent(this ,FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE ,league)
            finishActivity.putExtra(EXTRA_SKILL , skills)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "please select the skill level ....", Toast.LENGTH_SHORT).show()
        }

    }
}