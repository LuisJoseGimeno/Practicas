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


class Activity15 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_15)

        val next: Button = findViewById(R.id.Next)
        val last: Button = findViewById(R.id.Last)
        val hombre: RadioButton = findViewById(R.id.Hombre)
        val mujer: RadioButton = findViewById(R.id.Mujer)
        next.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, Activity16::class.java)
            startActivity(intent)
        })
        last.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, Activity14::class.java)
            startActivity(intent)
        })
        val message: Button = findViewById(R.id.Alert)

        message.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "Registre complet", Toast.LENGTH_SHORT).show()
        })
        hombre.setOnClickListener(View.OnClickListener {
            mujer.isChecked = false;
        })
        mujer.setOnClickListener(View.OnClickListener {
            hombre.isChecked = false;
        })
    }
}