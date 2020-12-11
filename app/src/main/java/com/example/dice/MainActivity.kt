package com.example.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton:Button=findViewById(R.id.button)
        rollButton.setOnClickListener{
            rollDice()
        }
    }

    private fun rollDice() {
        val myFirstDice =Dice(6)
        val r=myFirstDice.roll()
        val resT:TextView=findViewById(R.id.textView)
        resT.text=r.toString()
    }
}
class Dice(val numofSides : Int){
    fun roll():Int
    {
        return (1..numofSides).random()

    }
}