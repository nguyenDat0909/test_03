package com.example.test_03;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Button btLoad;

    List<String> countrylist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countrylist.add("VietNam");
        countrylist.add("US");
        countrylist.add("China");
        countrylist.add("Korea");
        countrylist.add("Thailand");

        recyclerView = findViewById(R.id.recyclerView);
        btLoad = findViewById(R.id.btLoad);

        btLoad.setOnClickListener(v -> {

            recyclerView.setLayoutManager(
                    new LinearLayoutManager(MainActivity.this)
            );

            MyAdapter adapter =
                    new MyAdapter(MainActivity.this, countrylist);

            recyclerView.setAdapter(adapter);
        });
    }
}