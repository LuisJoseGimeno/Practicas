package com.example.practicas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val next: Button = findViewById(R.id.Next)
        val last: Button = findViewById(R.id.Last)

        next.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, Activity3::class.java)
            startActivity(intent)
        })
        last.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        })
    }
}