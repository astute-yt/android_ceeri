package com.example.batterymonitor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click(View view){
        Toast.makeText(this, "opening the data page", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, DataPage.class);
        startActivity(intent);
    }
}