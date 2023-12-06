package com.sayson.menardjames.block6.p1.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var button : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button1)

        button.setOnClickListener(){
            Toast.makeText(this,"Button ito is clicked", Toast.LENGTH_SHORT).show()
        }
    }
}