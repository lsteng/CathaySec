package reson.cathaysec.ui.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import reson.cathaysec.R

class RecyclerAdapter(val dateList: List<String>) : RecyclerView.Adapter<RecyclerAdapter.mViewHolder>() {

    inner class mViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val itemTV1 = itemView.findViewById<TextView>(R.id.itemTV1)
        val itemTV2 = itemView.findViewById<TextView>(R.id.itemTV2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):mViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val example = inflater.inflate(R.layout.item_view, parent, false)
        return mViewHolder(example)
    }

    override fun getItemCount() = dateList.size

    override fun onBindViewHolder(holder: mViewHolder, position: Int) {
        holder.itemTV1.text = "項目${position+1}"
        holder.itemTV2.text = dateList.get(position)
    }
}