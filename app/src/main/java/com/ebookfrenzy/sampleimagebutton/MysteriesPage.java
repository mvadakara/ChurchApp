package com.ebookfrenzy.sampleimagebutton;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
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
 * {@link MysteriesPage.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link MysteriesPage#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MysteriesPage extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private MainViewModel mViewModel;

    private OnFragmentInteractionListener mListener;

    public MysteriesPage() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MysteriesPage.
     */
    // TODO: Rename and change types and number of parameters
    public static MysteriesPage newInstance(String param1, String param2) {
        MysteriesPage fragment = new MysteriesPage();
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
        return inflater.inflate(R.layout.fragment_mysteries_page, container, false);
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
        Button button = getView().findViewById(R.id.joyful);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MysteriesPageDirections.ActionMysteriesPageToJoyfulMysteryPage action
                        = MysteriesPageDirections.actionMysteriesPageToJoyfulMysteryPage();
                Navigation.findNavController(view).navigate(action);
            }
        });

        Button button2 = getView().findViewById(R.id.Glorious);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MysteriesPageDirections.ActionMysteriesPageToGloriousMysteriesPage action
                        = MysteriesPageDirections.actionMysteriesPageToGloriousMysteriesPage();
                Navigation.findNavController(v).navigate(action);
            }
        });

        Button button3 = getView().findViewById(R.id.Luminous);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MysteriesPageDirections.ActionMysteriesPageToLuminousMysteriesPage action
                        = MysteriesPageDirections.actionMysteriesPageToLuminousMysteriesPage();

                Navigation.findNavController(v).navigate(action);
            }
        });

        Button button4 = getView().findViewById(R.id.Sorrowful);
        button4.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                MysteriesPageDirections.ActionMysteriesPageToSorrowfulMysteryPage action =
                        MysteriesPageDirections.actionMysteriesPageToSorrowfulMysteryPage();

                Navigation.findNavController(v).navigate(action);
            }
        });
        ImageButton button5 = getView().findViewById(R.id.mysteryArrowLeft);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MysteriesPageDirections.ActionMysteriesPageToApostlesCreedPage action =
                        MysteriesPageDirections.actionMysteriesPageToApostlesCreedPage();
                Navigation.findNavController(v).navigate(action);
            }
        });

        ImageButton button6 = getView().findViewById(R.id.mysteryArrowRight);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MysteriesPageDirections.ActionMysteriesPageToHailHolyQueenPage action =
                        MysteriesPageDirections.actionMysteriesPageToHailHolyQueenPage();
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
