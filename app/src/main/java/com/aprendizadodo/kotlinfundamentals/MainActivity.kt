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

        add_button.setOnClickListener { addOne() }
    }

    private fun rollDice() {

        val randomInt = (1..6).random()
        result_text.text = randomInt.toString()
        Toast.makeText(this, getString(R.string.button_clicked), Toast.LENGTH_SHORT).show()
    }

    private fun addOne() {
        with(result_text) {
            if (text == getString(R.string.hello_world)) {

                text = context.getString(R.string.number_one)

            } else if (text.toString().toInt() < 6) {
                val addValue = text.toString().toInt() + 1

                text = addValue.toString()
            }

        }


    }
}