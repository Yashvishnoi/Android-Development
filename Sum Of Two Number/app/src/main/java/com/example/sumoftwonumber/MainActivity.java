package com.example.sumoftwonumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
     TextView textView4;
     EditText n1,n2;
     Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView4 = findViewById(R.id.textView4);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sum = Integer.parseInt(n1.getText().toString()) +Integer.parseInt( n2.getText().toString());
                textView4.setText("Sum of two number is "+sum);
            }
        });
    }
}