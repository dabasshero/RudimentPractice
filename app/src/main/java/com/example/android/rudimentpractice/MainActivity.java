package com.example.android.rudimentpractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openSingleStrokeRudiments(View view) {
        Intent i = new Intent(this, SingleStrokeRudActivity.class);
        startActivity(i);
    }

    public void openDoubleStrokeRudments(View view) {
        Intent j = new Intent(this, DoubleStrokeRudActivity.class);
        startActivity(j);
    }
}
