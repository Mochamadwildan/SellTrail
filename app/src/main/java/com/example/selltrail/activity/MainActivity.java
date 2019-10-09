package com.example.selltrail.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.selltrail.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void Detail(View view) {
        Intent intent = new Intent( this, DetailActivity.class);
        intent.putExtra("Judul", "CRF");
        startActivity(intent);
    }
}
