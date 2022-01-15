package com.example.diceroller

import org.junit.Assert.*
import org.junit.Test

class RollDiceTest
{
    //naming of function subjectUnderTesting_action_result
    @Test
    fun rollDice_region1to6_returnTrueFalse()
    {
        //aaa arrange , act , assert

        val listOfIDs = listOf(
                 R.drawable.dice_1,
                 R.drawable.dice_6,
                 R.drawable.dice_2,
                 R.drawable.dice_3,
                 R.drawable.dice_4,
                 R.drawable.dice_5,
                 R.drawable.empty_dice
           )

        val randomId= rollDice()

        assertTrue("The value of rollResult was not between 1 and 6", randomId in listOfIDs)


    }
}