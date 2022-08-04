package com.example.lesson04android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.lesson04android.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            var counter = 0
            textCounter.text = counter.toString()

            textCounter.setOnClickListener {
                Toast.makeText(root.context, "some text", Toast.LENGTH_SHORT).show()
            }

            buttonPlus.setOnClickListener {
                textCounter.text = (++counter).toString()
            }
            buttonMinus.setOnClickListener {
                textCounter.text = (--counter).toString()
//                textCounter.text = editText.text.toString()
            }
        }
    }
}