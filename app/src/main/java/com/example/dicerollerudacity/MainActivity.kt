package com.example.dicerollerudacity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var diceImage1: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollBtn: Button = findViewById(R.id.btn_roll)

        rollBtn.text = "Let's roll"


        rollBtn.setOnClickListener{
            Toast.makeText(this, "gay detected", Toast.LENGTH_SHORT).show()
            rolDice()
        }
    }

    private fun rolDice() {


        val ranInt = Random.nextInt(6) + 1
        val drawableResource = when(ranInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else ->  R.drawable.dice_6
        }

        diceImage1 = findViewById(R.id.iv_dice1)
        diceImage1.setImageResource(drawableResource)
    }
}