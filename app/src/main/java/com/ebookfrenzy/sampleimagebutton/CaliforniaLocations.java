package com.ebookfrenzy.sampleimagebutton;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class CaliforniaLocations extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_california_locations);
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

        // Add a marker in Sydney and move the camera
        LatLng Jose = new LatLng(37.224947, -121.984596);
        mMap.addMarker(new MarkerOptions().position(Jose).title(
                "St. Jude Syro Malankara Catholic Mission\n")
                .snippet("219 Bean Ave, Los Gatos, CA 95030"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Jose));

        LatLng LosA = new LatLng(34.182529, -118.361961);
        mMap.addMarker(new MarkerOptions().position(LosA).title(
                "Saint Patrick's Catholic Church\n")
                .snippet("6160 Cartwright Ave, North Hollywood, CA 91606"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(LosA));

    }
}
