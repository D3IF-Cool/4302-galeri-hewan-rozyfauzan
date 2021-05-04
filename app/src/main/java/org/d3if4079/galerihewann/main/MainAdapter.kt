package org.d3if4079.galerihewann.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import org.d3if4079.galerihewan2.R
import org.d3if4079.galerihewan2.databinding.ListItemBinding
import org.d3if4079.galerihewann.model.Hewan


class MainAdapter : RecyclerView.Adapter<MainAdapter.ViewHolder> () {

    private val data = mutableListOf<Hewan>()

    fun updateData(newData: List<Hewan>){
        data.clear()
        data.addAll(newData)
        notifyDataSetChanged()
    }



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








