package com.example.fibonaccisequence

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class NumberRecyclerViewAdapter( var numberList:List<BigInteger>):RecyclerView.Adapter<NumbViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbViewHolder {
        var numbView=LayoutInflater.from(parent.context).inflate(R.layout.number_list_item,parent,false)
        return NumbViewHolder(numbView)
    }

    override fun onBindViewHolder(holder: NumbViewHolder, position: Int) {
        //checks which position in the list are we ?
        holder.tvNumber.text=numberList.get(position).toString()
    }

    override fun getItemCount(): Int {//LETS ADAPTER KNOW YOU ARE GOING TO CREATE X NUMBER OF ITEMS


        return numberList.size
    }
}
class NumbViewHolder(val numbView:View):RecyclerView.ViewHolder(numbView) {
    var tvNumber=itemView.findViewById<android.widget.TextView>(R.id.tvNumber)
}