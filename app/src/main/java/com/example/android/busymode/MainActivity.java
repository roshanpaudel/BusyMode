package com.example.android.busymode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView editBtn1;
    ImageView editBtn2;
    ImageView editBtn3;
    ImageView editBtn4;
    ImageView editBtn5;
    ImageView editBtn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editBtn1 = (ImageView) findViewById(R.id.edit1);
        editBtn2 = (ImageView) findViewById(R.id.edit2);
        editBtn3 = (ImageView) findViewById(R.id.edit3);
        editBtn4 = (ImageView) findViewById(R.id.edit4);
        editBtn5 = (ImageView) findViewById(R.id.edit5);
        editBtn6 = (ImageView) findViewById(R.id.edit6);

        editBtn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intentEdit = new Intent(MainActivity.this,Message.class);
                startActivity(intentEdit);
            }
        });

        editBtn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intentEdit = new Intent(MainActivity.this,Message.class);
                startActivity(intentEdit);
            }
        });

        editBtn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intentEdit = new Intent(MainActivity.this,Message.class);
                startActivity(intentEdit);
            }
        });

        editBtn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intentEdit = new Intent(MainActivity.this,Message.class);
                startActivity(intentEdit);
            }
        });

        editBtn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intentEdit = new Intent(MainActivity.this,Message.class);
                startActivity(intentEdit);
            }
        });

        editBtn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intentEdit = new Intent(MainActivity.this,Message.class);
                startActivity(intentEdit);
            }
        });
    }
}
