package com.example.selltrail.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.selltrail.R;
import com.example.selltrail.fragments.DetailFragment;
import com.example.selltrail.fragments.ReviewFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DetailActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    DetailFragment detailFragment;
    ReviewFragment reviewFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        detailFragment=new DetailFragment();
        Bundle args = new Bundle();
        args.putString("Judul", getIntent().getExtras().getString("Judul"));
        args.putString("Code", getIntent().getExtras().getString("Code"));
        args.putString("Ket", getIntent().getExtras().getString("Ket"));
        detailFragment.setArguments(args);
        loadFragment(detailFragment);

        reviewFragment=new ReviewFragment();
        Bundle args2 = new Bundle();
        args2.putString("Review", getIntent().getExtras().getString("Review"));
        reviewFragment.setArguments(args2);
        BottomNavigationView bottomNavigationView = findViewById(R.id.navigation);
        // beri listener pada saat item/menu bottomnavigation terpilih
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .addToBackStack(null)
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Fragment fragment = null;
        switch (menuItem.getItemId()) {
            case R.id.action_detail:
                fragment = detailFragment;
                break;
            case R.id.action_review:
                fragment = reviewFragment;
                break;
        }
        return loadFragment(fragment);
    }
}
