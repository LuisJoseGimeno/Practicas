package com.example.practicas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val next: Button = findViewById(R.id.Next)

        next.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, Activity2::class.java)
            startActivity(intent)
        })
    }
}