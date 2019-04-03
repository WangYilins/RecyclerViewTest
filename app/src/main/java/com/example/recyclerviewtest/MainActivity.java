package com.example.recyclerviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initFruits();

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);//横向滑动
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter fruitAdapter = new FruitAdapter(fruitList);
        recyclerView.setAdapter(fruitAdapter);
    }

    private void initFruits() {
        for (int i = 0; i < 2; i++) {
            Fruit apple = new Fruit("Apple",R.mipmap.ic_launcher);
            fruitList.add(apple);
            Fruit Banana = new Fruit("Banana",R.mipmap.ic_launcher);
            fruitList.add(Banana);
            Fruit Orange = new Fruit("Orange",R.mipmap.ic_launcher);
            fruitList.add(Orange);
            Fruit Pear = new Fruit("Pear",R.mipmap.ic_launcher);
            fruitList.add(Pear);
            Fruit Cherry = new Fruit("Cherry",R.mipmap.ic_launcher);
            fruitList.add(Cherry);
            Fruit Mango = new Fruit("Mango",R.mipmap.ic_launcher);
            fruitList.add(Mango);
            Fruit Grape = new Fruit("Grape",R.mipmap.ic_launcher);
            fruitList.add(Grape);
        }
    }
}
