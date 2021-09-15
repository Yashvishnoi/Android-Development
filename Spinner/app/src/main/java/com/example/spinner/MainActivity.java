package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Spinner spn;
    TextView tv;
    String country[]={"Please Select a country","India","USA","NewZealand","Africa","UAE"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spn=(Spinner) findViewById(R.id.spinner);
        tv=(TextView) findViewById(R.id.textView);

    }
}