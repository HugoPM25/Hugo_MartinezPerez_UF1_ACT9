package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val botonA = findViewById<Button>(R.id.button4)
        val botonB = findViewById<Button>(R.id.button5)
        val botonC = findViewById<Button>(R.id.button6)

        botonA.setOnClickListener { CambiarActividad() }
        botonB.setOnClickListener { CambiarActividad() }
        botonC.setOnClickListener { CambiarActividad() }

    }

    public fun CambiarActividad() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

}
