package com.example.diceroller


var randomPickedNumber :Int = 0
var lastRandom = 0

fun rollDice(number: Int):Int {

     randomPickedNumber = -2
     lastRandom = 0

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

    //rollImage.setImageResource(imageId)

    return imageId


}