package com.hmlaker.pingpong

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            nextScreen()
        }, 2000L)
    }

    private fun nextScreen() {
        val nextScreen = Intent(this,
            Player::class.java)
        startActivity(nextScreen)
        finish()
    }
}