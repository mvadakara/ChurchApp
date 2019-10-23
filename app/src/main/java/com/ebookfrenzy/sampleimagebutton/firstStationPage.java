package com.ebookfrenzy.sampleimagebutton;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.navigation.Navigation;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link firstStationPage.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link firstStationPage#newInstance} factory method to
 * create an instance of this fragment.
 */
public class firstStationPage extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private MainViewModel mViewModel;

    private OnFragmentInteractionListener mListener;

    public firstStationPage() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment firstStationPage.
     */
    // TODO: Rename and change types and number of parameters
    public static firstStationPage newInstance(String param1, String param2) {
        firstStationPage fragment = new firstStationPage();
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
        return inflater.inflate(R.layout.fragment_first_station_page, container, false);
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
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        // TODO: Use the ViewModel
        Button button2 = getView().findViewById(R.id.PrepPrayerStations);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstStationPageDirections.ActionFirstStationPageToPrepPrayerStationPage action =
                        firstStationPageDirections.actionFirstStationPageToPrepPrayerStationPage();
                Navigation.findNavController(view).navigate(action);
            }
        });

        Button button3 = getView().findViewById(R.id.FirstStationButton);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstStationPageDirections.ActionFirstStationPageToRealFirstStationPage action =
                        firstStationPageDirections.actionFirstStationPageToRealFirstStationPage();
                Navigation.findNavController(v).navigate(action);
            }
        });

        Button button4 = getView().findViewById(R.id.SecondStationButton);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstStationPageDirections.ActionFirstStationPageToSecondStationPage action =
                        firstStationPageDirections.actionFirstStationPageToSecondStationPage();
                Navigation.findNavController(v).navigate(action);
            }
        });

        Button button5 = getView().findViewById(R.id.ThirdStationButton);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstStationPageDirections.ActionFirstStationPageToThirdStationPage action =
                        firstStationPageDirections.actionFirstStationPageToThirdStationPage();
                Navigation.findNavController(v).navigate(action);
            }
        });

        Button button6 = getView().findViewById(R.id.TheFourthStationButton);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstStationPageDirections.ActionFirstStationPageToFourthStationPage action =
                        firstStationPageDirections.actionFirstStationPageToFourthStationPage();
                Navigation.findNavController(v).navigate(action);
            }
        });

        Button button7 = getView().findViewById(R.id.FifthStationButton);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstStationPageDirections.ActionFirstStationPageToFifthStationPage action =
                        firstStationPageDirections.actionFirstStationPageToFifthStationPage();
                Navigation.findNavController(v).navigate(action);
            }
        });

        Button button8 = getView().findViewById(R.id.SixthStationButton);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstStationPageDirections.ActionFirstStationPageToSixthStationPage action =
                        firstStationPageDirections.actionFirstStationPageToSixthStationPage();
                Navigation.findNavController(v).navigate(action);
            }
        });

        Button button9 = getView().findViewById(R.id.SeventhStationButton);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstStationPageDirections.ActionFirstStationPageToSeventhStationPage action =
                        firstStationPageDirections.actionFirstStationPageToSeventhStationPage();
                Navigation.findNavController(v).navigate(action);
            }
        });

        Button button10 = getView().findViewById(R.id.EighthStationButton);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstStationPageDirections.ActionFirstStationPageToEighthStationPage action =
                        firstStationPageDirections.actionFirstStationPageToEighthStationPage();
                Navigation.findNavController(v).navigate(action);
            }
        });

        Button button11 = getView().findViewById(R.id.NinthStationButton);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstStationPageDirections.ActionFirstStationPageToNinthStationPage action =
                        firstStationPageDirections.actionFirstStationPageToNinthStationPage();
                Navigation.findNavController(v).navigate(action);
            }
        });

        Button button12 = getView().findViewById(R.id.TenthStationButton);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstStationPageDirections.ActionFirstStationPageToTenthStationPage action =
                        firstStationPageDirections.actionFirstStationPageToTenthStationPage();
                Navigation.findNavController(v).navigate(action);
            }
        });

        Button button13 = getView().findViewById(R.id.EleventhStationButton);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstStationPageDirections.ActionFirstStationPageToTheEleventhStationPage action =
                        firstStationPageDirections.actionFirstStationPageToTheEleventhStationPage();
                Navigation.findNavController(v).navigate(action);
            }
        });

        Button button14 = getView().findViewById(R.id.TwelfthStationButton);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstStationPageDirections.ActionFirstStationPageToTwelfthStationPage action =
                        firstStationPageDirections.actionFirstStationPageToTwelfthStationPage();
                Navigation.findNavController(v).navigate(action);
            }
        });

        Button button15 = getView().findViewById(R.id.ThirteenthStationButton);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstStationPageDirections.ActionFirstStationPageToThirteenthStationPage action =
                        firstStationPageDirections.actionFirstStationPageToThirteenthStationPage();
                Navigation.findNavController(v).navigate(action);
            }
        });

        Button button16 = getView().findViewById(R.id.FourteenthStationButton);
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstStationPageDirections.ActionFirstStationPageToFourteenthStationPage action =
                        firstStationPageDirections.actionFirstStationPageToFourteenthStationPage();
                Navigation.findNavController(v).navigate(action);
            }
        });

        ImageButton button17 = getView().findViewById(R.id.stationsToHome);
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstStationPageDirections.ActionFirstStationPageToMainFragment2 action =
                        firstStationPageDirections.actionFirstStationPageToMainFragment2();
                Navigation.findNavController(v).navigate(action);
            }
        });


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
