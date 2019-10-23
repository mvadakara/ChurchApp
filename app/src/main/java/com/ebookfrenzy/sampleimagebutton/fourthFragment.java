package com.ebookfrenzy.sampleimagebutton;
// Rosary
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
 * {@link fourthFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link fourthFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fourthFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private MainViewModel mViewModel;

    private OnFragmentInteractionListener mListener;

    public fourthFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fourthFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static fourthFragment newInstance(String param1, String param2) {
        fourthFragment fragment = new fourthFragment();
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
        return inflater.inflate(R.layout.fragment_fourth, container, false);
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

        Button button = getView().findViewById(R.id.SignOfCross);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fourthFragmentDirections.ActionFourthFragmentToSignOfCrossPage action =
                        fourthFragmentDirections.actionFourthFragmentToSignOfCrossPage();
                //LiturgyoftheHoursDirections.LitToIn action = LiturgyoftheHoursDirections.litToIn();


                Navigation.findNavController(view).navigate(action);


            }
        });

        Button button2 = getView().findViewById(R.id.ApostlesCreed);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fourthFragmentDirections.ActionFourthFragmentToApostlesCreedPage action =
                        fourthFragmentDirections.actionFourthFragmentToApostlesCreedPage();

                Navigation.findNavController(v).navigate(action);
            }
        });

        Button button3 = getView().findViewById(R.id.MysteriesR);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fourthFragmentDirections.ActionFourthFragmentToMysteriesPage action =
                        fourthFragmentDirections.actionFourthFragmentToMysteriesPage();

                Navigation.findNavController(v).navigate(action);
            }
        });

        Button button4 = getView().findViewById(R.id.HailHoly);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fourthFragmentDirections.ActionFourthFragmentToHailHolyQueenPage action =
                        fourthFragmentDirections.actionFourthFragmentToHailHolyQueenPage();

                Navigation.findNavController(v).navigate(action);
            }
        });

        Button button5 = getView().findViewById(R.id.Litany);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fourthFragmentDirections.ActionFourthFragmentToLitanyPage action =
                        fourthFragmentDirections.actionFourthFragmentToLitanyPage();

                Navigation.findNavController(v).navigate(action);
            }
        });

        Button button6 = getView().findViewById(R.id.Mem);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fourthFragmentDirections.ActionFourthFragmentToMemorarePage action=
                        fourthFragmentDirections.actionFourthFragmentToMemorarePage();

                Navigation.findNavController(v).navigate(action);
            }
        });

        ImageButton button7 = getView().findViewById(R.id.roseToHome);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fourthFragmentDirections.ActionFourthFragmentToMainFragment2 action =
                        fourthFragmentDirections.actionFourthFragmentToMainFragment2();

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
