package com.example.diceroller

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
class MainActivityTest(val expected: Int, val number: Int  , scenario: String) {

    companion object {
        private var randomPickedNumber = -2
        private var lastRandom = 0


        @JvmStatic
        @Parameterized.Parameters(name = "rollDice: (2)")
        fun todos() = listOf(
            arrayOf(R.drawable.dice_1,2,"random number"),
            arrayOf(R.drawable.dice_2,2,"random number"),
            arrayOf(R.drawable.dice_3,3,"random number"),
            arrayOf(R.drawable.dice_4,4,"random number"),
            arrayOf(R.drawable.dice_5,5,"random number"),
            arrayOf(R.drawable.dice_6,6,"random number"),
            arrayOf(R.drawable.empty_dice,7,"random number")
        )

    }

    @Test
    fun test_rollDice()
    {
        val actual = rollDice(number)

        assertEquals(R.drawable.empty_dice,actual)

    }

    @Test
    fun test_rollDiceRandom()
    {
        val actual = rollDice(number)

        randomPickedNumber = 0

        assertEquals(R.drawable.empty_dice,actual)

    }


}