package com.example.languageapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView

class Audition : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.audition)

        val backButton: ImageView = findViewById(R.id.back)
        val checkSpeechButton: Button = findViewById(R.id.buttonCheck)

        backButton.setOnClickListener {
            startActivity(Intent(this, Main::class.java))
        }

        checkSpeechButton.setOnClickListener {
            startActivity(Intent(this, Auditiontrue::class.java))
        }
    }
}
