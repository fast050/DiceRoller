package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView


class MainActivity : AppCompatActivity() {

    private lateinit var rollButton: Button
    private lateinit var rollImage: ImageView
    private var randomPickedNumber = -2
    private var lastRandom=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rollButton = findViewById(R.id.roll_button)
        rollImage = findViewById(R.id.roll_image)

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("key_random", randomPickedNumber)



    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        randomPickedNumber = savedInstanceState.getInt("key_random", 0)
        rollDice(randomPickedNumber)



    }

    override fun onResume() {
        super.onResume()
        println("OnResume")

        rollButton.setOnClickListener {
            rollDice()
        }
    }

     private fun rollDice(number: Int=-1) {


        while (randomPickedNumber==lastRandom)
            randomPickedNumber = if (number == -1) (1..6).random() else number

        val imageId = when (randomPickedNumber) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }

        lastRandom=randomPickedNumber

        rollImage.setImageResource(imageId)

    }

  }