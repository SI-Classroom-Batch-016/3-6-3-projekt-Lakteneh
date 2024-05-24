package com.example.nnafff

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.nnafff.databinding.FragmentDreiBinding
import com.example.nnafff.databinding.FragmentStartBinding

class DreitteFragment : Fragment() {

        private lateinit var binding:FragmentDreiBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding =  FragmentDreiBinding.inflate(layoutInflater)

        return inflater.inflate(R.layout.fragment_drei, container, false)

    }
}