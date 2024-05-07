package com.example.languageapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class Guess : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.guess)

        val animals = arrayOf("turtle", "bear", "rabbit")
        val images = arrayOf(R.drawable.turtle, R.drawable.bear, R.drawable.rabbit)

        val imageView = findViewById<ImageView>(R.id.imageView3)
        val randomIndex = Random.nextInt(animals.size)
        imageView.setImageResource(images[randomIndex])

        val buttonGuess = findViewById<Button>(R.id.buttonGuess)
        val editTextGuess = findViewById<EditText>(R.id.editTextGuess)

        buttonGuess.setOnClickListener {
            val userGuess = editTextGuess.text.toString().lowercase().trim()
            if (userGuess == animals[randomIndex]) {
                startActivity(Intent(this, Guesstrue::class.java))
            } else {
                val intent = Intent(this, GuessFalse::class.java)
                intent.putExtra("correctAnswer", animals[randomIndex])
                startActivity(intent)
            }
        }
    }
}