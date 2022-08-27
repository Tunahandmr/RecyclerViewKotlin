package com.tunahan.recyclerviewkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.GridLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tunahan.recyclerviewkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var fruitList: ArrayList<Fruit>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        fruitList = ArrayList<Fruit>()

        val banana = Fruit("banana","yellow",R.drawable.muz)
        val kiwi = Fruit("kiwi","brown",R.drawable.kivi)
        val pomegranate = Fruit("pomegranate","red",R.drawable.nar)
        val orange = Fruit("orange","orange",R.drawable.portakal)

        fruitList.add(banana)
        fruitList.add(kiwi)
        fruitList.add(pomegranate)
        val add = fruitList.add(orange)

        binding.recyclerView.layoutManager = GridLayoutManager(this,1)
        val fruitAdapter = FruitAdapter(fruitList)
        binding.recyclerView.adapter = fruitAdapter

        //listView
        /*
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,fruitList.map { fruit -> fruit.name })
        binding.listView.adapter = adapter

        binding.listView.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->
            val intent = Intent(MainActivity@this,FruitActivity::class.java)
            //Serializable
            intent.putExtra("fruit",fruitList.get(i))
            startActivity(intent)
        }

         */
    }


}