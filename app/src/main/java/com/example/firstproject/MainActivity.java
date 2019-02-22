package com.example.firstproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "It started", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onResume() {

        super.onResume();
        Toast.makeText(this, "Resumed", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {

        super.onPause();
        Toast.makeText(this, "paused", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Toast.makeText(this, "Stopped", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Toast.makeText(this, "Destroyed", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        Toast.makeText(this, "Restarted", Toast.LENGTH_LONG).show();
    }
}
