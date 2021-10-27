package com.example.listview11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String arr[] = {"This is ", "Item","Item2","Mail 1","Mail 1","Mail 2","Mail 3","Mail 4","Mail 5","Mail 6","Mail 7"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listview);
        // Using builtin array adapter
   //    ArrayAdapter  ad = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arr);
//        listView.setAdapter(ad);
        // Using custom adapter
       YashAdapter ad = new YashAdapter(this, R.layout.my_layout,arr);
        listView.setAdapter(ad);

        // Listener on Array adapter listview
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(MainActivity.this, "You Clicked on: " + i, Toast.LENGTH_SHORT).show();
//            }
//        });
    }
}
