package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonA = findViewById<Button>(R.id.button)
        val botonB = findViewById<Button>(R.id.button2)
        val botonC = findViewById<Button>(R.id.button3)

        botonA.setOnClickListener { CambiarActividad() }
        botonB.setOnClickListener { CambiarActividad() }
        botonC.setOnClickListener { CambiarActividad() }

    }

    public fun CambiarActividad() {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

    }

