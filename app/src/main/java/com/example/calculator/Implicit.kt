package com.example.calculator

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.ContactsContract
import android.provider.MediaStore
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class Implicit : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_implicit)
        var url=findViewById<Button>(R.id.btn1)
        var call=findViewById<Button>(R.id.btn2)
        var camera=findViewById<Button>(R.id.btn3)
        var contact=findViewById<Button>(R.id.btn4)
        var Battery=findViewById<Button>(R.id.btn5)
        url.setOnClickListener{
            var l=Intent(Intent.ACTION_VIEW)
            l.data= Uri.parse("https://www.youtube.com")
            startActivity(l)
        }
        call.setOnClickListener{
            var l=Intent(Intent.ACTION_DIAL)
            l.data= Uri.parse("tel:6398753193")
            startActivity(l)
        }
        camera.setOnClickListener { view ->
            Snackbar.make(view, "Welcome to LPU", Snackbar.LENGTH_LONG).setAction("view") {
                val l = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                startActivity(l)
            }.show()
        }
        contact.setOnClickListener{
            val l=Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI)
//            l.data= Uri.parse("content://contacts/people/")
            startActivity(l)
        }
        Battery.setOnClickListener{
            val i=Intent(Intent.ACTION_SENDTO)
            i.data= Uri.parse("mailto:singhkashishpratap@gmail.com")
            startActivity(i)
        }

    }
}