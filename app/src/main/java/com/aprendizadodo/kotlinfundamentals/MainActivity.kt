package com.aprendizadodo.kotlinfundamentals

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        roll_button.setOnClickListener { rollDice() }

        clear_button.setOnClickListener { clearDice() }

    }

    private fun clearDice(){
        dice_image.setImageResource(R.drawable.empty_dice)
        dice_image2.setImageResource(R.drawable.empty_dice)
    }

    private fun rollDice() {

        dice_image.setImageResource(sortDice())
        dice_image2.setImageResource(sortDice())
    }

    private fun sortDice(): Int{

        return when((1..6).random()){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }
}