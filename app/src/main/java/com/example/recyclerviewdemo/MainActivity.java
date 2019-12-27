package com.example.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    ArrayList<String> titleData;
    ArrayList<Integer> imagesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Integer> imageData = new ArrayList<>();
        imageData.add(R.drawable.food_1);
        imageData.add(R.drawable.food_2);
        imageData.add(R.drawable.food_3);
        imageData.add(R.drawable.food_4);
        imageData.add(R.drawable.food_5);
        imageData.add(R.drawable.food_6);
        imageData.add(R.drawable.food_7);
        imageData.add(R.drawable.food_8);


        ArrayList<String> dataValues = new ArrayList<>();
        dataValues.add("Java");
        dataValues.add("Python");
        dataValues.add("JavaScript");
        dataValues.add("Ruby on Rails");
        dataValues.add("Angular");
        dataValues.add("React JS");
        dataValues.add("Flutter");
        dataValues.add("React Native");

        recyclerView = findViewById(R.id.myRecyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(new RecyclerViewAdapter(dataValues, imageData));
    }
}
