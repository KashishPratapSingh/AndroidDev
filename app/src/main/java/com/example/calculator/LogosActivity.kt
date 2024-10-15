package com.example.calculator

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class LogosActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.activity_logos)
        var btn1=findViewById<ImageButton>(R.id.img1)
        var btn2=findViewById<ImageButton>(R.id.img2)
        var btn3=findViewById<ImageButton>(R.id.img3)
        var btn4=findViewById<ImageButton>(R.id.img4)
        var btn5=findViewById<ImageButton>(R.id.img5)
        var btn6=findViewById<ImageButton>(R.id.img6)
        var btn7=findViewById<ImageButton>(R.id.img7)
        var btn8=findViewById<ImageButton>(R.id.img8)
        var btn9=findViewById<ImageButton>(R.id.img9)
        btn1.setOnClickListener{
           Snackbar.make(it,"LPU CSE",Snackbar.LENGTH_LONG).setAction("View"){
               val i= Intent(this,LocaliseApp::class.java)
               Toast.makeText(this,"LPU CSE", Toast.LENGTH_SHORT).show()
               startActivity(i)
           }.show()
        }
        btn2.setOnClickListener {
            Snackbar.make(it, "LPU CIVIL", Snackbar.LENGTH_LONG).setAction("View") {
                Toast.makeText(this, "LPU CIVIL", Toast.LENGTH_SHORT).show()
            }.show()
        }
        btn3.setOnClickListener {
            Snackbar.make(it, "LPU MEC", Snackbar.LENGTH_LONG).setAction("View") {
                Toast.makeText(this, "LPU MEC", Toast.LENGTH_SHORT).show()
            }.show()
        }
        btn4.setOnClickListener {
            Snackbar.make(it, "LPU ECE", Snackbar.LENGTH_LONG).setAction("View") {
                Toast.makeText(this, "LPU ECE", Toast.LENGTH_SHORT).show()
            }.show()
        }
        btn5.setOnClickListener {
            Snackbar.make(it, "LPU AGRI", Snackbar.LENGTH_LONG).setAction("View") {
                Toast.makeText(this, "LPU AGRI", Toast.LENGTH_SHORT).show()
            }.show()
        }
        btn6.setOnClickListener {
            Snackbar.make(it, "LPU MBA", Snackbar.LENGTH_LONG).setAction("View") {
                Toast.makeText(this, "LPU MBA", Toast.LENGTH_SHORT).show()
            }.show()
        }
        btn7.setOnClickListener {
            Snackbar.make(it, "LPU CHE", Snackbar.LENGTH_LONG).setAction("View") {
                Toast.makeText(this, "LPU CHE", Toast.LENGTH_SHORT).show()
            }.show()
        }
        btn8.setOnClickListener {
            Snackbar.make(it, "LPU LAW", Snackbar.LENGTH_LONG).setAction("View") {
                Toast.makeText(this, "LPU LAW", Toast.LENGTH_SHORT).show()
            }.show()
        }
        btn9.setOnClickListener {
            Snackbar.make(it, "LPU PhyE", Snackbar.LENGTH_LONG).setAction("View") {
                Toast.makeText(this, "LPU PhyE", Toast.LENGTH_SHORT).show()
            }.show()
        }
    }
}