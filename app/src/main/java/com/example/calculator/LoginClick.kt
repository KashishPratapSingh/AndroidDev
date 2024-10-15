package com.example.calculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginClick : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login_click)
        var et1=findViewById<EditText>(R.id.et1)
        var ib1=findViewById<ImageButton>(R.id.ib)
        var ib2=findViewById<ImageButton>(R.id.ib2)
        var btn=findViewById<Button>(R.id.btn)
        var btn2=findViewById<Button>(R.id.btn2)
        btn.setOnClickListener{
            var a=et1.text.toString()
            var i= Intent(this,flipcartLogin::class.java)
            i.putExtra("userName",a)
            startActivity(i)
        }
        btn2.setOnClickListener{
            val i= Intent(this,SignUpPage::class.java)
            startActivity(i)
        }
    }
}