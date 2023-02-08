package com.example.whats

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        android.os.Handler().postDelayed({display()},3000)

    }
    private fun display()
    {
        startActivity(Intent(this,MainActivity::class.java))
        finish()
    }
}