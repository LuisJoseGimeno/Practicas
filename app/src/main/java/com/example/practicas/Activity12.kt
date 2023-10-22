package com.example.practicas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast


class Activity12 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_12)

        val next: Button = findViewById(R.id.Next)
        val last: Button = findViewById(R.id.Last)

        next.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, Activity13::class.java)
            startActivity(intent)
        })
        last.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, Activity11::class.java)
            startActivity(intent)
        })
        val message: Button = findViewById(R.id.Alert)

        message.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "Registre complet", Toast.LENGTH_SHORT).show()
        })
    }
}