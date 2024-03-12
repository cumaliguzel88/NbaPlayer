package com.cumaliguzel.nbaplayer

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cumaliguzel.nbaplayer.databinding.ReyclerRowBinding

class NbaAdapter(val  nbaPlayerList : ArrayList<Player>) : RecyclerView.Adapter<NbaAdapter.NbaPlayerHolder>() {
    class NbaPlayerHolder(val binding: ReyclerRowBinding) : RecyclerView.ViewHolder(binding.root){
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NbaPlayerHolder {
       //ilk oluşturulduğund ne olucak burada layout ile baglama işlemini yapıyoruz
        val binding  = ReyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return NbaPlayerHolder(binding)
    }
    override fun getItemCount(): Int {
        //kaç adet var ve geri döndürücem burada arry size geri dönecek
        return nbaPlayerList.size

    }
    override fun onBindViewHolder(holder: NbaPlayerHolder, position: Int) {
        //baglandıktan sonr ane olucak
        holder.binding.textViewPlayerName.text=nbaPlayerList.get(position).name
        holder.itemView.setOnClickListener {
            val intent=Intent(holder.itemView.context,PlayerActivity ::class.java)
            Mysingleton.chossenNbaPlayer=nbaPlayerList.get(position)
            holder.itemView.context.startActivity(intent)
        }
    }
}