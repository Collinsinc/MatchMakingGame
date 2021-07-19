package com.example.matchmaking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welldone.*


class Welldone : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welldone)


        val profileName=intent.getStringExtra("name")
        var txt="WellDone,"+profileName
        welldonetext.setText(txt)



        playagain.setOnClickListener {
            this.finish()
        }

        mode.setOnClickListener {
            var mode = Intent(this,GameMode::class.java)
            startActivity(mode)
        }



    }
}