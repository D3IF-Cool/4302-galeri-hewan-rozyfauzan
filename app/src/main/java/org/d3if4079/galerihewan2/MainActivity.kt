package org.d3if4079.galerihewan2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.RecyclerView
import android.util.Log
import org.d3if4079.galerihewan2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d("Main Activity", "Jumlah Data : " + getData().size)
        with(binding.root){
            addItemDecoration(DividerItemDecoration(context,RecyclerView.VERTICAL))
            adapter = MainAdapter(getData())
            setHasFixedSize(true)
        }
    }

    private fun getData(): List<Hewan>{
        return listOf(
                Hewan("Angsa", "Cygnus olor", "Hewan Unggas",R.drawable.angsa),
                Hewan("Ayam", "Gallus gallus","Hewan Unggas", R.drawable.ayam),
                Hewan("Bebek", "Cairina moschata","Hewan Unggas", R.drawable.bebek),
                Hewan("Domba", "Ovis ammon", "Hewan Ternak",R.drawable.domba),
                Hewan("Kalkun", "Meleagris gallopavo", "Hewan Unggas",R.drawable.kalkun),
                Hewan("Kambing", "Capricornis sumatrensis", "Hewan Ternak",R.drawable.kambing),
                Hewan("Kelinci", "Oryctolagus cuniculus", "Hewan Ternak",R.drawable.kelinci),
                Hewan("Kerbau", "Bubalus bubalis","Hewan Ternak", R.drawable.kerbau),
                Hewan("Kuda", "Equus caballus", "Hewan Ternak",R.drawable.kuda),
                Hewan("Sapi", "Bos taurus", "Hewan Ternak", R.drawable.sapi),
        );
    }


}