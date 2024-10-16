package com.example.calculator

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import android.widget.Toolbar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PracticeMenu : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.activity_practice_menu)
        val t=findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        setSupportActionBar(t)
    }


    override fun onCreateOptionsMenu(menu: Menu):Boolean {
        menuInflater.inflate(R.menu.practice, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem):Boolean{
        return when(item.itemId){
            R.id.setting ->{
                Toast.makeText(this,"Setting open",Toast.LENGTH_SHORT).show()
                true
            }
            R.id.email->{
                val i=Intent(Intent.ACTION_SENDTO)
                i.data= Uri.parse("mailto:singhkashishpratap@gmail.com")
                startActivity(i)
                true
            }
            R.id.contact->{
                val i=Intent(Intent.ACTION_DIAL)
                i.data=Uri.parse("tel:6398753193")
                startActivity(i)
                true
            }
            else->super.onOptionsItemSelected(item)
        }
    }
}