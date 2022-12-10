package com.example.app1_kurtpastor

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Looper
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager


class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity:: class.java)
            startActivity(intent)
            finish()
        },2000)
    }
}