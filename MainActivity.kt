package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.login.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var correctUsername: String
    private lateinit var correctPassword: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        correctUsername = "wawawa"
        correctPassword = "ketawa"

        binding.loginbtn.setOnClickListener {
            val usernameInput = binding.username.text.toString()
            val passwordInput = binding.password.text.toString()

            if (usernameInput == correctUsername && passwordInput == correctPassword) {
                Toast.makeText(this@MainActivity, "Login Sukses", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this@MainActivity, "Login Gagal", Toast.LENGTH_SHORT).show()
            }
        }
    }
}