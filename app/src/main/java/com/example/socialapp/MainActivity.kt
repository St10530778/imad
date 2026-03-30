package com.example.socialapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //Declarations
        //Module maunal
        val etTime = findViewById<EditText>(R.id.etTime)
        val tvResult = findViewById<TextView>(R.id.tvResult)
        val btnEnter = findViewById<Button>(R.id.button)
        val btnRest = findViewById<Button>(R.id.button2)

        //logic
        //  Steven imad class
        btnEnter.setOnClickListener {
            val timeOfDay = etTime.text.toString().lowercase()
            var output: String = String()
            // module manual
            if (timeOfDay == "morning"){
                output = "Send a good morning text"
                tvResult.text = output
            } else {
                if (timeOfDay == "mid morning") {
                    output = "Reach out to a colleague with a quick 'Thank you' "
                    tvResult.text = output
                }
            }
            // module manual
            if (timeOfDay =="afternoon snack time") {
                output = "send a qucik'thinking of you'message"
                tvResult.text = output}




                }
            }
        }


