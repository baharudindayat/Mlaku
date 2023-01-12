package com.example.mlaku

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.google.android.material.floatingactionbutton.FloatingActionButton

class DetailPlace : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_place)
        val actionbar = supportActionBar


        val imgDetailPhoto:ImageView = findViewById(R.id.img_item_photo)
        val tvSetName:TextView = findViewById(R.id.tv_destinasi)
        val tvSetLocation:TextView = findViewById(R.id.tv_location)
        val tvSetHarga:TextView = findViewById(R.id.tv_harga)
        val tvSetDetail:TextView = findViewById(R.id.tv_detail)
        val fabMaps:FloatingActionButton = findViewById(R.id.fab_maps)


        val tName  = intent.getStringExtra(EXTRA_NAME)
        val tImg = intent.getIntExtra(EXTRA_PHOTO,0)
        val tLoc = intent.getStringExtra(EXTRA_LOCATION)
        val tHarga = intent.getStringExtra(EXTRA_HARGA)
        val tDetail = intent.getStringExtra(EXTRA_DETAIL)
        val tGeo = intent.getStringExtra(EXTRA_GEO)

        fabMaps.setOnClickListener(){
            val mapsIntent = Intent(this,MapsActivity::class.java)
            startActivity(mapsIntent)
        }

//        actionbar!!.title =tName.toString()
//        actionbar.setDisplayHomeAsUpEnabled(true)

        Glide.with(this)
            .load(tImg)
            .apply(RequestOptions())
            .into(imgDetailPhoto)
        tvSetName.text = "$tName"
        tvSetHarga.text = "Harga : $tHarga"
        tvSetLocation.text = "Lokasi : $tLoc"
        tvSetDetail.text = tDetail
    }

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_LOCATION = "extra_location"
        const val EXTRA_HARGA = "extra_harga"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_GEO = "extra_geo"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}