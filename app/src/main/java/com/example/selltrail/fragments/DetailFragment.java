package com.example.selltrail.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.selltrail.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetailFragment extends Fragment {
TextView judul,deskripsi,harga;
ImageView detailgambar;

    public DetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_detail, container, false);
        judul = view.findViewById(R.id.judul);
        judul.setText(getArguments().getString("Judul"));

        harga = view.findViewById(R.id.harga);
        harga.setText(getArguments().getString("harga"));
        deskripsi = view.findViewById(R.id.deskripsi);

        deskripsi.setText(getArguments().getString("Ket"));
        detailgambar= view.findViewById(R.id.detailgambar);
        String code = getArguments().getString("Code");
        if(code.equals("0")){
            detailgambar.setBackgroundResource(R.drawable.crf);
        }else if(code.equals("1")) {
            detailgambar.setBackgroundResource(R.drawable.ktm);
        }else if(code.equals("2")){
            detailgambar.setBackgroundResource(R.drawable.yz);
        }else if(code.equals("3")){
            detailgambar.setBackgroundResource(R.drawable.kx);
        }else if(code.equals("4")){
            detailgambar.setBackgroundResource(R.drawable.rmz);
        }else if(code.equals("5")){
            detailgambar.setBackgroundResource(R.drawable.husqy);
        }else if(code.equals("6")) {
            detailgambar.setBackgroundResource(R.drawable.fizz);
        }else if(code.equals("7")) {
            detailgambar.setBackgroundResource(R.drawable.klx);
        }

            return view;

    }

}
