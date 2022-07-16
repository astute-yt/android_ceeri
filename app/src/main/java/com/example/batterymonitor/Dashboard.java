package com.example.batterymonitor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }
    public void click2(View view){
        Toast.makeText(this, "Loading the sensor readings", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, SensorReadings.class);
        startActivity(intent);
    }
    public void click3(View view){
        Toast.makeText(this, "Logging out", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}