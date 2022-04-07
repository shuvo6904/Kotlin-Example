package com.example.kotlinexample.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinexample.R
import com.example.kotlinexample.model.RecyclerData
import com.example.kotlinexample.model.RecyclerList
import com.squareup.picasso.Picasso

class RecyclerViewAdapter : RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>() {

    var items = ArrayList<RecyclerData>()

    fun setUpdatedData(items : ArrayList<RecyclerData>){
        this.items = items
        notifyDataSetChanged()
    }

    class MyViewHolder(view : View) : RecyclerView.ViewHolder(view) {

        val imageThumb = view.findViewById<ImageView>(R.id.imageThumbId)
        val name = view.findViewById<TextView>(R.id.nameId)
        val description = view.findViewById<TextView>(R.id.descriptionId)




        fun bind(data : RecyclerData){

            name.text = data.name
            description.text = data.description

            val url = data.owner.avatar_url

            Picasso.get()
                .load(url)
                .into(imageThumb)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_item_row, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(items.get(position))
    }

    override fun getItemCount(): Int {
        return items.size
    }
}