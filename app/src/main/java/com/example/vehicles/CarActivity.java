package com.example.vehicles;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class CarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);

        ListView listView = findViewById(R.id.carListView);

        String[] titles = {"Bentley Car", "Hyundai Car", "New Ford"};
        String[] subtitles = {"Luxury and comfort", "Affordable and reliable", "Performance-oriented"};
        Integer[] images = {R.drawable.bentley, R.drawable.hyundai, R.drawable.newford};

        CarAdapter adapter = new CarAdapter(this, titles, subtitles, images);
        listView.setAdapter(adapter);
    }
}
