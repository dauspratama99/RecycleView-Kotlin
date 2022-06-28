package com.example.recycleview.adapter

import android.content.Context
import android.content.Intent
import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.DetailBonekaActivity
import com.example.recycleview.R
import com.example.recycleview.model.Boneka

class BonekaAdapter(val context: Context):RecyclerView.Adapter<BonekaAdapter.BonekaViewHolder>() {

    private val boneka:MutableList<Boneka> = mutableListOf()
    override fun getItemCount(): Int {
        return boneka.size
    }

    override fun onBindViewHolder(holder: BonekaAdapter.BonekaViewHolder, position: Int) {
        holder.binmodel(boneka[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BonekaViewHolder {
        return BonekaViewHolder(LayoutInflater.from(context).inflate(R.layout.list_data_mobil,parent,false))
    }

    inner class BonekaViewHolder(item: View):RecyclerView.ViewHolder(item){
        val imgFoto:ImageView = item.findViewById(R.id.img_foto)
        val txtjudul:TextView = item.findViewById(R.id.tv_judul)
        val txtisi:TextView = item.findViewById(R.id.tv_isi)

        val cardViewData:CardView = item.findViewById(R.id.cv_data_boneka)

        fun binmodel(m:Boneka){
            imgFoto.setImageResource(m.foto)
            txtjudul.text = m.judul
            txtisi.text = m.publish


            cardViewData.setOnClickListener{
                Intent(context,DetailBonekaActivity::class.java).apply {
                    putExtra("Boneka",m)
                    context.startActivity(this)
                }

            }
        }
    }

    fun setListDataBoneka(data:List<Boneka>){
        boneka.clear()
        boneka.addAll(data)
        notifyDataSetChanged()
    }




}