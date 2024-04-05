package com.example.assignmentv2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.String

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Initialise the codes
        val textInput = findViewById<EditText>(R.id.EditText)
        val button2 = findViewById<Button>(R.id.button2)
        val textView2 = findViewById<TextView>(R.id.textView2)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            //Clear the text of textInput and textView2
            textView2.text = ""
            textInput.text.clear()
        }


            button2?.setOnClickListener {

                //Initialise message with a default value
                var message: String = ""

                val text: Int = textInput.text.toString().toInt()

                if (text in 20..29) {
                    message =
                        "Famous actor, Cameron Boyce, died the the age of 20 due to a seizure which was a result of an ongoing medical condition."

                } else if (text in 30..39) {
                    message =
                        "Princess Diana of Wales and mother of 2 died at the age of 36 in a car accident."

                } else if (text in 40..49) {
                    message =
                        "Elvis Presley AKA The King of Rock died due to a drug overdose at the age of 42."

                } else if (text in 50..55) {
                    message =
                        "World famous American Singer Micheal Jackson died of acute propofol intoxication at the age of 50."

                } else if (text in 56..59) {
                    message =
                        "The 16th President of the United States, Abraham Lincoln was assassinated at the age of 56."

                } else if (text in 60..69) {
                    message =
                        "Grammy award winner Tom Petty died at the age of 66 due to cardiac arrest."

                } else if (text in 70..79) {
                    message =
                        "Developer of Differential Calculus Gottfried W. Leibniz died at the age of 70 due to gout and arthritis."

                } else if (text in 80..89) {
                    message =
                        "The most kindest woman in the world, Mother Theresa, passed away due to old age at 87 years old."

                } else if (text in 90..94) {
                    message =
                        "Archbishop Desmond Tutu passed away due to old age at the age of 90 years old. "

                } else if (text in 95..100) {
                    message =
                        "The first President of South Africa Nelson Mandela passed away due to a respiratory tract infection the age of 95."

                } else {
                    message = "This age is out of range"
                }
                textView2.text = message
            }

        }
    }


