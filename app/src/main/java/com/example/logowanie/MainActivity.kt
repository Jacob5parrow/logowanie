package com.example.logowanie

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.submit).setOnClickListener {
            val password1 = findViewById<EditText>(R.id.password1)
            val password2 = findViewById<EditText>(R.id.password2)
            var password = ""

            findViewById<EditText>(R.id.password1).hint = ""
            findViewById<EditText>(R.id.password2).hint = ""

            findViewById<TextView>(R.id.check).setTextColor(Color.WHITE)
            findViewById<TextView>(R.id.upperLetter).setTextColor(Color.WHITE)
            findViewById<TextView>(R.id.lowerLetter).setTextColor(Color.WHITE)
            findViewById<TextView>(R.id.number).setTextColor(Color.WHITE)
            findViewById<TextView>(R.id.special).setTextColor(Color.WHITE)


            if (password1.text.toString().isEmpty())
            {
                findViewById<EditText>(R.id.password1).hint = "pole nie może być puste"

            }

            if (password2.text.toString().isEmpty())
            {
                findViewById<EditText>(R.id.password2).hint = "pole nie może być puste"
            }

            else
            {

                if (password1.text.toString() == password2.text.toString())
                {
                    findViewById<TextView>(R.id.check).setTextColor(Color.GREEN)
                    password = password1.text.toString()
                }
                if (password1.text.toString() != password2.text.toString())
                {
                    findViewById<TextView>(R.id.check).setTextColor(Color.RED)
                }

                if (password.any{it.isUpperCase()})
                {
                    findViewById<TextView>(R.id.upperLetter).setTextColor(Color.GREEN)
                }


                if (password.any{it.isLowerCase()})
                {
                    findViewById<TextView>(R.id.lowerLetter).setTextColor(Color.GREEN)
                }

                if (password.any{it.isDigit()})
                {
                    findViewById<TextView>(R.id.number).setTextColor(Color.GREEN)
                }

                val specialChars = "!@#$%^&*()_+-=?"

                if (password.any { specialChars.contains(it) })
                {
                    findViewById<TextView>(R.id.special).setTextColor(Color.GREEN)
                }







            }


        }



    }
}








