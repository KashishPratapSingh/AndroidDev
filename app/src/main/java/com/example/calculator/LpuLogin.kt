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
import com.google.android.material.snackbar.Snackbar

class LpuLogin : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lpu_login)
        var editText=findViewById<EditText>(R.id.et)
        val signUp=findViewById<Button>(R.id.signUP)
        val read=findViewById<Button>(R.id.read)
        signUp.setOnClickListener{
            val a=editText.text.toString()
            val b=a.toInt()
            Log.w("Tag","My logging")
            Toast.makeText(this,"Log In Successful",Toast.LENGTH_SHORT).show()
        }
        read.setOnClickListener{view ->
            Snackbar.make(view,"Welcome to LPU",Snackbar.LENGTH_LONG).setAction("view"){
                val i= Intent(this,LogosActivity::class.java)
                startActivity(i)
            }.show()
        }

    }
}