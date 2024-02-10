package com.example.instagram_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

//        Pag i click ang login mo adto sa dashboard
        val textView = findViewById<TextView>(R.id.textView)
        textView.setOnClickListener{
            val intent = Intent(this,DashboardActivity::class.java)
           startActivity(intent)
        }

//        pag i click ang create new account mo adto sa register page
        val register = findViewById<TextView>(R.id.register)
        register.setOnClickListener{
            val intent = Intent(this,RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}