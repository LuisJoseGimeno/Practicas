package com.example.practicas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView


class Activity9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_9)

        val next: Button = findViewById(R.id.Next)
        val last: Button = findViewById(R.id.Last)
        val mati: RadioButton = findViewById(R.id.Mati)
        val tarde: RadioButton = findViewById(R.id.Tarde)

        next.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, Activity10::class.java)
            startActivity(intent)
        })
        last.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, Activity8::class.java)
            startActivity(intent)
        })

        mati.setOnClickListener(View.OnClickListener {
            tarde.isChecked = false;
        })
        tarde.setOnClickListener(View.OnClickListener {
            mati.isChecked = false;
        })
    }
}