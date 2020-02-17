package com.aesbg.testproject;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


public class CompleteCarRegistration extends Fragment {

    private OnFragmentInteractionListener mListener;
    private View view;
    private ImageView carLogo;

    private String VW_LOGO_LINK = "http://goapiprod.skootride.com/storage/vw-240pt.png";


    public CompleteCarRegistration() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_complete_car_registration, container, false);

        carLogo = (ImageView)view.findViewById(R.id.car_logo);

        //Load image from url
        (Picasso.with(getContext()).load(VW_LOGO_LINK)).into(carLogo);

        return view;
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

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }
}
