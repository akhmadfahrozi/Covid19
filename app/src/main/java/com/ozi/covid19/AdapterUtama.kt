package com.ozi.covid19

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ozi.covid19.Model.ResponseKaltim
import kotlinx.android.synthetic.main.adapterr.view.*

class AdapterUtama(val data: List<ResponseKaltim>?) :
    RecyclerView.Adapter<AdapterUtama.MyHolder>() {
    private var ct: Context? = null
    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.bind(data?.get(position))
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val L = LayoutInflater.from(parent.context)
        val V = L.inflate(R.layout.adapterr, parent, false)
        return MyHolder(V)

    }

    override fun getItemCount(): Int =
        data?.size ?: 0


    class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(get: ResponseKaltim?) {
            itemView.tv2.text = get?.kabKota
            itemView.positif.text = get?.confirmed
            itemView.sembuh.text = get?.sembuh
            itemView.meninggal.text = get?.meninggal

//        internal var tv_judul: TextView = itemView.findViewById(R.id.tv2)
//        internal var positif1: TextView = itemView.findViewById(R.id.positif)
//        internal var tv_isi: TextView = itemView.findViewById(R.id.sembuh)
//        internal var tv3: TextView = itemView.findViewById(R.id.meninggal)
            //  internal var tv_view:TextView=itemView.findViewById(R.id.tv_viewer)


        }
    }


}