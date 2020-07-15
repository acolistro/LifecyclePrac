package com.example.lifecycleprac;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button showGuess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showGuess = findViewById(R.id.button_guess);

        showGuess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ShowGuess.class);
                intent.putExtra("guess", "Hello there");
                startActivity(intent);

                //alternative way to write:
                //startActivity(new Intent(MainActivity.this, ShowGuess.class));
            }
        });

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