package org.d3if4079.galerihewan2.ui.main

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import org.d3if4079.galerihewan2.model.Hewan
import org.d3if4079.galerihewan2.databinding.ListItemBinding


class MainAdapter(private val data:List<Hewan>): RecyclerView.Adapter<MainAdapter.ViewHolder> () {
    class ViewHolder(private val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root) {


        fun bind(hewan: Hewan) = with(binding) {
            namaTextView.text = hewan.nama;
            latinTextView.text = hewan.namaLatin;
            jenistextView.text = hewan.jenisHewan;
           imageView.setImageResource(hewan.imageResid);

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ListItemBinding.inflate(inflater,parent,false)
        return ViewHolder(binding);
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])

    }

    override fun getItemCount(): Int {
        return data.size;

    }


}








