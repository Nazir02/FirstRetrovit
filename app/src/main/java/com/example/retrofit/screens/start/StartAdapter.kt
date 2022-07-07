package com.example.retrofit.screens.start

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofit.R
import com.example.retrofit.model.nal.nalMonyItem
import kotlinx.android.synthetic.main.item_mony.view.*

class StartAdapter : RecyclerView.Adapter<StartAdapter.StartViewHolder>() {
    var listStart = emptyList<nalMonyItem>()

    class StartViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StartViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_mony, parent, false)
        return StartViewHolder(view)
    }

    override fun onBindViewHolder(holder: StartViewHolder, position: Int) {
        holder.itemView.item_name.text = listStart[position].ccy
        holder.itemView.item_buy.text = listStart[position].buy
        holder.itemView.item_sale.text = listStart[position].sale
    }

    override fun getItemCount(): Int {
        return listStart.size
    }

    fun setList(list: List<nalMonyItem>) {
        listStart = list
        notifyDataSetChanged()

    }
}