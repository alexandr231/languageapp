package com.example.languageapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Signup2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup2)

        val backImageView: ImageView = findViewById(R.id.back)
        val signupButton: Button = findViewById(R.id.button2)
        val loginTextView: TextView = findViewById(R.id.textLogin)

        backImageView.setOnClickListener {
            val backIntent = Intent(this@Signup2, Signup::class.java)
            startActivity(backIntent)
        }

        signupButton.setOnClickListener {
            val signupIntent = Intent(this@Signup2, Login::class.java)
            startActivity(signupIntent)
        }

        loginTextView.setOnClickListener {
            val loginIntent = Intent(this@Signup2, Login::class.java)
            startActivity(loginIntent)
        }
    }
}