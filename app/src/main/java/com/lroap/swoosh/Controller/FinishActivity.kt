package com.lroap.swoosh.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lroap.swoosh.Model.Player
import com.lroap.swoosh.R
import com.lroap.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)
//        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeaguesText.text = "Looking for ${player.league} ${player.skill} league near you..."
    }
}
