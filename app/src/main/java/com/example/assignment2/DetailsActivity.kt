package com.example.assignment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.assignment2.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
    lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityDetailsBinding.inflate(layoutInflater)
        var image= intent.getIntExtra("image",0)
        var data= intent.getStringExtra("data")
       binding.image.setImageResource(image)
        binding.text.text=data.toString()
        setContentView(binding.root)
    }

}