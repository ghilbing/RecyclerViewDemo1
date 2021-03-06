package com.hilbing.recyclerviewdemo1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*

class MyAdapter(val fruitList:List<Fruit>): RecyclerView.Adapter<MyAdapter.MyViewHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val listItem = layoutInflater.inflate(R.layout.list_item, parent, false)
        return MyViewHolder(listItem)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(fruitList.get(position))
    }

    override fun getItemCount(): Int {
        return fruitList.size
    }

    class MyViewHolder(val view: View): RecyclerView.ViewHolder(view){
        fun bind(fruit: Fruit){
            view.name_TV.text = fruit.name
        }
    }

}