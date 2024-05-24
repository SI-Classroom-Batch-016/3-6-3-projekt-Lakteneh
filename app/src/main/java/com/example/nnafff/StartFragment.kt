package com.example.nnafff

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.nnafff.databinding.FragmentStartBinding

class StartFragment : Fragment() {

        private lateinit var binding:FragmentStartBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding =  FragmentStartBinding.inflate(layoutInflater)

        return inflater.inflate(R.layout.fragment_start, container, false)

    }
}