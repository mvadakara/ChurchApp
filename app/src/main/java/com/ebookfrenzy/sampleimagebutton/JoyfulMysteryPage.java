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
 * {@link JoyfulMysteryPage.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link JoyfulMysteryPage#newInstance} factory method to
 * create an instance of this fragment.
 */
public class JoyfulMysteryPage extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private MainViewModel mViewModel;
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    private OnFragmentInteractionListener mListener;

    public JoyfulMysteryPage() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment JoyfulMysteryPage.
     */
    // TODO: Rename and change types and number of parameters
    public static JoyfulMysteryPage newInstance(String param1, String param2) {
        JoyfulMysteryPage fragment = new JoyfulMysteryPage();
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
        return inflater.inflate(R.layout.fragment_joyful_mystery_page, container, false);
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

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        // TODO: Use the ViewModel

        Button button = getView().findViewById(R.id.The_Ann);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                JoyfulMysteryPageDirections.ActionJoyfulMysteryPageToTheAnnuciationPage action =
                JoyfulMysteryPageDirections.actionJoyfulMysteryPageToTheAnnuciationPage();


                Navigation.findNavController(view).navigate(action);


            }
        });

        Button button2 = getView().findViewById(R.id.TheVisit);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                JoyfulMysteryPageDirections.ActionJoyfulMysteryPageToTheVisitationPage action =
                        JoyfulMysteryPageDirections.actionJoyfulMysteryPageToTheVisitationPage();


                Navigation.findNavController(view).navigate(action);


            }
        });

        Button button3 = getView().findViewById(R.id.TheN);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                JoyfulMysteryPageDirections.ActionJoyfulMysteryPageToTheNavitiyPage action =
                        JoyfulMysteryPageDirections.actionJoyfulMysteryPageToTheNavitiyPage();


                Navigation.findNavController(view).navigate(action);


            }
        });

        Button button4 = getView().findViewById(R.id.TheP);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                JoyfulMysteryPageDirections.ActionJoyfulMysteryPageToThePresenationPage action =
                        JoyfulMysteryPageDirections.actionJoyfulMysteryPageToThePresenationPage();


                Navigation.findNavController(view).navigate(action);


            }
        });

        Button button5 = getView().findViewById(R.id.TheF);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                JoyfulMysteryPageDirections.ActionJoyfulMysteryPageToJesusChildPage action =
                        JoyfulMysteryPageDirections.actionJoyfulMysteryPageToJesusChildPage();


                Navigation.findNavController(view).navigate(action);


            }
        });
        ImageButton button6 = getView().findViewById(R.id.joyHome);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                JoyfulMysteryPageDirections.ActionJoyfulMysteryPageToMysteriesPage action =
                        JoyfulMysteryPageDirections.actionJoyfulMysteryPageToMysteriesPage();

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
