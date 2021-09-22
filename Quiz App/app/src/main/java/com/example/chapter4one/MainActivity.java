package com.example.chapter4one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btn;
TextView textView3;
    private String[] questions ={"Java is a person?" , "Java was introduced in 1975","Java is Compiler & Interpreter language?", "Java was created using python","Java is G.O.A.T  or not"};
    private boolean[] answers ={false, false,true,false,true};
    private int score =0;
    private  int index = 0;
    Button yes;
    Button no;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.google.com"));
                startActivity(intent);
            }
        });
        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        textView3 = findViewById(R.id.textView3);
        textView3.setText(questions[index]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // If the array is not going out of bounds
                if (index <= questions.length - 1) {
                    // If you have given correct answer
                    if (answers[index] == true) {
                        score++;
                    }
                    // Goto next Question
                    index++;
                    if (index <= questions.length - 1) {
                        textView3.setText(questions[index]);
                    } else {
                        Toast.makeText(MainActivity.this, "Your Score is " + score, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Restart to play it again", Toast.LENGTH_SHORT).show();
                }
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index <= questions.length - 1) {

                    if (answers[index] == false) {
                        score++;
                    }
                    index++;
                    if (index <= questions.length - 1) {
                        textView3.setText(questions[index]);
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Your Score is " + score, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Restart to play it again", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
    }