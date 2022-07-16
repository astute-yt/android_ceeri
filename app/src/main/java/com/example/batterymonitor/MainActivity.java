package com.example.batterymonitor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    String IDRegEx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_main);

        IDRegEx = "^[0-9]{8}$";
        final EditText vehID = findViewById(R.id.login_id);
        Button loginButton = findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pattern pattern = Pattern.compile(IDRegEx);
                Matcher matcher = pattern.matcher(vehID.getText().toString());
                if (vehID.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please Enter Vehicle ID", Toast.LENGTH_LONG).show();
                }
                else if (!matcher.find()) {
                    Toast.makeText(MainActivity.this, "Not a Valid ID", Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_LONG).show();
                    Intent intentmain = new Intent(MainActivity.this, BtActivity.class);
                    startActivity(intentmain);
                }
            }
        });
    }
    /*
    public void click(View view){
        Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();
        Intent intentmain = new Intent(MainActivity.this, BtActivity.class);
        startActivity(intentmain);
    }*/

    @Override
    public void onBackPressed() {
        Intent a = new Intent(Intent.ACTION_MAIN);
        a.addCategory(Intent.CATEGORY_HOME);
        a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(a);
    }
}