package com.example.calculator

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class SnackBar : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_snack_bar)
        val sid=findViewById<Button>(R.id.btn)
        sid.setOnClickListener{ view->
            Snackbar.make(view,"This is Snackbar",Snackbar.LENGTH_LONG).setAction("view"){
                Toast.makeText(this, "View was Clicked", Toast.LENGTH_LONG).show()
            }.show()
        }
    }
}