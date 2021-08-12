package com.ahmed.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.ahmed.swoosh.EXTRA_LEAGUE
import com.ahmed.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague =""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

        /*leagueNextButton.setOnClickListener {
          val skillIntent = Intent(this,SkillActivity::class.java)
          startActivity(skillIntent)
         }*/
    }

        fun onMensClicked(view: View){
            womensbtn.isChecked = false
            coedbtn.isChecked = false
            selectedLeague = "Mens"
        }

        fun onWomensClicked(view: View){
            mensbtn.isChecked = false
            coedbtn.isChecked = false
            selectedLeague = "Women's "
        }

        fun onCoedClicked(view: View){
            mensbtn.isChecked = false
            womensbtn.isChecked = false
            selectedLeague = "Co-ed"
        }

       fun leagueNextClicked(view: View){
           if(selectedLeague != ""){
               val skillActivity = Intent(this, SkillActivity ::class.java)
               skillActivity.putExtra(EXTRA_LEAGUE , selectedLeague)
               startActivity(skillActivity)
           } else{
               Toast.makeText(this, "please select the league", Toast.LENGTH_SHORT).show()
           }
       }
}