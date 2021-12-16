package com.example.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView userRV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userRV = findViewById(R.id.userRV);
        userRV.setLayoutManager(new GridLayoutManager(this,2));

        DataAdapter dataAdapter = new DataAdapter();
        userRV.setAdapter(dataAdapter);
        dataAdapter.setData(getData());
    }

    private List<Data> getData() {
        List<Data> dataList = new ArrayList<>();
        for (int i=0; i<10; i++){
            dataList.add(new Data(Glide.with().load(userRV.), ));
        }
        return dataList;
    }
}