package com.example.newsmth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ArrayList<Integer> numbers = new ArrayList<>(10000);
//        for (int i = 0; i < 10000; i++) {
//            numbers.add(i, i+1);
//        }
//        ListView listView = this.findViewById(R.id.recyclerview);
//        listView.setAdapter(new ResultAdapter(this, numbers));
        NumbersRVAdapter numbersRVAdapter = new NumbersRVAdapter();
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        //recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 3));
        recyclerView.setAdapter(numbersRVAdapter);
    }

}