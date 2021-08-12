package com.ahmed.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.ahmed.swoosh.EXTRA_PLAYER
import com.ahmed.swoosh.R
import com.ahmed.swoosh.model.Player
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    //var league = ""
    //var skills = ""
    lateinit var player: Player
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)!!
        //league = intent.getStringExtra(EXTRA_LEAGUE).toString()
        //league = intent.getStringExtra(EXTRA_LEAGUE)
    }
    fun onBeginnerClicked(view: View){
        ballaerbtn.isChecked = false
        player.skills = "Beginner"
    }

    fun onBallerClicked(view: View){
        biginnerbtn.isChecked = false
        player.skills = "Baller"
    }
    
    fun onFinishClicked(view: View){
        if (player.skills != ""){
            val finishActivity = Intent(this ,FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER,player)
            //finishActivity.putExtra(EXTRA_LEAGUE ,league)
            //finishActivity.putExtra(EXTRA_SKILL , skills)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "please select the skill level ....", Toast.LENGTH_SHORT).show()
        }

    }
}