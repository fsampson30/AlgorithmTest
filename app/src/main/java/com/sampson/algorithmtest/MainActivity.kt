package com.sampson.algorithmtest

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.sampson.algorithmtest.databinding.ActivityMainBinding
import com.sampson.algorithmtest.utils.SmallerInt

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnSmallerNumber.setOnClickListener {
            val small = SmallerInt()
            val number = small.testSmallerInt()
            Toast.makeText( this,number.toString(), Toast.LENGTH_SHORT).show()
        }
    }
}