package com.example.loginregis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.loginregis.LoginActivity
import com.example.loginregis.databinding.ActivityRegisterBinding
import android.widget.EditText


class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            btnRegister.setOnClickListener() {
                val intent = Intent(this@RegisterActivity, LoginActivity::class.java)

                // menambahkan titipan pada intent
                intent.putExtra("EXT_USERNAME", editTextUsername.text.toString())
                intent.putExtra("EXT_EMAIL", editTextEmail.text.toString())
                intent.putExtra("EXT_PHONE", editTextPhone.text.toString())

                // untuk memulai intent
                startActivity(intent)
                finish()
//            }
//            btnLogin.setOnClickListener(){
//                // untuk membuat intent
//                val intent = Intent(this@RegisterActivity, LoginActivity::class.java)
//                // untuk memulai intent
//                startActivity(intent)

            }
        }
    }
}
