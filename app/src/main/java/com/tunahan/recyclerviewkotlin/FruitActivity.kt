package com.tunahan.recyclerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tunahan.recyclerviewkotlin.databinding.ActivityFruitBinding

class FruitActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFruitBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFruitBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent
        //casting to Fruit
       /* val selectedFruit = intent.getSerializableExtra("fruit") as Fruit

        binding.colorText.text = selectedFruit.color
        binding.nameText.text = selectedFruit.name
        binding.imageView.setImageResource(selectedFruit.image)

        */

        val selectedFruit = mySingleton.cFruit

        selectedFruit?.let {
            binding.colorText.text = it.color
            binding.nameText.text = it.name
            binding.imageView.setImageResource(it.image)
        }


    }
}