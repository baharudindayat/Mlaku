package com.example.mlaku

import android.Manifest
import android.content.pm.PackageManager
import android.location.Location
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityCompat
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    var currentLocation : Location? = null
    var fusedLocationProviderClient: FusedLocationProviderClient? = null
    val REQUEST_CODE = 101

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)

        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this)


        fetchLocation()

    }

    private fun fetchLocation() {
        if (ActivityCompat.checkSelfPermission(this,Manifest.permission.ACCESS_FINE_LOCATION)
            != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this,Manifest.permission.ACCESS_COARSE_LOCATION)
            != PackageManager.PERMISSION_GRANTED)
        {
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.ACCESS_FINE_LOCATION), REQUEST_CODE)
            return
        }

        val task = fusedLocationProviderClient!!.lastLocation
        task.addOnSuccessListener { location ->
            if (location != null){
                currentLocation = location
                val supportMapFragment = (supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?)
                supportMapFragment!!.getMapAsync(this@MapsActivity)
            }
        }
    }

    override fun onMapReady(googleMap: GoogleMap) {
        val latLng = LatLng(currentLocation!!.latitude, currentLocation!!.longitude)
        val markerOptions = MarkerOptions().position(latLng).title("Lokasi Sekarang")
        googleMap.animateCamera(CameraUpdateFactory.newLatLng(latLng))
        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng,15f))
        googleMap.addMarker(markerOptions)


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



        googleMap.addMarker(MarkerOptions().position(candi).title("Candi Prambanan"))
        googleMap.addMarker(MarkerOptions().position(kalibiru).title("Kalibiru"))
        googleMap.addMarker(MarkerOptions().position(bunker).title("Bunker Kaliadem"))
        googleMap.addMarker(MarkerOptions().position(breksi).title("Tebing Breksi"))
        googleMap.addMarker(MarkerOptions().position(malio).title("Malioboro"))
        googleMap.addMarker(MarkerOptions().position(tugu).title("Tugu Jogja"))
        googleMap.addMarker(MarkerOptions().position(bukbin).title("Bukit Bintang"))
        googleMap.addMarker(MarkerOptions().position(parangtritis).title("Pantai Parangtritis"))
        googleMap.addMarker(MarkerOptions().position(ratuboko).title("Candi Ratu Boko"))
        googleMap.addMarker(MarkerOptions().position(indrayanti).title("Pantai Indrayanti"))
        googleMap.addMarker(MarkerOptions().position(sermo).title("Waduk Sermo"))
        googleMap.addMarker(MarkerOptions().position(tamansari).title("Tamansari"))
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        when(requestCode){
            REQUEST_CODE -> {
                if (grantResults.size > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    fetchLocation()
                }
            }
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
    }
}