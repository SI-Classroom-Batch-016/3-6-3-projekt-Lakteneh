package com.example.nnafff

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.nnafff.databinding.ItemListBinding

class Adapter ( val dataset : List <Auto > )

 : RecyclerView.Adapter <Adapter.ItemViewHolder>() {
        private lateinit var navController: NavController
    inner class ItemViewHolder (val binding: ItemListBinding):ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {


        val binding = ItemListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ItemViewHolder(binding)
    }

    override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
        super.onAttachedToRecyclerView(recyclerView)
        navController = Navigation.findNavController(recyclerView)
    }


    override fun getItemCount(): Int {
       return dataset.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.binding.m.setImageResource(item.foto)
        holder.binding.textV.text = item.name
        holder.binding.preiss.text = item.preiss.toString()
        holder.binding.m.setOnClickListener {

            val bundle = Bundle()
            bundle.putInt("index", position)
            navController.navigate(R.id.drei_fragment,bundle)

        }


    }


}

/*


): RecyclerView.Adapter <Adapter.ItemViewHolder>() {


    inner class ItemViewHolder (binding: ItemListBinding):ViewHolder(binding.root)
*/