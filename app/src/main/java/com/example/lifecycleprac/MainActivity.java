package com.example.lifecycleprac;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //show when onCreate() is triggered
        Toast.makeText(MainActivity.this, "onCreate() called",
                Toast.LENGTH_SHORT)
                .show();
    }

    @Override
    protected void onStart() {
        super.onStart();

        //show when onStart() is triggered
        Toast.makeText(MainActivity.this, "onStart() called",
                Toast.LENGTH_SHORT)
                .show();

    }

    @Override
    protected void onPostResume() {
        super.onPostResume();

        //show when onPostResume() is triggered
        Toast.makeText(MainActivity.this, "onPostResume() called",
                Toast.LENGTH_SHORT)
                .show();
    }

    @Override
    protected void onPause() {
        super.onPause();

        //show when onPause() is triggered
        Toast.makeText(MainActivity.this, "onPause() called",
                Toast.LENGTH_SHORT)
                .show();
    }

    @Override
    protected void onStop() {
        super.onStop();

        //show when onStop() is triggered
        Toast.makeText(MainActivity.this, "onStop() called",
                Toast.LENGTH_SHORT)
                .show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        //show when onDestroy() is triggered
        Toast.makeText(MainActivity.this, "onDestroy() called",
                Toast.LENGTH_SHORT)
                .show();
    }
}