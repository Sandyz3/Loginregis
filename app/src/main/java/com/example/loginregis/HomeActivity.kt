package com.example.loginregis

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.loginregis.databinding.ActivityHomeBinding

class HomeActivity {
    class ThirdActivity : AppCompatActivity() {
        private lateinit var binding: ActivityHomeBinding
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityHomeBinding.inflate(layoutInflater)
            setContentView(binding.root)

            val dataIntent = intent

            val username = dataIntent.getStringExtra("EXT_USERNAME")
            val email = dataIntent.getStringExtra("EXT_EMAIL")
            val phone = dataIntent.getStringExtra("EXT_PHONE")

            with(binding) {
                val activated_email = "Your "+ email +" has ben Activated!"
                val activated_phone = "Your "+ phone +" has ben Registered!"
                textViewUsername.text = username
                textViewEmail.text = email
                textViewPhone.text = phone
            }
        }
    }
}