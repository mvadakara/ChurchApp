package com.ebookfrenzy.sampleimagebutton;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.navigation.Navigation;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Examination_Conscience_Page.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Examination_Conscience_Page#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Examination_Conscience_Page extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private MainViewModel mViewModel;
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    private OnFragmentInteractionListener mListener;

    public Examination_Conscience_Page() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Examination_Conscience_Page.
     */
    // TODO: Rename and change types and number of parameters
    public static Examination_Conscience_Page newInstance(String param1, String param2) {
        Examination_Conscience_Page fragment = new Examination_Conscience_Page();
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
        return inflater.inflate(R.layout.fragment_examination__conscience__page, container, false);
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

        Button button = getView().findViewById(R.id.FirstC);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Examination_Conscience_PageDirections.ActionExaminationConsciencePageToFirstCommandmentPage action =
                        Examination_Conscience_PageDirections.actionExaminationConsciencePageToFirstCommandmentPage();
                Navigation.findNavController(view).navigate(action);

            }
        });
        Button button2 = getView().findViewById(R.id.TheSecondC);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Examination_Conscience_PageDirections.ActionExaminationConsciencePageToTheSecondCommandmentPage action =
                        Examination_Conscience_PageDirections.actionExaminationConsciencePageToTheSecondCommandmentPage();
            Navigation.findNavController(v).navigate(action);
            }
        });

        Button button3 = getView().findViewById(R.id.TheThirdC);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Examination_Conscience_PageDirections.ActionExaminationConsciencePageToTheThirdCommandmentPage action =
                        Examination_Conscience_PageDirections.actionExaminationConsciencePageToTheThirdCommandmentPage();
                Navigation.findNavController(v).navigate(action);
            }
        });

        Button button4 = getView().findViewById(R.id.TheFourthCP);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Examination_Conscience_PageDirections.ActionExaminationConsciencePageToTheFourthCommandmentParentPage action =
                        Examination_Conscience_PageDirections.actionExaminationConsciencePageToTheFourthCommandmentParentPage();
                Navigation.findNavController(v).navigate(action);
            }
        });

        Button button5 = getView().findViewById(R.id.TheFourthCC);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Examination_Conscience_PageDirections.ActionExaminationConsciencePageToTheFourthCommandmentChildrenPage action =
                        Examination_Conscience_PageDirections.actionExaminationConsciencePageToTheFourthCommandmentChildrenPage();
                Navigation.findNavController(v).navigate(action);
            }
        });

        Button button6 = getView().findViewById(R.id.TheFifthC);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Examination_Conscience_PageDirections.ActionExaminationConsciencePageToTheFifthCommandmentPage action =
                        Examination_Conscience_PageDirections.actionExaminationConsciencePageToTheFifthCommandmentPage();
                Navigation.findNavController(v).navigate(action);
            }
        });

        Button button7 = getView().findViewById(R.id.TheSixthAndNinthC);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Examination_Conscience_PageDirections.ActionExaminationConsciencePageToSixthAndNinthCommandmentPage action =
                        Examination_Conscience_PageDirections.actionExaminationConsciencePageToSixthAndNinthCommandmentPage();
                Navigation.findNavController(v).navigate(action);
            }
        });
        Button button8 = getView().findViewById(R.id.TheSixthAndNinthMP);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Examination_Conscience_PageDirections.ActionExaminationConsciencePageToSixthAndNinthCommandmentMarriedPeoplePage action =
                        Examination_Conscience_PageDirections.actionExaminationConsciencePageToSixthAndNinthCommandmentMarriedPeoplePage();
                Navigation.findNavController(v).navigate(action);
            }
        });

        Button button9 = getView().findViewById(R.id.TheSeventhAndTenthC);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Examination_Conscience_PageDirections.ActionExaminationConsciencePageToTheSeventhAndTenthCommandmentsPAge action =
                        Examination_Conscience_PageDirections.actionExaminationConsciencePageToTheSeventhAndTenthCommandmentsPAge();
                Navigation.findNavController(v).navigate(action);
            }
        });

        Button button10 = getView().findViewById(R.id.TheEighthC);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Examination_Conscience_PageDirections.ActionExaminationConsciencePageToTheEighthCommandmentPage action =
                        Examination_Conscience_PageDirections.actionExaminationConsciencePageToTheEighthCommandmentPage();
                Navigation.findNavController(v).navigate(action);
            }
        });

        ImageButton button11 = getView().findViewById(R.id.ExaminetoPrep);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Examination_Conscience_PageDirections.ActionExaminationConsciencePageToPreparationPage action =
                       Examination_Conscience_PageDirections.actionExaminationConsciencePageToPreparationPage();
                Navigation.findNavController(v).navigate(action);
            }
        });

        ImageButton button12 = getView().findViewById(R.id.ExaminetoRepPrayer);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Examination_Conscience_PageDirections.ActionExaminationConsciencePageToPrayerRepentancePage action =
                        Examination_Conscience_PageDirections.actionExaminationConsciencePageToPrayerRepentancePage();
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
