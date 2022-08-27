package com.tunahan.recyclerviewkotlin

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tunahan.recyclerviewkotlin.databinding.RecyclerRowBinding

class FruitAdapter(val fruitList: ArrayList<Fruit>) : RecyclerView.Adapter<FruitAdapter.FruitHolder>() {

    class FruitHolder(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitHolder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return FruitHolder(binding)
    }

    override fun onBindViewHolder(holder: FruitHolder, position: Int) {
        holder.binding.recyclerViewTextView.text = fruitList.get(position).name
        holder.binding.recyclerViewImageView.setImageResource(fruitList.get(position).image)

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,FruitActivity::class.java)
           // intent.putExtra("fruit",fruitList.get(position))
            mySingleton.cFruit = fruitList.get(position)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {

        return fruitList.size
    }
}