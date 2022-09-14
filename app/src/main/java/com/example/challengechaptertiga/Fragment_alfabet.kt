package com.example.challengechaptertiga

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class Fragment_alfabet : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_alfabet, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listAlfabet = arrayListOf(
            ListAlfabet("A"),
            ListAlfabet("B"),
            ListAlfabet("C"),
            ListAlfabet("D"),
            ListAlfabet("E"),
            ListAlfabet("F"),
            ListAlfabet("G"),
            ListAlfabet("H"),
            ListAlfabet("I"),
            ListAlfabet("J"),
            ListAlfabet("K"),
            ListAlfabet("L"),
            ListAlfabet("M"),
            ListAlfabet("N"),
            ListAlfabet("O"),
            ListAlfabet("P"),
            ListAlfabet("Q"),
            ListAlfabet("S"),
        )

        val adapter = alfabetAdapter(listAlfabet)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.ViewAlfabet)

        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter
    }
}