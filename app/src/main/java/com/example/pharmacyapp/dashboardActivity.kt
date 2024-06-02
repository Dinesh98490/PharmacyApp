package com.example.pharmacyapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.pharmacyapp.Framment.addFragment
import com.example.pharmacyapp.Framment.cartFragment
import com.example.pharmacyapp.Framment.homeFragment
import com.example.pharmacyapp.Framment.profileFragment
import com.example.pharmacyapp.Framment.searchFragment
import com.example.pharmacyapp.databinding.ActivityDashboardBinding

class dashboardActivity : AppCompatActivity() {
    lateinit var dashboardBinding: ActivityDashboardBinding


    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.contentHolder, fragment).commit()


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()


        dashboardBinding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(dashboardBinding.root)


        replaceFragment(homeFragment())
        dashboardBinding.bnv.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home -> replaceFragment(homeFragment())
                R.id.search -> replaceFragment(searchFragment())
                R.id.cart -> replaceFragment(cartFragment())
                R.id.profile -> replaceFragment(profileFragment())
                R.id.add -> replaceFragment(addFragment())
                else -> {}


            }
            true

        }
    }
}




