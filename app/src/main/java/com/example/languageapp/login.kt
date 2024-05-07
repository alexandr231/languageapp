package com.example.languageapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val backImageView: ImageView = findViewById(R.id.back)
        val loginButton: Button = findViewById(R.id.button2)
        val signUpTextView: TextView = findViewById(R.id.textSignup)

        backImageView.setOnClickListener {
            val backIntent = Intent(this@Login, LanguageSelect::class.java)
            startActivity(backIntent)
        }

        loginButton.setOnClickListener {
            val loginIntent = Intent(this@Login, Main::class.java)
            startActivity(loginIntent)
        }

        signUpTextView.setOnClickListener {
            val signUpIntent = Intent(this@Login, Signup::class.java)
            startActivity(signUpIntent)
        }
    }
}
