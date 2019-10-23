package com.ebookfrenzy.sampleimagebutton;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class CanadaPage extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canada_page);
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
        LatLng Calgary = new LatLng(51.069975, -114.076028);
        mMap.addMarker(new MarkerOptions().position(Calgary).title(
                "St. Joseph's Parish\n")
                .snippet("Northwest Calgary, Calgary, AB T2M 0Y8, Canada"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Calgary));



        LatLng Ed = new LatLng(53.536999, -113.576537);
        mMap.addMarker(new MarkerOptions().position(Ed).title(
                "St. John the Evangelist Roman Catholic Church, Edmonton\n")
                .snippet("9830 148 St NW, Edmonton, AB T5N 3E8, Canada"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Ed));


        LatLng Van = new LatLng(49.111385, -122.862396);
        mMap.addMarker(new MarkerOptions().position(Van).title(
                "St Michael's Anglican Church \n")
                .snippet("12996 60 Ave, Surrey, BC V3X 2L5, Canada"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Van));


        LatLng Toro = new LatLng(43.732187, -79.465659);
        mMap.addMarker(new MarkerOptions().position(Toro).title(
                "St. Norbert's Roman Catholic Church\n")
                .snippet("100 Regent Rd, North York, ON M3K 1H1, Canada"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Toro));

    }
}
