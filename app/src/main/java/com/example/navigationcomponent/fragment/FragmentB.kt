package com.example.navigationcomponent.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.example.navigationcomponent.R
import kotlinx.android.synthetic.main.fragment_b.*
import kotlinx.android.synthetic.main.fragment_b.view.*


class FragmentB : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val args: FragmentAArgs by navArgs()
        val view = inflater.inflate(R.layout.fragment_b, container, false)
        val navController = activity?.let { Navigation.findNavController(it, R.id.fragment) }

        view.data.text = arguments?.getString("message")

        view.btnB.setOnClickListener {
            val action = FragmentBDirections.actionFragmentBToFragmentA()
            navController?.navigate(action)
           // it.findNavController().navigate(action)
        }

        return view
    }


}