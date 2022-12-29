package com.example.mlaku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.example.mlaku.databinding.ActivityMapsBinding

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera
        val kalibiru = LatLng(-7.807401, 110.129268)
        val candi = LatLng(-7.7519579, 110.491372)
        val bunker = LatLng(-7.582920, 110.447680)
        val breksi = LatLng(-7.781571, 110.504582)
        val malio = LatLng(-7.792626, 110.365841)
        val tugu = LatLng(-7.782920, 110.367085)
        val tamansari = LatLng(-7.810075, 110.359477)
        val bukbin = LatLng(-7.845843, 110.479845)
        val parangtritis = LatLng(-8.024608, 110.329804)
        val ratuboko = LatLng(-7.770546, 110.489414)
        val indrayanti = LatLng(-8.150379, 110.612577)
        val sermo = LatLng(-7.825758, 110.116417)



        mMap.addMarker(MarkerOptions().position(candi).title("Candi Prambanan"))
        mMap.addMarker(MarkerOptions().position(kalibiru).title("Kalibiru"))
        mMap.addMarker(MarkerOptions().position(bunker).title("Bunker Kaliadem"))
        mMap.addMarker(MarkerOptions().position(breksi).title("Tebing Breksi"))
        mMap.addMarker(MarkerOptions().position(malio).title("Malioboro"))
        mMap.addMarker(MarkerOptions().position(tugu).title("Tugu Jogja"))
        mMap.addMarker(MarkerOptions().position(bukbin).title("Bukit Bintang"))
        mMap.addMarker(MarkerOptions().position(parangtritis).title("Pantai Parangtritis"))
        mMap.addMarker(MarkerOptions().position(ratuboko).title("Candi Ratu Boko"))
        mMap.addMarker(MarkerOptions().position(indrayanti).title("Pantai Indrayanti"))
        mMap.addMarker(MarkerOptions().position(sermo).title("Waduk Sermo"))
        mMap.addMarker(MarkerOptions().position(tamansari).title("Tamansari"))

        mMap.moveCamera(CameraUpdateFactory.newLatLng(candi))
    }
}