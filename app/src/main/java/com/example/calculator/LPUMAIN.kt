package com.example.calculator

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LPUMAIN : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lpumain)
        var btn=findViewById<ImageButton>(R.id.img1)
        btn.setOnClickListener{
            val i= Intent(this, LogosActivity::class.java)
            startActivity(i)
        }
    }
}