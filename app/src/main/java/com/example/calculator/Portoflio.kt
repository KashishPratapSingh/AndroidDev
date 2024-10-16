package com.example.calculator

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toolbar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Portoflio : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_portoflio)
        var t=findViewById<Toolbar>(R.id.toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.portofolio,menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean{
        return when(item.itemId){
            R.id.email->{
                val i= Intent(Intent.ACTION_VIEW)
                i.data= Uri.parse("singhkashishpratap@gmail.com")
                startActivity(i)
                true
            }
            R.id.contact->{
                val i= Intent(Intent.ACTION_DIAL)
                i.data= Uri.parse("tel:6398753193")
                startActivity(i)
                true
            }
            R.id.feedback->{
//                val i= Intent(this,Feedback::class.java)
//                startActivity(i)
                true
            }
            else->{
                super.onOptionsItemSelected(item)
            }
        }
    }
}