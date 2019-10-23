package com.ebookfrenzy.sampleimagebutton;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class NewYorkLocations extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_york_locations);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
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
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng Rock = new LatLng(41.066235, -73.958701);
        mMap.addMarker(new MarkerOptions().position(Rock).title(
                "St. Peter's Syro-Malankara Catholic Church, Rockland\n")
                .snippet("620 Western Hwy S, Blauvelt, NY 10913"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Rock));


        LatLng Yonkers = new LatLng(40.937425, -73.883524);
        mMap.addMarker(new MarkerOptions().position(Yonkers).title(
                "St. Mary's Syro-Malankara Catholic Church Yonkers\n")
                .snippet("18 Trinity St, Yonkers, NY 10701"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Yonkers));

        LatLng Elmont = new LatLng(40.709891, -73.696586);
        mMap.addMarker(new MarkerOptions().position(Elmont).title(
                "St. Vincent de Paul Syro-Malankara Catholic Cathedral Parish, Elmont\n")
                .snippet("St. Vincent de Paul Syro-Malankara Catholic Cathedral, 1500 Depaul St, Elmont, NY 11003"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Elmont));
    }
}
