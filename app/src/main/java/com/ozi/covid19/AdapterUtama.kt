package com.ozi.covid19

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ozi.covid19.prov.Attributes

class AdapterUtama (private val model: MutableList<Attributes>,private var context: Context) :
RecyclerView.Adapter<AdapterUtama.ViewHolder>() {
//    private var ct: Context? = null
    override fun onBindViewHolder(holder: AdapterUtama.ViewHolder, position: Int) {
        val attributes = model[position]
        holder.p.text = attributes.provinsi
//        holder.tv_sembuh.text= att.kasusSemb.toString()// nampilk
        //menampilkan gambar


    }


    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val view = LayoutInflater.from(context)
        val l = view.inflate(R.layout.adapterr, null)
        return ViewHolder(l)
    }

    override fun getItemCount(): Int {
        return model.size

    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        internal var p: TextView = itemView.findViewById(R.id.namaprov)
//        internal var tv_sembuh: TextView = itemView.findViewById(R.id.sembuh)



    }


}