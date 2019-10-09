package com.example.phone_shop

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.view_holder_phone.view.*
import java.util.zip.Inflater

class PhoneAdapter (val phones: ArrayList<Phone>):RecyclerView.Adapter<PhoneViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhoneViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemView       = layoutInflater.inflate(R.layout.view_holder_phone, parent,false)
        return PhoneViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return phones.size
    }

    override fun onBindViewHolder(holder: PhoneViewHolder, position: Int) {
        val phone = phones[position]
        holder.itemView.txtName.text = phone.name
        holder.itemView.txtPrice.text = "\$ ${phone.price}"


    }

}
class PhoneViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

}