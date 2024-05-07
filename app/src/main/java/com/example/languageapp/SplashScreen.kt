package com.example.languageapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.content.Context
import androidx.appcompat.app.AppCompatActivity

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)

        // Задержка перед запуском следующей активности
        Handler(Looper.getMainLooper()).postDelayed({
            // Проверяем, был ли это первый запуск приложения
            if (isFirstRun()) {
                // Если да, открываем onboard1 и обновляем флаг первого запуска
                startActivity(Intent(this@SplashScreen, onboard1::class.java))
                updateFirstRun()
            } else {
                // Если нет, продолжаем с Login
                startActivity(Intent(this@SplashScreen, Login::class.java))
            }
            finish()
        }, 3000)
    }

    private fun isFirstRun(): Boolean {
        // Получаем SharedPreferences
        val sharedPrefs = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
        // Проверяем, есть ли уже флаг первого запуска
        return sharedPrefs.getBoolean("isFirstRun", true)
    }

    private fun updateFirstRun() {
        // Получаем SharedPreferences
        val sharedPrefs = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
        with(sharedPrefs.edit()) {
            // Устанавливаем флаг первого запуска в false
            putBoolean("isFirstRun", false)
            apply()
        }
    }
}
