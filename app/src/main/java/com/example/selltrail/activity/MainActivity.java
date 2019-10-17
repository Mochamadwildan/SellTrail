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
        intent.putExtra("Judul", "HONDA CRF 250CC");
        intent.putExtra("Code", "0");
        intent.putExtra("Ket", "Harga motor trail CRF pada model ini memang dibanderol dengan harga yang cukup mahal");
        intent.putExtra("Review", "ini review ");
        startActivity(intent);
    }
    public void Detail1(View view) {
        Intent intent = new Intent( this, DetailActivity.class);
        intent.putExtra("Judul", "KTM EXc-F 250CC");
        intent.putExtra("Code", "1");
        intent.putExtra("Ket", "Harga motor trail KTM pada model ini memang dibanderol dengan harga yang cukup mahal");
        intent.putExtra("Review", "ini review 1");
        startActivity(intent);
    }  public void Detail2(View view) {
        Intent intent = new Intent( this, DetailActivity.class);
        intent.putExtra("Judul", "YAMAHA YZ 250CC");
        intent.putExtra("Code", "2");
        intent.putExtra("Ket", "Harga motor trail YZ pada model ini memang dibanderol dengan harga yang cukup mahal");
        intent.putExtra("Review", "ini review 2");
        startActivity(intent);
    }  public void Detail3(View view) {
        Intent intent = new Intent( this, DetailActivity.class);
        intent.putExtra("Judul", "KAWASAKI KX 250CC");
        intent.putExtra("Code", "3");
        intent.putExtra("Ket", "Harga motor trail KX pada model ini memang dibanderol dengan harga yang cukup mahal");
        intent.putExtra("Review", "ini review 3");
        startActivity(intent);
    }  public void Detail4(View view) {
        Intent intent = new Intent( this, DetailActivity.class);
        intent.putExtra("Judul", "SUZUKI RMZ 250CC");
        intent.putExtra("Code", "4");
        intent.putExtra("Ket", "Harga motor trail RMZ pada model ini memang dibanderol dengan harga yang cukup mahal");
        intent.putExtra("Review", "ini review 4");
        startActivity(intent);
    }  public void Detail5(View view) {
        Intent intent = new Intent( this, DetailActivity.class);
        intent.putExtra("Judul", "HUSQVARNA 250CC");
        intent.putExtra("Code", "5");
        intent.putExtra("Ket", "Harga motor trail HUSQVARNA pada model ini memang dibanderol dengan harga yang cukup mahal");
        intent.putExtra("Review", "ini review 5");
        startActivity(intent);
    }  public void Detail6(View view) {
        Intent intent = new Intent( this, DetailActivity.class);
        intent.putExtra("Judul", "ODONG-ODONG FIZZ BALAP");
        intent.putExtra("Code", "6");
        intent.putExtra("Ket", "Harga motor trail ODONG-ODONG FIZZ pada model ini memang dibanderol dengan harga yang cukup murah");
        intent.putExtra("Review", "ini review 6");
        startActivity(intent);
    }
}
