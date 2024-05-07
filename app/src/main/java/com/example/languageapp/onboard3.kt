package com.example.languageapp

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
// Класс, в котором запускаем languageSelect
class onboard3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboard3)

        val textView: TextView = findViewById(R.id.textView)
        textView.setOnClickListener {
            startActivity(Intent(this@onboard3, LanguageSelect::class.java))
        }

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            startActivity(Intent(this@onboard3, LanguageSelect::class.java))
        }
    }
}