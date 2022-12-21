package com.ozzyozdil.landmarkbookjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ozzyozdil.landmarkbookjava.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {

    private ActivityDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        // intent
        Intent intent = getIntent();
        // Casting
        Landmark selectedLandmark = (Landmark) intent.getSerializableExtra("keyLandmark");

        // arraylistdeki verileri yerleştiriyouz
        binding.txtName.setText(selectedLandmark.getName());
        binding.txtCountry.setText(selectedLandmark.getCountry());
        binding.imageView.setImageResource(selectedLandmark.getImage());
    }
}