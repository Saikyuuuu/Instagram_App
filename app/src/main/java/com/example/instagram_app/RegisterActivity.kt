package com.example.instagram_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

//        Dri pag i click ang register button mo adto sa login page
        val register = findViewById<TextView>(R.id.textView)
        register.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

//        Dri pag i click ang Already have an account mo balik sa login page
        val login = findViewById<TextView>(R.id.login)
        login.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}