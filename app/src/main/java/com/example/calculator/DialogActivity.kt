package com.example.calculator

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DialogActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dialog)
        val btn=findViewById<Button>(R.id.exitButton)
        btn.setOnClickListener{
            var b= AlertDialog.Builder(this,)
            b.setTitle("Exit")
            b.setMessage("Do you really want to exit?")
            b.setCancelable(false)
            b.setPositiveButton("Yes"){dialog,_ -> finish()}
            b.setNegativeButton("No"){dialog,_ -> dialog.dismiss()}
            b.create()
            b.show()
        }
    }
}