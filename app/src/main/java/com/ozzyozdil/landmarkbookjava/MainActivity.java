package com.ozzyozdil.landmarkbookjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.ozzyozdil.landmarkbookjava.databinding.ActivityMainBinding;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    ArrayList<Landmark> landmarkArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        landmarkArrayList = new ArrayList<>();

        // Data
        Landmark pisa = new Landmark("Pisa", "Italy", R.drawable.pisa);
        Landmark eiffel = new Landmark("Eiffel", "France", R.drawable.eiffel);
        Landmark colosseum = new Landmark("Colosseum", "Italy", R.drawable.colosseum);
        Landmark londonBridge = new Landmark("London Bridge", "UK", R.drawable.londonbridge);
        Landmark kizTower = new Landmark("Kız Tower", "Turkey", R.drawable.kizkulesi);
        Landmark galataTower = new Landmark("Galata Tower", "Turkey", R.drawable.galata);

        landmarkArrayList.add(pisa);
        landmarkArrayList.add(eiffel);
        landmarkArrayList.add(colosseum);
        landmarkArrayList.add(londonBridge);
        landmarkArrayList.add(kizTower);
        landmarkArrayList.add(galataTower);

        // Adapter
            // ListView
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                landmarkArrayList.stream().map(landmark -> landmark.getName()).collect(Collectors.toList())
        );
        binding.listView.setAdapter(arrayAdapter);

        // Click
        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                //Toast.makeText(MainActivity.this, landmarkArrayList.get(i).getName(), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                intent.putExtra("keyLandmark", landmarkArrayList.get(i));
                startActivity(intent);
            }
        });
    }
}