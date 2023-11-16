package com.example.madventure

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.madventure.databinding.ActivityResultBinding

class ResultActivity : Activity() {

    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun show_toast(view: View) {
        Toast.makeText(this, "Выполнено", Toast.LENGTH_SHORT).show()
    }
}