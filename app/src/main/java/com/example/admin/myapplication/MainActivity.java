package com.example.admin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int vCount =0;
    int hCount =0;
    TextView tvHome,tvVistor;
    Button btnVistor,btnHome,btnReset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         tvHome =(TextView)findViewById(R.id.tvHome);
         tvVistor =(TextView)findViewById(R.id.tvVistor);
         btnHome =(Button)findViewById(R.id.btnHome);
         btnVistor =(Button)findViewById(R.id.btnVistor);
         btnReset =(Button)findViewById(R.id.btnReset);


        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hCount= hCount+1;
                tvHome.setText(" "+hCount);
            }
        });
        btnVistor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vCount= vCount+ 1;
                tvVistor.setText(" "+vCount);
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               tvVistor.setText("0");
                tvHome.setText("0");

            }
        });





    }
}
