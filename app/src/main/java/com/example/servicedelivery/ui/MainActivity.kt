package com.example.servicedelivery.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.servicedelivery.R
import com.example.servicedelivery.model.ParcelResponse
import com.example.servicedelivery.repository.ParcelRepository
import com.example.servicedelivery.ui.adapter.ParcelsAdapter
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private val parcelAdapter by lazy { ParcelsAdapter(emptyList()) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.toolbar_home)
        setSupportActionBar(toolbar)

        configureNavigationBottom()
        setupAdapter()
        getParcels()
    }

    private fun setupAdapter() {
        val linearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rv_home.apply {
            adapter = parcelAdapter
            layoutManager = linearLayoutManager
        }
    }

    private fun getParcels() {
        val repository = ParcelRepository()
        repository.getParcels(::updateAdapterList, ::error)
    }

    private fun updateAdapterList(response: ParcelResponse) {
        parcelAdapter.updateList(response.value)
    }

    private fun error() {}

    private fun configureNavigationBottom() {
        bottom_navigation_home.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.page_1 -> {
                    true
                }
                R.id.page_2 -> {
                    true
                }
                R.id.page_3 -> {
                    true
                }
                else -> false
            }
        }
    }
}
