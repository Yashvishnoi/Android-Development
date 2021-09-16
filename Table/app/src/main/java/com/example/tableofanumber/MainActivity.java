package com.example.tableofanumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv9,tv,tv3,tv4,tv5,tv6,tv7,tv8,tv10,tv2;
    EditText EDt;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv9 = findViewById(R.id.tv9);
        tv = findViewById(R.id.tv);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        tv5 = findViewById(R.id.tv5);
        tv6 = findViewById(R.id.tv6);
        tv7 = findViewById(R.id.tv7);
        tv8 = findViewById(R.id.tv8);
        tv10 = findViewById(R.id.tv10);
        tv2 = findViewById(R.id.tv2);
        EDt = findViewById(R.id.EDt);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(EDt.getText().toString());
                tv9.setText( a +" * "+ 1 +"="+a*1);
                tv.setText( a +" * "+ 2 +"="+a*2);
                tv3.setText( a +" * "+ 3 +"="+a*3);
                tv4.setText( a +" * "+ 4 +"="+a*4);
                tv5.setText( a +" * "+ 5 +"="+a*5);
                tv6.setText( a +" * "+ 6 +"="+a*6);
                tv7.setText( a +" * "+ 7 +"="+a*7);
                tv8.setText( a +" * "+ 8 +"="+a*8);
                tv10.setText( a +" * "+ 9 +"="+a*9);
                tv2.setText( a +" * "+ 10 +"="+a*10);
                Toast.makeText(MainActivity.this, "Checkout in left", Toast.LENGTH_SHORT).show();
            }
            
       });
    }
    }
