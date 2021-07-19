package com.example.matchmaking

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_game3x3.*
import com.example.matchmaking.R.drawable.*

class Game3x3 : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game3x3)

        val backcover = R.drawable.question
        var selected = 0
        var turnOver = false
        var lastClicked = -1

        val matchitems: MutableList<Int> =
            mutableListOf(baby,car,cat,house,baby,car,cat,dog,dog, house)

        val buttons = arrayOf(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8,
            btn9, btn0)



        matchitems.shuffle()

        for(i in 0..9){
            buttons[i].setBackgroundResource(backcover)
            buttons[i].text = "cardBack"
            buttons[i].textSize = 0.0F
            buttons[i].setOnClickListener {
                if (buttons[i].text == "cardBack" && !turnOver) {
                    buttons[i].setBackgroundResource(matchitems[i])
                    buttons[i].setText(matchitems[i])
                    if (selected == 0) {
                        lastClicked = i
                    }
                    selected++
                } else if (buttons[i].text !in "cardBack") {
                    buttons[i].setBackgroundResource(backcover)
                    buttons[i].text = "cardBack"
                    selected--
                }

                if (selected == 2) {
                    turnOver = true
                    if (buttons[i].text == buttons[lastClicked].text) {
                        buttons[i].isClickable = false
                        buttons[lastClicked].isClickable = false
                        turnOver = false
                        selected = 0
                    }
                } else if (selected == 0) {
                    turnOver = false
                }
            }
        }
        btnreset.setOnClickListener {
            finish();
            overridePendingTransition(0, 0);
            startActivity(getIntent());
            overridePendingTransition(0, 0);
        }
    }
}