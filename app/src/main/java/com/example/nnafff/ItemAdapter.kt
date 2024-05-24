package com.example.nnafff

import android.app.Activity



import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import de.syntax_institut.telefonbuch.R
import de.syntax_institut.telefonbuch.data.model.Contact
import de.syntax_institut.telefonbuch.databinding.ListItemBinding

class ItemAdapter(


    val context: Context,

    private val dataset: List<Auto>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    inner class ItemViewHolder(val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]


        holder.binding.tvItemName.text = item.name
        holder.binding.tvItemNumber.text = item.number


        val navController by lazy {
            val activity = context as Activity
            Navigation.findNavController(activity, R.id.nav_host_fragment)
        }
        holder.binding.tvItemName.text = item.name
        holder.binding.tvItemNumber.text = item.number
        holder.binding.contactCard.setOnClickListener {


val extra = Bundle().apply {
    putString("name",item.name)
    putString("number", item.number)
}
            navController.navigate(R.id.fragmertdetails,extra) // Use the NavController you obtained

        }

    }


    override fun getItemCount(): Int {
        return dataset.size
    }
}
