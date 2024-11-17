package com.example.vehicles;

import android.os.Bundle;
import android.widget.ExpandableListView;

import androidx.appcompat.app.AppCompatActivity;

public class BikeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bike);

        ExpandableListView bikeExpandableListView = findViewById(R.id.bikeExpandableListView);

        String[] bikeTitles = {"Suzuki", "KTM", "Yamaha"};
        String[][] bikeSubtitles = {
                {"Hayabusa", "GSX-R1000"},
                {"Duke 390", "RC 200"},
                {"R1", "MT-15"}
        };
        Integer[] bikeImages = {R.drawable.suzuki, R.drawable.ktm, R.drawable.yamaha};

        BikeExpandableAdapter adapter = new BikeExpandableAdapter(this, bikeTitles, bikeSubtitles, bikeImages);
        bikeExpandableListView.setAdapter(adapter);
    }
}
