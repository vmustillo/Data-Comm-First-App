package com.vmust.sinhafirstlab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.vmust.sinhafirstlab.R.id.nslookup_button;

public class MainActivity extends AppCompatActivity {

    public Button nslookup_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nslookupClick(View view) {
        Intent ns = new Intent(MainActivity.this, NslookupActivity.class);
        startActivity(ns);
    }

    public void netstatClick(View view) {
        Intent net = new Intent(MainActivity.this, NetstatActivity.class);
        startActivity(net);
    }

    public void pingClick(View view) {
        Intent p = new Intent(MainActivity.this, PingActivity.class);
        startActivity(p);
    }

    public void tracertClick(View view) {
        Intent trace = new Intent(MainActivity.this, TracertActivity.class);
        startActivity(trace);
    }
}
