package com.example.languageapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
// Класс, в котором запускаем onboard3, если нажата кнопка more, или languageSelect, если skip
class onboard2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboard2)

        val textView: TextView = findViewById(R.id.textView)
        textView.setOnClickListener {
            startActivity(Intent(this@onboard2, LanguageSelect::class.java))
        }

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            startActivity(Intent(this@onboard2, onboard3::class.java))
        }
    }
}