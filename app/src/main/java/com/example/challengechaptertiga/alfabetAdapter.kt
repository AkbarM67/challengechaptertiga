package com.example.challengechaptertiga

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.content.contentValuesOf
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView

class alfabetAdapter (val listAlfabet: ArrayList<ListAlfabet>): RecyclerView.Adapter<alfabetAdapter.ViewHolder>() {
    lateinit var context : Context
    class ViewHolder(view : View) : RecyclerView.ViewHolder(view){
        var Btnlist = view.findViewById<Button>(R.id.BtnList)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.list_alfabet,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.Btnlist.text = listAlfabet[position].alfabet
        holder.Btnlist.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v : View?) {
                if (holder.Btnlist.length() == 1){
                    var bund = Bundle()
                    bund.putString("alfabet",holder.Btnlist.text.toString())
                    Navigation.findNavController(holder.Btnlist).navigate(R.id.action_fragment_alfabet_to_fragmentword, bund)
                }else{
                    val link = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q= $(Holder.Btnlist.text.toString()}"))
                    context.startActivity(link)
                }
            }
        })

    }

    override fun getItemCount(): Int {
        return listAlfabet.size
    }

    override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
        super.onAttachedToRecyclerView(recyclerView)
        context = recyclerView.context
    }
}
