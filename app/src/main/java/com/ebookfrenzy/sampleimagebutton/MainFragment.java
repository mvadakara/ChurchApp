package com.ebookfrenzy.sampleimagebutton;
import android.app.Activity;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.navigation.Navigation;

public class MainFragment extends Fragment {

    private MainViewModel mViewModel;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        // TODO: Use the ViewModel

        Button button = getView().findViewById(R.id.imageButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                MainFragmentDirections.MainOnetoSecond action = MainFragmentDirections.mainOnetoSecond();




                /*This item needs to change */
                Navigation.findNavController(view).navigate(action);

                // Navigation.findNavController(view).navigate(R.id.mainOnetoSecond);

            }
        });

        Button button2 = getView().findViewById(R.id.contactUs);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainFragmentDirections.MainToThrid action = MainFragmentDirections.mainToThrid();

                Navigation.findNavController(v).navigate(action);
            }
        });
        //button.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.mainOnetoSecond, null));

        Button button3 = getView().findViewById(R.id.rosary);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainFragmentDirections.MainToFourth action = MainFragmentDirections.mainToFourth();

                Navigation.findNavController(v).navigate(action);
            }
        });
        Button button4 = getView().findViewById(R.id.Hours);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainFragmentDirections.MainToHours action = MainFragmentDirections.mainToHours();

                Navigation.findNavController(v).navigate(action);
            }
        });

        Button button5 = getView().findViewById(R.id.locations);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainFragmentDirections.ActionMainFragment2ToLocationPage action = MainFragmentDirections.actionMainFragment2ToLocationPage();

                Navigation.findNavController(v).navigate(action);
            }
        });

        Button button6 = getView().findViewById(R.id.confession);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainFragmentDirections.MainToConfess action = MainFragmentDirections.mainToConfess();

                Navigation.findNavController(v).navigate(action);
            }
        });
    }

    public void linkToWebsite(View view) {
        Intent link = new Intent(Intent.ACTION_VIEW);
        link.setData(Uri.parse("https://stthomascatholic.church"));
        startActivity(link);
    }




}
