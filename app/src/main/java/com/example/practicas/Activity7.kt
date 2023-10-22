package com.example.practicas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast


class Activity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_7)

        val next: Button = findViewById(R.id.Next)
        val last: Button = findViewById(R.id.Last)

        next.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, Activity8::class.java)
            startActivity(intent)
        })
        last.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, Activity6::class.java)
            startActivity(intent)
        })

    }
}