package com.example.project_1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    lateinit var diceImage: ImageView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button =findViewById(R.id.roll_button)
        rollButton.text="CLICK"

        rollButton.setOnClickListener{
            Toast.makeText(this,"dice rolled",Toast.LENGTH_SHORT).show()
            rollDice()
        }
        diceImage= findViewById(R.id.dice_image)
    }

    @SuppressLint("SetTextI18n")
    private fun rollDice(){
        val resultText: TextView = findViewById(R.id.result_text)
        val randomInt= Random().nextInt(6) +1;
        resultText.text= randomInt.toString()

        val drawableResource = when(randomInt){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
    }
}

//                                              *****explained code*****

//package com.example.project_1
//
//import android.annotation.SuppressLint
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.widget.Button
//import android.widget.ImageView
//import android.widget.TextView
//import android.widget.Toast
//import java.util.*
//
//class MainActivity : AppCompatActivity() {                        // all the functions are executed in this class
//                                                                  // AppCompactActivity is parent class of main activity
//    @SuppressLint("SetTextI18n")
//
//    lateinit var diceImage: ImageView                             // a variable of image view is formed and image view imported
//                                                                  // when we don't know the initial value we use 'late init' keyword
//    @SuppressLint("SetTextI18n")
//    // function which runs in MainActivity
//    // override used as we are defining our own function not using statements of function present in AppCompatActivity
//    override fun onCreate(savedInstanceState: Bundle?) {          // this function runs when app is opened
//        super.onCreate(savedInstanceState)                        // super keyword help in running the function statement of OnCreate present in AppCompatActivity
//        setContentView(R.layout.activity_main)                    // this method inflate the views of activity_main
//
//        // set text to button
//        val rollButton: Button =findViewById(R.id.roll_button)    // a variable of button type is made
//        // all the id's of the different views(imageView,button...) are present in R class and from that we have to get the path
//        // rollButton is inflated to activity_main button using findViewById by passing it's id in it
//        rollButton.text="CLICK"                                   // now when app runs then button text value will be Click
//
//        // operations to be done after clicking the button using 'setOnClickListener' function
//        rollButton.setOnClickListener{                     // this function executes the changes that we want to occur after clicking the button
//            Toast.makeText(this,"dice rolled",Toast.LENGTH_SHORT).show()
//            rollDice()                                            // an outer function is called in this to be executed
//        }
//        diceImage= findViewById(R.id.dice_image)                  // dice image is defined
//    }
//    @SuppressLint("SetTextI18n")
//    private fun rollDice(){                                       // this function is used after clicking the button
//
//        // set result text view--
//        val resultText: TextView = findViewById(R.id.result_text) // result text view is inflated
//        val randomInt= Random().nextInt(6) +1;              // a random int variable is defined such that it take random values from 0 to 5
//        resultText.text= randomInt.toString()                     // in result text that value will be updated by changing it to string
//
//        // set image view--
//        val drawableResource = when(randomInt){                   // a variable is defined which will store the address of each dice according to it's number
//            1->R.drawable.dice_1
//            2->R.drawable.dice_2
//            3->R.drawable.dice_3
//            4->R.drawable.dice_4
//            5->R.drawable.dice_5
//            else->R.drawable.dice_6
//        }
//        //val diceImage: ImageView =findViewById(R.id.dice_image)  // this will called every time so to make efficient code definting it above
//        diceImage.setImageResource(drawableResource)               // now at last we will set image according to our random number
//    }
//}
