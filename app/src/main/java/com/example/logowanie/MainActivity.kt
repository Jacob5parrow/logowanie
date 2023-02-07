package com.example.logowanie

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.submit).setOnClickListener {
            val password1 = findViewById<EditText>(R.id.password1)
            val password2 = findViewById<EditText>(R.id.password2)
            var x = 0
            var y = 0

            if (password1.text.toString().isEmpty())
            {
                findViewById<EditText>(R.id.password1).setHint("pole nie może być puste")
                x = 1
            }
            if (password2.text.toString().isEmpty())
            {
                findViewById<EditText>(R.id.password2).setHint("pole nie może być puste")
                y = 1
            }
            if (x == 1 && y == 1)
            {

            }

        }



    }
}








