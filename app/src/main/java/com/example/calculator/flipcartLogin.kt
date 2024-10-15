package com.example.calculator

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class flipcartLogin : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_flipcart_login)
        var userName = findViewById<EditText>(R.id.et1)
        var password = findViewById<EditText>(R.id.et2)
        var btn = findViewById<Button>(R.id.btn)
        var btn2=findViewById<Button>(R.id.btn2)
        btn.setOnClickListener {
            val a = userName.text.toString()
            val b = password.setText(null)
            Log.i("User Credentials", "UserName $a Password $b")
            Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
            val intent= Intent(this,LoginClick::class.java)
            startActivity(intent)
        }
        btn2.setOnClickListener{
            val intent=Intent(this, SignUpPage::class.java)
            startActivity(intent)
        }
    }
}