package com.ahmed.swoosh.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ahmed.swoosh.EXTRA_LEAGUE
import com.ahmed.swoosh.EXTRA_SKILL
import com.ahmed.swoosh.R
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skills = intent.getStringExtra(EXTRA_SKILL)

        searchLeagueText.text = "looking for $league $skills league near you ..... "
    }
}