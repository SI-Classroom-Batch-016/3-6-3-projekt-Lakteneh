package com.example.nnafff

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.nnafff.databinding.FragmentStartBinding
import com.example.nnafff.databinding.FragmentZweiBinding

class ZweiteFragment : Fragment() {

        private lateinit var binding:FragmentZweiBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding =  FragmentZweiBinding.inflate(layoutInflater)

        return inflater.inflate(R.layout.fragment_zwei, container, false)

    }
}