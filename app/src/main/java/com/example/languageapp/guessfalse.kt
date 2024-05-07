package com.example.languageapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class GuessFalse : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.guessfalse)

        val correctAnswer = intent.getStringExtra("correctAnswer") ?: "turtle"
        val textViewCorrect = findViewById<TextView>(R.id.textView18)
        textViewCorrect.text = "That is: $correctAnswer"

        val imageView = findViewById<ImageView>(R.id.imageView4)

        findViewById<Button>(R.id.tryAgainButton).setOnClickListener {
            startActivity(Intent(this, Guess::class.java))
        }

        findViewById<Button>(R.id.nextButton).setOnClickListener {
            startActivity(Intent(this, Guess::class.java))
        }

        findViewById<Button>(R.id.back_button_login).setOnClickListener {
            startActivity(Intent(this, Main::class.java))
        }
    }
}
