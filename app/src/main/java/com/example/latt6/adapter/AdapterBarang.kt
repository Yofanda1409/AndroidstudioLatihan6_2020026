package com.example.latt6.adapter
import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.provider.ContactsContract.Data
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.liveData
import androidx.lifecycle.viewmodel.viewModelFactory
import androidx.recyclerview.widget.RecyclerView
import com.example.latt6.R
import com.example.latt6.model.barangModel
import com.squareup.picasso.Picasso
import java.text.FieldPosition
import kotlin.collections.ArrayList

class AdapterBarang (var activity: Activity, var data: ArrayList<barangModel>):RecyclerView.Adapter<AdapterBarang.Holder>() {
    class Holder(View: View) : RecyclerView.ViewHolder(View) {
        val tvkodeobat = View.findViewById<TextView>(R.id.tvkodeobat)
        val tvjenis = View.findViewById<TextView>(R.id.tvjenis)
        val tvpabrik = View.findViewById<TextView>(R.id.tvpabrik)
        val tvharga = View.findViewById<TextView>(R.id.tvharga)
//        val imgproduk = View.findViewById<ImageView>(R.id.img_produk)
    }

    lateinit var context: Context
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        context = parent.context
        val view = LayoutInflater.from(parent.context).inflate(R.layout.produk, parent, false)
        return Holder(
            view
        )
    }

    @SuppressLint("SrtztextI18n")
    override fun onBindViewHolder(holder: Holder, position: Int) {
        val a = data[position]
        holder.tvkodeobat.text = a.kodeobat
        holder.tvjenis.text = a.jenis
        holder.tvpabrik.text = a.pabrik
        holder.tvharga.text = a.harga

    }

    override fun getItemCount(): Int {
        return data.size
    }
}