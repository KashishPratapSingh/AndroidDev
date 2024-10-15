package com.example.calculator

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignUpPage : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_up_page)
        var et1=findViewById<EditText>(R.id.et1)
        var et2=findViewById<EditText>(R.id.et2)
        var et3=findViewById<EditText>(R.id.et3)
        var et4=findViewById<EditText>(R.id.et4)
        var checkBox=findViewById<CheckBox>(R.id.cb)
        var btn0=findViewById<Button>(R.id.btn0)
        btn0.setOnClickListener{
            val a=et1.text.toString()
            val b=et2.text.toString()
            val c=et3.text.toString()
            val d=c.toInt()
            val e=et4.text.toString()
            val f=checkBox.isChecked
            Toast.makeText(this,"All info have been saved", Toast.LENGTH_SHORT).show()
            val intent= Intent(this,LoginClick::class.java)
            startActivity(intent)
        }
    }
}