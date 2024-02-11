package com.example.instagram_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class DashboardActivity : AppCompatActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)


        bottomNavigationView = findViewById(R.id.bottom_navigation)

        bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when(menuItem.itemId){
                R.id.Home ->{
                    replaceFragment(HomeFragment())
                    true
                }
                R.id.Search ->{
                    replaceFragment(SearchFragment())
                    true
                }
                R.id.Post ->{
                    replaceFragment(PostFragment())
                    true
                }
                R.id.Reels ->{
                    replaceFragment(ReelsFragment())
                    true
                }
                R.id.Profile ->{
                    replaceFragment(ProfileFragment())
                    true
                }
                else -> false
            }
        }

        replaceFragment(HomeFragment())

    }
    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, fragment).commit()
    }

}