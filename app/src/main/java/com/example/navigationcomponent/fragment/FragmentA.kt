package com.example.navigationcomponent.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.navigationcomponent.R
import kotlinx.android.synthetic.main.fragment_a.*
import kotlinx.android.synthetic.main.fragment_a.view.*


class FragmentA : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_a, container, false)
        val navController = activity?.let { Navigation.findNavController(it, R.id.fragment) }

        val bundle = Bundle()
        bundle.putString("message","Hello from Fragment A")

        view.btnA.setOnClickListener {
           val action = FragmentADirections.actionFragmentAToFragmentB()
           navController?.navigate(action)
          // it.findNavController().navigate(action)
        }

        return view
    }


}