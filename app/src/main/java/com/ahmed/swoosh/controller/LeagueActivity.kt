package com.ahmed.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.ahmed.swoosh.EXTRA_LEAGUE
import com.ahmed.swoosh.EXTRA_PLAYER
import com.ahmed.swoosh.R
import com.ahmed.swoosh.model.Player
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    //var selectedLeague =""
    var player = Player("","")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
        }

        fun onMensClicked(view: View){
            womensbtn.isChecked = false
            coedbtn.isChecked = false
            player.league = "Mens"
        }

        fun onWomensClicked(view: View){
            mensbtn.isChecked = false
            coedbtn.isChecked = false
            player.league = "Women's "
        }

        fun onCoedClicked(view: View){
            mensbtn.isChecked = false
            womensbtn.isChecked = false
            player.league = "Co-ed"
        }

       fun leagueNextClicked(view: View){
           if(player.league != ""){
               val skillActivity = Intent(this, SkillActivity ::class.java)
               skillActivity.putExtra(EXTRA_PLAYER ,player)
               startActivity(skillActivity)
           } else{
               Toast.makeText(this, "please select the league", Toast.LENGTH_SHORT).show()
           }
       }
}