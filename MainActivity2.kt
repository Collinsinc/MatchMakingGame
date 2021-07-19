package com.example.matchmaking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*



class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        button2.setOnClickListener {
            if(TextUtils.isEmpty(name1.text.toString())) {
                Toast.makeText(this, "PLEASE ENTER YOUR NAME", Toast.LENGTH_LONG).show()
            }
            else {

                var nextpage = Intent(this, GameMode::class.java)
                nextpage.putExtra("name", name1.text.toString())
                startActivity(nextpage)
            }
        }
    }
}