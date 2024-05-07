package com.example.languageapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class LanguageSelect : AppCompatActivity() {

    private lateinit var russianButton: Button
    private lateinit var chineseButton: Button
    private lateinit var englishButton: Button
    private lateinit var kazakhButton: Button
    private lateinit var belarusButton: Button
    private lateinit var chooseButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.languageselect)

        // Инициализируем кнопки
        russianButton = findViewById(R.id.russian_button)
        chineseButton = findViewById(R.id.chinese_button)
        englishButton = findViewById(R.id.english_button)
        kazakhButton = findViewById(R.id.kazakh_button)
        belarusButton = findViewById(R.id.belarus_button)
        chooseButton = findViewById(R.id.choose_button)

        // Ставим стандартный язык
        setActiveButton(russianButton)

        // Добавляем обработчики кликов
        russianButton.setOnClickListener { setActiveButton(it as Button) }
        chineseButton.setOnClickListener { setActiveButton(it as Button) }
        englishButton.setOnClickListener { setActiveButton(it as Button) }
        kazakhButton.setOnClickListener { setActiveButton(it as Button) }
        belarusButton.setOnClickListener { setActiveButton(it as Button) }

        // Переходим на другой экран по клику на кнопку
        chooseButton.setOnClickListener {
            val intent = Intent(this@LanguageSelect, Login::class.java)
            startActivity(intent)
        }
    }

    private fun setActiveButton(activeButton: Button) {
        // Сбрасываем остальные кнопки
        listOf(russianButton, chineseButton, englishButton, kazakhButton, belarusButton).forEach {
            it.background = ContextCompat.getDrawable(this@LanguageSelect, R.drawable.buttonnotselected)
        }
        // Делаем активной кнопку, по которой кликнули
        activeButton.background = ContextCompat.getDrawable(this@LanguageSelect, R.drawable.buttonlang)
    }
}