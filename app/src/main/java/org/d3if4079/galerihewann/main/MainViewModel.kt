package org.d3if4079.galerihewann.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.d3if4079.galerihewan2.R
import org.d3if4079.galerihewann.model.Hewan


class MainViewModel : ViewModel() {

    private val data = MutableLiveData<List<Hewan>>()

    init {
        data.value = initData()
    }


    private fun initData() : List<Hewan>{
        return listOf(
            Hewan("Angsa", "Cygnus olor", "Hewan Unggas", R.drawable.angsa),
            Hewan("Ayam", "Gallus gallus","Hewan Unggas", R.drawable.ayam),
            Hewan("Bebek", "Cairina moschata","Hewan Unggas", R.drawable.bebek),
            Hewan("Domba", "Ovis ammon", "Hewan Ternak", R.drawable.domba),
            Hewan("Kalkun", "Meleagris gallopavo", "Hewan Unggas", R.drawable.kalkun),
            Hewan("Kambing", "Capricornis sumatrensis", "Hewan Ternak", R.drawable.kambing),
            Hewan("Kelinci", "Oryctolagus cuniculus", "Hewan Ternak", R.drawable.kelinci),
            Hewan("Kerbau", "Bubalus bubalis","Hewan Ternak", R.drawable.kerbau),
            Hewan("Kuda", "Equus caballus", "Hewan Ternak", R.drawable.kuda),
            Hewan("Sapi", "Bos taurus", "Hewan Ternak", R.drawable.sapi),
        )
    }

    fun getData() : LiveData<List<Hewan>> = data


}