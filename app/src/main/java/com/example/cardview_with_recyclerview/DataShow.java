package com.example.cardview_with_recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DataShow extends AppCompatActivity {


    TextView realmepass,namePass;
    ImageView Imagepass;

    String namepass,realmePass;
    int imagepass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_show);
        namePass = findViewById(R.id.namePass);
        realmepass = findViewById(R.id.readmePass);
        Imagepass = findViewById(R.id.ImagePass);


        getdata();
        setdata();



    }
    private void getdata(){
        if(getIntent().hasExtra("namepass") && getIntent().hasExtra("realmepass") && getIntent().hasExtra("imagepass") ){
            namepass = getIntent().getStringExtra("namepass");
            realmePass = getIntent().getStringExtra("realmepass");
            imagepass = getIntent().getIntExtra("imagepass",1);
        }else {
            Toast.makeText(this,"No DATA",Toast.LENGTH_LONG);
        }

    }
    private void setdata(){
        namePass.setText(namepass);
        realmepass.setText(realmePass);
        Imagepass.setImageResource(imagepass);

    }
}