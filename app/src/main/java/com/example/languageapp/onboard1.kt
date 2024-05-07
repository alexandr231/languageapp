package com.example.languageapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
// Класс, в котором запускаем onboard2, если нажата кнопка next, или languageSelect, если skip
class onboard1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboard1)

        val textView: TextView = findViewById(R.id.textView)
        textView.setOnClickListener {
            startActivity(Intent(this@onboard1, LanguageSelect::class.java))
        }

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            startActivity(Intent(this@onboard1, onboard2::class.java))
        }
    }
}