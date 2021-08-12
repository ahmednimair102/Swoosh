package com.ahmed.swoosh

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
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
            selectedLeague = "mens"
        }

        fun onWomensClicked(view: View){
            mensbtn.isChecked = false
            coedbtn.isChecked = false
            selectedLeague = "womens "
        }

        fun onCoedClicked(view: View){
            mensbtn.isChecked = false
            womensbtn.isChecked = false
            selectedLeague = "co-ed"
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