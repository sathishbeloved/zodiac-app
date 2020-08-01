package com.beloved.zodiacc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class splash_screen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed(
            {
                intent = Intent(this,MainActivity::class.java)

                startActivity(intent)

            },
            1000 // value in milliseconds
        )


    }
}
