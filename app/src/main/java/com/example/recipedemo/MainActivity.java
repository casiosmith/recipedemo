package com.example.recipedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    private GridView gridView;
    int [] pic = {R.drawable.chicken_roll,R.drawable.donut,R.drawable.dosa,R.drawable.pancake,R.drawable.pasta};
    String [] foodNames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        foodNames=getResources().getStringArray(R.array.food);
        gridView = (GridView) findViewById(R.id.gridViewId);

        CustomAdapter adapter = new CustomAdapter(this,foodNames,pic);
        gridView.setAdapter(adapter);
    }
}