package com.example.cardview_with_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String name[], readMe[];
    int images[] = {
            R.drawable.album1, R.drawable.album2, R.drawable.album3, R.drawable.album4,
            R.drawable.album5, R.drawable.album6, R.drawable.album7, R.drawable.album8,
            R.drawable.album9, R.drawable.album10, R.drawable.album11
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);

        name = getResources().getStringArray(R.array.name);
        readMe = getResources().getStringArray(R.array.readme);

        MyAdapter myAdapter = new MyAdapter(MainActivity.this,name,readMe,images);

        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));


       /*

        ********##By this two line of code recyclerView can be gridview
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),2, LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(gridLayoutManager);

*/





    }
}