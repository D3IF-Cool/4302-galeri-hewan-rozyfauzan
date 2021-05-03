package org.d3if4079.galerihewan2.ui.main

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.d3if4079.galerihewan2.R
import org.d3if4079.galerihewan2.databinding.FragmentMainBinding
import org.d3if4079.galerihewan2.model.Hewan

  class MainFragment : Fragment() {

        private lateinit var binding : FragmentMainBinding

        override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
            binding = FragmentMainBinding.inflate(layoutInflater, container,false)
            with(binding.root){
                addItemDecoration(DividerItemDecoration(context, RecyclerView.VERTICAL))
                adapter = MainAdapter(getData())
                setHasFixedSize(true)
            }
            return binding.root
        }


        private fun getData(): List<Hewan>{
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
            );
        }


    }
