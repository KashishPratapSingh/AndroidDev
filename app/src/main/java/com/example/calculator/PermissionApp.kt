package com.example.calculator

import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PermissionApp : AppCompatActivity() {
    var c=1
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_permission_app)
        val bt=findViewById<ImageButton>(R.id.imagebtn)
//        val i= Intent(MediaStore.ACTION_IMAGE_CAPTURE)
//        startActivity(i)
        bt.setOnClickListener{
            if(ContextCompat.checkSelfPermission(this,android.Manifest.permission.CAMERA)== PackageManager.PERMISSION_DENIED){
                ActivityCompat.requestPermissions(this,arrayOf(android.Manifest.permission.CAMERA),c)
            }
            else{
                Toast.makeText(this,"Permission already granted",Toast.LENGTH_SHORT).show()
            }
        }

    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode==c){
            if(grantResults[0]==PackageManager.PERMISSION_GRANTED){
                Toast.makeText(this,"Permission already granted",Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this,"Permission not granted or denied",Toast.LENGTH_SHORT).show()
            }
        }
    }
}