package com.ebookfrenzy.sampleimagebutton;

import android.app.ActionBar;
import android.content.res.Configuration;
import android.support.design.widget.NavigationView;
//import android.support.v4.app.Fragment;
//import android.support.v4.app.FragmentActivity;
import android.support.v4.view.GravityCompat;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
// import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import android.view.ViewGroup;
import android.app.Activity;
import android.content.Context;
import android.text.Html;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;
import androidx.navigation.*;
import android.support.design.widget.NavigationView;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.AppBarConfiguration.Builder;
import android.support.v4.widget.DrawerLayout;





public class MainActivity extends AppCompatActivity implements secondFragment.
        OnFragmentInteractionListener, firstStationPage.OnFragmentInteractionListener,
        thridFragment.OnFragmentInteractionListener, fourthFragment.OnFragmentInteractionListener,
        openingPrayerFragment.OnFragmentInteractionListener,
        LiturgyoftheHours.OnFragmentInteractionListener, ConfessPage.OnFragmentInteractionListener,
        EnglishOrMalRosaryPage.OnFragmentInteractionListener, MalaylamRosaryPage.OnFragmentInteractionListener,
         ApostlesCreedPage.OnFragmentInteractionListener,
        MysteriesPage.OnFragmentInteractionListener, LitanyPage.OnFragmentInteractionListener,
        HailHolyQueenPage.OnFragmentInteractionListener, MemorarePage.OnFragmentInteractionListener,
        JoyfulMysteryPage.OnFragmentInteractionListener, SorrowfulMysteryPage.OnFragmentInteractionListener,
        LuminousMysteriesPage.OnFragmentInteractionListener, GloriousMysteriesPage.OnFragmentInteractionListener,
      TheAnnuciationPage.OnFragmentInteractionListener, TheVisitationPage.OnFragmentInteractionListener,
        TheNavitiyPage.OnFragmentInteractionListener, ThePresenationPage.OnFragmentInteractionListener,
        JesusChildPage.OnFragmentInteractionListener, TheBaptismPage.OnFragmentInteractionListener, TheManifestationPage.OnFragmentInteractionListener,
        TheProclamationPage.OnFragmentInteractionListener, TheTransPage.OnFragmentInteractionListener,
        TheEucharistPage.OnFragmentInteractionListener, TheResurrectionPage.OnFragmentInteractionListener,
        TheAscensionPage.OnFragmentInteractionListener, TheDescentPage.OnFragmentInteractionListener,
        TheAssumptionPage.OnFragmentInteractionListener, TheCoronationPage.OnFragmentInteractionListener,
        TheAgonyPage.OnFragmentInteractionListener, TheSPillarPage.OnFragmentInteractionListener,
        TheCThorns.OnFragmentInteractionListener, TheCarryCrossPage.OnFragmentInteractionListener,
        TheCrucifixationPage.OnFragmentInteractionListener, PreparationPage.OnFragmentInteractionListener,
        Examination_Conscience_Page.OnFragmentInteractionListener,
        Prayer_Repentance_Page.OnFragmentInteractionListener, Act_Of_Contrition_Page.OnFragmentInteractionListener,
        ThanksGiving_Confess_Page.OnFragmentInteractionListener, Prayer_To_Holy_Spirit_Page.OnFragmentInteractionListener,
        FirstCommandmentPage.OnFragmentInteractionListener, TheSecondCommandmentPage.OnFragmentInteractionListener,
        TheThirdCommandmentPage.OnFragmentInteractionListener, TheFourthCommandment_Children_Page.OnFragmentInteractionListener,
        TheFourthCommandment_Parent_Page.OnFragmentInteractionListener, TheFifthCommandmentPage.OnFragmentInteractionListener,
        SixthAndNinthCommandmentPage.OnFragmentInteractionListener, SixthAndNinthCommandment_Married_People_Page.OnFragmentInteractionListener,
        TheSeventhAndTenthCommandmentsPAge.OnFragmentInteractionListener, TheEighthCommandmentPage.OnFragmentInteractionListener,
        PrepPrayerStationPage.OnFragmentInteractionListener, RealFirstStationPage.OnFragmentInteractionListener,
        SecondStationPage.OnFragmentInteractionListener, ThirdStationPage.OnFragmentInteractionListener,
        FourthStationPage.OnFragmentInteractionListener, FifthStationPage.OnFragmentInteractionListener,
        SixthStationPage.OnFragmentInteractionListener, SeventhStationPage.OnFragmentInteractionListener,
        EighthStationPage.OnFragmentInteractionListener, NinthStationPage.OnFragmentInteractionListener,
        TenthStationPage.OnFragmentInteractionListener, TheEleventhStationPage.OnFragmentInteractionListener,
        TwelfthStationPage.OnFragmentInteractionListener, ThirteenthStationPage.OnFragmentInteractionListener,
        FourteenthStationPage.OnFragmentInteractionListener, LitEnglishMalPage.OnFragmentInteractionListener,
        EnglishOrMalConfessPage.OnFragmentInteractionListener, SignOfCrossPage.OnFragmentInteractionListener
        , MawPrayer.OnFragmentInteractionListener, LiturgyOfTheHoursMal.OnFragmentInteractionListener, locationPage.OnFragmentInteractionListener
{


    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    private NavigationView nvDrawer;


    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Find our drawer view
        nvDrawer = findViewById(R.id.nav_view);
        // Setup drawer view
        //setupDrawerContent(nvDrawer);


        mDrawerLayout = findViewById(R.id.container);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout,  R.string.open, R.string.close);
      mDrawerLayout.addDrawerListener(mToggle);


    // getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    //  getSupportActionBar().setHomeButtonEnabled(true);

        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.drawermenu, menu);
        return true;
    }




    /*private void setupDrawerContent(NavigationView navigationView) {
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        selectDrawerItem(menuItem);
                        return true;
                    }
                });
    }
    */
    /*
    public void selectDrawerItem(MenuItem menuItem) {
        // Create a new fragment and specify the fragment to show based on nav item clicked
        Fragment fragment = null;
        Class fragmentClass;
        switch(menuItem.getItemId()) {
            case R.id.Home:
                fragmentClass = MainFragment.class;
                break;
            case R.id.rosary:
                fragmentClass = EnglishOrMalRosaryPage.class;
                break;
            case R.id.stations:
                fragmentClass = secondFragment.class;
                break;
            case R.id.confession:
                fragmentClass = EnglishOrMalConfessPage.class;;
            default:
                fragmentClass = MainFragment.class;
        }

        try {
            fragment = (Fragment) fragmentClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Insert the fragment by replacing any existing fragment
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.flContent, fragment).commit();


        // Highlight the selected item has been done by NavigationView
        menuItem.setChecked(true);
        // Set action bar title
        setTitle(menuItem.getTitle());
        // Close the navigation drawer
        mDrawer.closeDrawers();
    }

*/

    /*

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        // Sync the toggle state after onRestoreInstanceState has occurred.
        mToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        // Pass any configuration change to the drawer toggles
        mToggle.onConfigurationChanged(newConfig);
    }

*/





  @Override
  public boolean onOptionsItemSelected(MenuItem item) {


      int id = item.getItemId();

      if (id == R.id.web) {
          Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://stthomascatholic.church"));
          startActivity(browserIntent);

          return true;
      }
      else if (id == R.id.main_to_Map) {
          Intent browserIntent;
          browserIntent = new Intent(this, MapsActivity.class);
          startActivity(browserIntent);

          return true;
      }
      NavController navController = Navigation.findNavController(this, R.id.nav_host_id);
      return NavigationUI.onNavDestinationSelected(item, navController)
              || super.onOptionsItemSelected(item);


  }

        public void onFragmentInteraction(Uri uri) {


        }
    public void linkToWebsite(View view) {
        Intent link = new Intent(Intent.ACTION_VIEW);
        link.setData(Uri.parse("https://stthomascatholic.church"));
        startActivity(link);
    }


}



