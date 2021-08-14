package com.ahmed.swoosh.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ahmed.swoosh.EXTRA_PLAYER
import com.ahmed.swoosh.R
import com.ahmed.swoosh.model.Player
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        var player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)
        //val league = intent.getStringExtra(EXTRA_LEAGUE)
        //val skills = intent.getStringExtra(EXTRA_SKILL)

        searchLeagueText.text = "Looking for ${player!!.league} ${player!!.skills} league near you....."
    }
}