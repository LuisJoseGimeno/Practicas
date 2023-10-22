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
        val last: Button = findViewById(R.id.Last)
        next.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, Activity2::class.java)
            startActivity(intent)
        })
        last.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, Activity21::class.java)
            startActivity(intent)
        })
    }
}