package com.example.madventure

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import com.example.madventure.databinding.ActivityMainBinding

class MainActivity : Activity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun next_activity(view: View) {
        val intent = Intent(this, SignInActivity::class.java)
        startActivity(intent)
    }
}