package com.example.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val clickbtn = findViewById<Button>(R.id.btnClicked)
        val myText = findViewById<TextView>(R.id.TVApp)
            var timesClicked = 0
        clickbtn.setOnClickListener {
            timesClicked += 1
            myText.text = timesClicked.toString()
            Toast.makeText(this, "hi sam", Toast.LENGTH_SHORT).show()

        }
    }
}

fun main(args:Array<String>) {}