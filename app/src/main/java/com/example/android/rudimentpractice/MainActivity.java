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

    public void openMultipleRudiments(View view) {
        Intent k = new Intent(this, MultipleRollRudActivity.class);
        startActivity(k);
    }

    public void openDiddleStrokeRudiments(View view) {
        Intent l = new Intent(this, DiddleStrokeRudActivity.class);
        startActivity(l);
    }

    public void openFlamRudiments(View view) {
        Intent m = new Intent(this, FlamRudActivity.class);
        startActivity(m);
    }

    public void openDragRudiments(View view) {
        Intent n = new Intent(this, DragRudActivity.class);
        startActivity(n);
    }
}
