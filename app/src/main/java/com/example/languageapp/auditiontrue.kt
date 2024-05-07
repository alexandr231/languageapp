package com.example.languageapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Auditiontrue : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.auditiontrue)

        val backButton: ImageView = findViewById(R.id.back)
        backButton.setOnClickListener {
            startActivity(Intent(this, Main::class.java))
        }

        val nextButton: Button = findViewById(R.id.buttonNext)
        nextButton.setOnClickListener {
            startActivity(Intent(this, Audition::class.java))
        }
    }
}