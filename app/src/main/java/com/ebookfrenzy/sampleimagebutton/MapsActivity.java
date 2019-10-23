package com.ebookfrenzy.sampleimagebutton;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
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
        LatLng boston = new LatLng(42.481838, -71.227065);
        mMap.addMarker(new MarkerOptions().position(boston).title("St. Brigid's Catholic Church\n")
                .snippet("2001 Massachussets Ave, 02421 Lexington, United States, US"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(boston));


        LatLng Calgary = new LatLng(51.069975, -114.076028);
        mMap.addMarker(new MarkerOptions().position(Calgary).title(
                "St. Joseph's Parish\n")
        .snippet("Northwest Calgary, Calgary, AB T2M 0Y8, Canada"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Calgary));


        LatLng Chicago = new LatLng(42.039773, -87.693817);
        mMap.addMarker(new MarkerOptions().position(Chicago).title(
                "St. Mary's Syro-Malankara Catholic Church, Chicago\n")
        .snippet("1208 Ashland Avenue, 60202 Evanston , IL, United States, Illinois, US"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Chicago));

        LatLng Dallas = new LatLng(32.762228, -96.558409);
        mMap.addMarker(new MarkerOptions().position(Dallas).title(
                "St. Mary's Syro-Malankara Catholic Church, Dallas\n")
                .snippet("2650 E. Scyene Road, 75181 Mesquite , TX, + United States, Texas, US"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Dallas));

        LatLng Detroit = new LatLng(42.479694, -83.025948);
        mMap.addMarker(new MarkerOptions().position(Detroit).title(
                "St. Mary's Syro-Malankara Catholic Church, Detroit\n")
                .snippet("8075 Ritter Avenue 48015 Center Line , MI, United States, Michigan US"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Detroit));

        LatLng Ed = new LatLng(53.536999, -113.576537);
        mMap.addMarker(new MarkerOptions().position(Ed).title(
                "St. John the Evangelist Roman Catholic Church, Edmonton\n")
                .snippet("9830 148 St NW, Edmonton, AB T5N 3E8, Canada"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Ed));

        LatLng Elmont = new LatLng(40.709891, -73.696586);
        mMap.addMarker(new MarkerOptions().position(Elmont).title(
                "St. Vincent de Paul Syro-Malankara Catholic Cathedral Parish, Elmont\n")
                .snippet("St. Vincent de Paul Syro-Malankara Catholic Cathedral, 1500 Depaul St, Elmont, NY 11003"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Elmont));

        LatLng Florida = new LatLng(26.096420, -80.112098);
        mMap.addMarker(new MarkerOptions().position(Florida).title(
                "St Sebastian Catholic Church\n")
                .snippet("2000 Marietta Dr, Fort Lauderdale, FL 33316"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Florida));

        LatLng Houston = new LatLng(29.597564, -95.555737);
        mMap.addMarker(new MarkerOptions().position(Houston).title(
                "St Peters Malankara Catholic Church\n")
                .snippet("3135 5th St, Stafford, TX 77477"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Houston));

        LatLng LosA = new LatLng(34.182529, -118.361961);
        mMap.addMarker(new MarkerOptions().position(LosA).title(
                "Saint Patrick's Catholic Church\n")
                .snippet("6160 Cartwright Ave, North Hollywood, CA 91606"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(LosA));

        LatLng Yonkers = new LatLng(40.937425, -73.883524);
        mMap.addMarker(new MarkerOptions().position(Yonkers).title(
                "St. Mary's Syro-Malankara Catholic Church Yonkers\n")
                .snippet("18 Trinity St, Yonkers, NY 10701"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Yonkers));

        LatLng DC = new LatLng(38.867501, -76.863743);
        mMap.addMarker(new MarkerOptions().position(DC).title(
                "St. Mary's Syro-Malankara Catholic Church Washington D.C.\n")
                .snippet("1717 Ritchie Rd, Forestville, MD 20747"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(DC));

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

        LatLng Jose = new LatLng(37.224947, -121.984596);
        mMap.addMarker(new MarkerOptions().position(Jose).title(
                "St. Jude Syro Malankara Catholic Mission\n")
                .snippet("219 Bean Ave, Los Gatos, CA 95030"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Jose));

        LatLng Rock = new LatLng(41.066235, -73.958701);
        mMap.addMarker(new MarkerOptions().position(Rock).title(
                "St. Peter's Syro-Malankara Catholic Church, Rockland\n")
                .snippet("620 Western Hwy S, Blauvelt, NY 10913"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Rock));

        LatLng Phil = new LatLng(40.053341, -75.123586);
        mMap.addMarker(new MarkerOptions().position(Phil).title(
                "St. Jude Syro-Malankara Catholic Church, Philadelphia\n")
                .snippet("6709 N 3rd St, Philadelphia, PA 19126"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Phil));

        LatLng NJ = new LatLng(40.650214, -74.195881);
        mMap.addMarker(new MarkerOptions().position(NJ).title(
                "St. Thomas Syro-Malankara Catholic Church\n")
                .snippet("11 Delaware St, Elizabeth, NJ 07206"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(NJ));


    }

}
