package com.example.vehicles;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnBikes=findViewById(R.id.btn_bikes);
        Button btnCars=findViewById(R.id.btn_cars);

        btnBikes.setOnClickListener(v->{
            Intent intent = new Intent(MainActivity.this, BikeActivity.class);
            startActivity(intent);
        });

        btnCars.setOnClickListener(v->{
            Intent intent = new Intent(MainActivity.this, CarActivity.class);
            startActivity(intent);
        });


    }
}