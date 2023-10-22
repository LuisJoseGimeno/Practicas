package com.example.practicas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast


class Activity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_6)

        val next: Button = findViewById(R.id.Next)
        val last: Button = findViewById(R.id.Last)

        next.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, Activity7::class.java)
            startActivity(intent)
        })
        last.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, Activity5::class.java)
            startActivity(intent)
        })

        val message: Button = findViewById(R.id.Message)

        message.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "Botón apretado", Toast.LENGTH_SHORT).show()
        })

    }
}