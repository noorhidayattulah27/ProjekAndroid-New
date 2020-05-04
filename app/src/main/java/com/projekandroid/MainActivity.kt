package com.projekandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView1 = findViewById<TextView>(R.id.textView1)

        textView1.setOnClickListener {
            Toast.makeText(this, "hai",  Toast.LENGTH_SHORT).show()

        }

        button1.setOnClickListener{
            val intent = intent(this@MainActivity,HitungActivity2::class.java)
            startActivity(intent)
        }


    }

}