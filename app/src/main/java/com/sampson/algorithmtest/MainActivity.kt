package com.sampson.algorithmtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.sampson.algorithmtest.databinding.ActivityMainBinding
import com.sampson.algorithmtest.utils.SmallerInt
import com.sampson.algorithmtest.utils.TwinWords

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

        binding.btnTwinWords.setOnClickListener {
            val twin = TwinWords()
            val isTwin = twin.testTwinWords()
            Toast.makeText(this, isTwin.toString(), Toast.LENGTH_SHORT).show()
        }
    }
}