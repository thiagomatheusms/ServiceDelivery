package com.example.servicedelivery.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.servicedelivery.R
import com.example.servicedelivery.model.ParcelVO
import kotlinx.android.synthetic.main.item_home.view.*

class ParcelsAdapter(var parcelList: List<ParcelVO>) :
    RecyclerView.Adapter<ParcelsAdapter.ParcelsAdapterViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParcelsAdapterViewHolder {
        val idLayoutInflater = R.layout.item_home
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(idLayoutInflater, parent, false)
        return ParcelsAdapterViewHolder(view)
    }

    override fun getItemCount() = parcelList.size

    override fun onBindViewHolder(holder: ParcelsAdapterViewHolder, position: Int) {
        val parcel = parcelList[position]
        holder.bind(parcel)
    }

    fun updateList(parcelListUpdate: List<ParcelVO>){
        this.parcelList = parcelListUpdate
        notifyDataSetChanged()
    }

    inner class ParcelsAdapterViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(parcelVO: ParcelVO) {
            itemView.tv_order_number_item_home.text = parcelVO.orderNumber
            itemView.tv_status_item_home.text = parcelVO.status
            itemView.tv_update_item_home.text = parcelVO.updateStatus
//            itemView.horizontal_progress_bar. = parcelVO.updateStatus
        }
    }
}