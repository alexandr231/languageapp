package com.example.languageapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Signup : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup)

        val backImageView: ImageView = findViewById(R.id.back)
        val continueButton: Button = findViewById(R.id.button2)
        val loginTextView: TextView = findViewById(R.id.textLogin)

        backImageView.setOnClickListener {
            val backIntent = Intent(this@Signup, Login::class.java)
            startActivity(backIntent)
        }

        continueButton.setOnClickListener {
            val continueIntent = Intent(this@Signup, Signup2::class.java)
            startActivity(continueIntent)
        }

        loginTextView.setOnClickListener {
            val loginIntent = Intent(this@Signup, Login::class.java)
            startActivity(loginIntent)
        }
    }
}
