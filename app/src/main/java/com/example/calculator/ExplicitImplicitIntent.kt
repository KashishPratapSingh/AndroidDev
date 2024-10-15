package com.example.calculator

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ExplicitImplicitIntent : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_explicit_implicit_intent)
        val explicit_Intent=findViewById<Button>(R.id.btnE)
        val implicit_Intent=findViewById<Button>(R.id.btnI)

        implicit_Intent.setOnClickListener{
            val i= Intent(Intent.ACTION_VIEW)
            i.data=Uri.parse("https://www.flipkart.com/")
            startActivity(i)
        }

    }
}
// ACTION_VIEW --> FOR VIEWING SOMETHING
//ACTION_SEND --> TO SENDING A MESSAGE
// ACTION_DIAL
//ACTION_CALL