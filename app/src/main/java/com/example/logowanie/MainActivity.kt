package com.example.logowanie

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.submit).setOnClickListener {
            val password1 = findViewById<EditText>(R.id.password1)
            val password2 = findViewById<EditText>(R.id.password2)
            if (password1.text.toString() == password2.text.toString()) {

                findViewById<TextView>(R.id.compatible).text = "zgodne"
            }
            if (password1.text.toString() != password2.text.toString()) {
                findViewById<TextView>(R.id.compatible).text = "nie zgodne"
            }

        }
    }
}


