package com.example.languageapp
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Guesstrue : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.guesstrue)

        val nextButton = findViewById<Button>(R.id.nextButton)
        val backButton = findViewById<Button>(R.id.back_button_login)

        nextButton.setOnClickListener {
            startActivity(Intent(this, Guess::class.java))
        }

        backButton.setOnClickListener {
            startActivity(Intent(this, Main::class.java))
        }
    }
}