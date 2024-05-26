package com.example.nnafff

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.nnafff.databinding.FragmentDreiBinding
import com.example.nnafff.databinding.FragmentStartBinding

class DreitteFragment : Fragment() {

        private lateinit var binding:FragmentDreiBinding
        val viewModel by viewModels<SharedViewModel> ()

            override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding =  FragmentDreiBinding.inflate(layoutInflater)

        return inflater.inflate(R.layout.fragment_drei, container, false)

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bundle= arguments
        val index = bundle?.getInt("index") ?: 0

        val autoList = viewModel.cars.value?: emptyList()
        val dasAuto = autoList.get(index)
        binding.imageView3.setImageResource(dasAuto.foto)





    }





}