package com.example.selltrail.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.selltrail.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ReviewFragment extends Fragment {

TextView review;
    public ReviewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_review, container, false);
        review = view.findViewById(R.id.review);
        review.setText(getArguments().getString("Review"));
        return view;
    }

}
