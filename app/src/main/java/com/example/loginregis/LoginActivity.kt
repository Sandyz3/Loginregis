package com.example.loginregis

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.loginregis.databinding.ActivityLoginBinding
import android.widget.EditText
import com.example.loginregis.databinding.ActivityHomeBinding


class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dataIntent = intent

        val username = dataIntent.getStringExtra("EXT_USERNAME")
        val email = dataIntent.getStringExtra("EXT_EMAIL")
        val phone = dataIntent.getStringExtra("EXT_PHONE")


        with(binding) {

//            btnRegister.setOnClickListener {
//                val intent = Intent(this@LoginActivity, RegisterActivity::class.java)
//                startActivity(intent)
//            }
            btnLogin.setOnClickListener() {
                // untuk membuat intent
                val intent = Intent(this@LoginActivity, HomeActivity::class.java)
                startActivity(intent)
                finish()

            }
        }
    }
}

