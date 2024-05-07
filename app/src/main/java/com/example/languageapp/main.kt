package com.example.languageapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class Main : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)

        val guessTheAnimalButton: Button = findViewById(R.id.buttonGuessTheAnimal)
        val listeningButton: Button = findViewById(R.id.buttonListening)

        guessTheAnimalButton.setOnClickListener {
            val intent = Intent(this, Guess::class.java)
            startActivity(intent)
        }

        listeningButton.setOnClickListener {
            val intent = Intent(this, Audition::class.java)
            startActivity(intent)
        }
    }
}