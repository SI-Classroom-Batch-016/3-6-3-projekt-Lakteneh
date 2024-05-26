package com.example.nnafff

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nnafff.databinding.FragmentStartBinding
import com.example.nnafff.databinding.FragmentZweiBinding

class ZweiteFragment : Fragment() {

        private lateinit var binding:FragmentZweiBinding

        private lateinit var adapter: Adapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding =  FragmentZweiBinding.inflate(layoutInflater)

        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val datasource = Datasource()
        adapter= Adapter(datasource.loadAuto())
        binding.rV.layoutManager=LinearLayoutManager(this.context)
        binding.rV.adapter=adapter
    }


}