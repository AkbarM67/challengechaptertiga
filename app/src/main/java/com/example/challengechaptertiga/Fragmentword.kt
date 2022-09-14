package com.example.challengechaptertiga

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class Fragmentword : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragmentword, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var alfabet = arguments?.getString("alfabet")
        when (alfabet){
            "A" -> listA()
            "B" -> listB()
            "C" -> listC()
            "D" -> listD()
            "E" -> listE()
            "F" -> listF()

        }

    }

    fun listA() {
        val listAlfabet = arrayListOf(
            ListAlfabet("anjing"),
            ListAlfabet("angsa"),
            ListAlfabet("ayam"),
        )

        val adapter = alfabetAdapter(listAlfabet)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        val recyclerView = view?.findViewById<RecyclerView>(R.id.recycleViewW)

        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter
    }

    fun listB(){
        val listAlfabet = arrayListOf(
            ListAlfabet("bangsa"),
            ListAlfabet("bambu"),
            ListAlfabet("bisnis"),
        )

        val adapter = alfabetAdapter(listAlfabet)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        val recyclerView = view?.findViewById<RecyclerView>(R.id.recycleViewW)

        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter

    }
    fun listC(){
        val listAlfabet = arrayListOf(
            ListAlfabet("Cicak"),
            ListAlfabet("city"),
            ListAlfabet("cina"),
        )

        val adapter = alfabetAdapter(listAlfabet)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        val recyclerView = view?.findViewById<RecyclerView>(R.id.recycleViewW)

        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter
    }
    fun listD(){
        val listAlfabet = arrayListOf(
            ListAlfabet("Deni"),
            ListAlfabet("Dadan"),
            ListAlfabet("dayat"),
        )

        val adapter = alfabetAdapter(listAlfabet)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        val recyclerView = view?.findViewById<RecyclerView>(R.id.recycleViewW)

        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter
    }
    fun listE(){
        val listAlfabet = arrayListOf(
            ListAlfabet("Empang"),
            ListAlfabet("Esteh"),
            ListAlfabet("Esjeruk"),
        )

        val adapter = alfabetAdapter(listAlfabet)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        val recyclerView = view?.findViewById<RecyclerView>(R.id.recycleViewW)

        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter
    }
    fun listF(){
        val listAlfabet = arrayListOf(
            ListAlfabet("FiFA"),
            ListAlfabet("Fanta"),
            ListAlfabet("final"),
        )

        val adapter = alfabetAdapter(listAlfabet)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        val recyclerView = view?.findViewById<RecyclerView>(R.id.recycleViewW)

        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter
    }
}