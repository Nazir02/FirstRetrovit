package com.example.retrofit.screens.second

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofit.R
import com.example.retrofit.model.beznal.beznalItem
import kotlinx.android.synthetic.main.item_mony.view.*

class SecondAdapter: RecyclerView.Adapter<SecondAdapter.SecondViewHolder>() {
    var listSecond= emptyList<beznalItem>()
    class SecondViewHolder(view: View): RecyclerView.ViewHolder(view)



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecondViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.item_mony,parent,false)
        return SecondViewHolder(view)
    }

    override fun onBindViewHolder(holder: SecondViewHolder, position: Int) {
        holder.itemView.item_name.text=listSecond[position].ccy
        holder.itemView.item_buy.text=listSecond[position].buy
        holder.itemView.item_sale.text=listSecond[position].sale
    }

    override fun getItemCount(): Int {
        return listSecond.size
    }
    fun setList(list:List<beznalItem>){
        listSecond=list
        notifyDataSetChanged()

    }
}