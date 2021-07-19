package com.example.matchmaking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_game_mode.*
import kotlinx.android.synthetic.main.activity_main2.*

class GameMode : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_mode)

        val profileName=intent.getStringExtra("name")

        btn1.setOnClickListener{
            var nextpage = Intent(this,Game3x3::class.java)
            nextpage.putExtra("name", profileName)
            startActivity(nextpage)
        }

        btn2.setOnClickListener{
            var ntge = Intent(this,Game3x4::class.java)
            ntge.putExtra("name", profileName)
            startActivity(ntge)
        }
    }
}