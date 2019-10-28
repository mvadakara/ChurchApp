package com.ebookfrenzy.sampleimagebutton;

import android.arch.lifecycle.ViewModelProviders;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.navigation.Navigation;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link locationPage.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link locationPage#newInstance} factory method to
 * create an instance of this fragment.
 */
public class locationPage extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private MainViewModel mViewModel;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public locationPage() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment locationPage.
     */
    // TODO: Rename and change types and number of parameters
    public static locationPage newInstance(String param1, String param2) {
        locationPage fragment = new locationPage();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_location_page, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        // TODO: Use the ViewModel

        Button button = getView().findViewById(R.id.all_locations);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                locationPageDirections.LocationToMapPage action = locationPageDirections.LocationToMapPage();




                /*This item needs to change */
                Navigation.findNavController(view).navigate(action);

                // Navigation.findNavController(view).navigate(R.id.mainOnetoSecond);

            }
        });

        Button button2 = getView().findViewById(R.id.calButton);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                locationPageDirections.LocationToCal action = locationPageDirections.LocationToCal();

                Navigation.findNavController(view).navigate(action);
            }
        });

        Button button3 = getView().findViewById(R.id.massStateButton);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                locationPageDirections.ActionLocationPageToMassStateActivity action = locationPageDirections.actionLocationPageToMassStateActivity();
                Navigation.findNavController(v).navigate(action);

            }
        });

        Button button4 = getView().findViewById(R.id.canadaPage);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                locationPageDirections.ActionLocationPageToCanadaPage2 action = locationPageDirections.actionLocationPageToCanadaPage2();
                Navigation.findNavController(v).navigate(action);
            }
        });

        Button button5 = getView().findViewById(R.id.JerseyButton);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                locationPageDirections.ActionLocationPageToNewJerseyLocations action = locationPageDirections.actionLocationPageToNewJerseyLocations();
                Navigation.findNavController(v).navigate(action);
            }
        });

        Button button6 = getView().findViewById(R.id.NewYorkButton);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                locationPageDirections.ActionLocationPageToNewYorkLocations action = locationPageDirections.actionLocationPageToNewYorkLocations();
                Navigation.findNavController(v).navigate(action);
            }
        });

        Button button7 = getView().findViewById(R.id.PhilButton);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                locationPageDirections.ActionLocationPageToPhiladeplhiaLocations action = locationPageDirections.actionLocationPageToPhiladeplhiaLocations();
                Navigation.findNavController(v).navigate(action);
            }
        });

        Button button8 = getView().findViewById(R.id.maryLandLocation);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                locationPageDirections.ActionLocationPageToMaryLandLocations action = locationPageDirections.actionLocationPageToMaryLandLocations();
                Navigation.findNavController(v).navigate(action);
            }
        });
        Button button9 = getView().findViewById(R.id.texasButton);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                locationPageDirections.ActionLocationPageToTexasLocation action = locationPageDirections.actionLocationPageToTexasLocation();
                Navigation.findNavController(v).navigate(action);
            }
        });

        Button button10 = getView().findViewById(R.id.MichiganButton);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                locationPageDirections.ActionLocationPageToMichiganLocation action =
                        locationPageDirections.actionLocationPageToMichiganLocation();
                Navigation.findNavController(v).navigate(action);
            }
        });

        Button button11 = getView().findViewById(R.id.IllinoisButton);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
