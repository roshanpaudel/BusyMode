package com.example.android.busymode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView editBtn1;
    ImageView editBtn2;
    ImageView editBtn3;
    ImageView editBtn4;
    ImageView editBtn5;
    ImageView editBtn6;

    TextView title1;
    TextView title2;
    TextView title3;
    TextView title4;
    TextView title5;
    TextView title6;

    TextView count1;
    TextView count2;
    TextView count3;
    TextView count4;
    TextView count5;
    TextView count6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final DatabaseHandler db = new DatabaseHandler(this);

        editBtn1 = (ImageView) findViewById(R.id.edit1);
        editBtn2 = (ImageView) findViewById(R.id.edit2);
        editBtn3 = (ImageView) findViewById(R.id.edit3);
        editBtn4 = (ImageView) findViewById(R.id.edit4);
        editBtn5 = (ImageView) findViewById(R.id.edit5);
        editBtn6 = (ImageView) findViewById(R.id.edit6);

        title1 = (TextView) findViewById(R.id.title1);
        title2 = (TextView) findViewById(R.id.title2);
        title3 = (TextView) findViewById(R.id.title3);
        title4 = (TextView) findViewById(R.id.title4);
        title5 = (TextView) findViewById(R.id.title5);
        title6 = (TextView) findViewById(R.id.title6);

        count1 = (TextView) findViewById(R.id.count1);
        count2 = (TextView) findViewById(R.id.count2);
        count3 = (TextView) findViewById(R.id.count3);
        count4 = (TextView) findViewById(R.id.count4);
        count5 = (TextView) findViewById(R.id.count5);
        count6 = (TextView) findViewById(R.id.count6);

        try {
            Information info1 = db.getInfo(1);
            Information info2 = db.getInfo(2);
            Information info3 = db.getInfo(3);
            Information info4 = db.getInfo(4);
            Information info5 = db.getInfo(5);
            Information info6 = db.getInfo(6);

            title1.setText(info1.getMessageSub());
            count1.setText(info1.getMessageDes());
            title2.setText(info2.getMessageSub());
            count2.setText(info2.getMessageDes());
            title3.setText(info3.getMessageSub());
            count3.setText(info3.getMessageDes());
            title4.setText(info4.getMessageSub());
            count4.setText(info4.getMessageDes());
            title5.setText(info5.getMessageSub());
            count5.setText(info5.getMessageDes());
            title6.setText(info6.getMessageSub());
            count6.setText(info6.getMessageDes());
        }

        catch (Exception e){
            Log.e("Exception","I got Error",e);
        }
        /***
        Information info2 =  db.getInfo(2);
        title2.setText(info2.getMessageSub());
        count2.setText(info2.getMessageDes());

        Information info3 =  db.getInfo(3);
        title3.setText(info3.getMessageSub());
        count3.setText(info3.getMessageDes());

        Information info4 =  db.getInfo(4);
        title4.setText(info4.getMessageSub());
        count4.setText(info4.getMessageDes());

        Information info5 =  db.getInfo(5);
        title5.setText(info5.getMessageSub());
        count5.setText(info5.getMessageDes());

        Information info6 =  db.getInfo(6);
        title6.setText(info6.getMessageSub());
        count6.setText(info6.getMessageDes());
        ****/




        editBtn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int cardNo = 1;
                Intent intentEdit = new Intent(MainActivity.this,Message.class);
                intentEdit.putExtra("cardNo",cardNo);
                startActivity(intentEdit);
            }
        });

        editBtn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int cardNo = 2;
                Intent intentEdit = new Intent(MainActivity.this,Message.class);
                intentEdit.putExtra("cardNo",cardNo);
                startActivity(intentEdit);
            }
        });

        editBtn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int cardNo = 3;
                Intent intentEdit = new Intent(MainActivity.this,Message.class);
                intentEdit.putExtra("cardNo",cardNo);
                startActivity(intentEdit);
            }
        });

        editBtn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int cardNo = 4;
                Intent intentEdit = new Intent(MainActivity.this,Message.class);
                intentEdit.putExtra("cardNo",cardNo);
                startActivity(intentEdit);
            }
        });

        editBtn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int cardNo = 5;
                Intent intentEdit = new Intent(MainActivity.this,Message.class);
                intentEdit.putExtra("cardNo",cardNo);
                startActivity(intentEdit);
            }
        });

        editBtn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int cardNo = 6;
                Intent intentEdit = new Intent(MainActivity.this,Message.class);
                intentEdit.putExtra("cardNo",cardNo);
                startActivity(intentEdit);
            }
        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        final DatabaseHandler db = new DatabaseHandler(this);


        try {
            Information info1 = db.getInfo(1);
            Information info2 = db.getInfo(2);
            Information info3 = db.getInfo(3);
            Information info4 = db.getInfo(4);
            Information info5 = db.getInfo(5);
            Information info6 = db.getInfo(6);

            title1.setText(info1.getMessageSub());
            count1.setText(info1.getMessageDes());
            title2.setText(info2.getMessageSub());
            count2.setText(info2.getMessageDes());
            title3.setText(info3.getMessageSub());
            count3.setText(info3.getMessageDes());
            title4.setText(info4.getMessageSub());
            count4.setText(info4.getMessageDes());
            title5.setText(info5.getMessageSub());
            count5.setText(info5.getMessageDes());
            title6.setText(info6.getMessageSub());
            count6.setText(info6.getMessageDes());
        }
        catch (Exception e){
            Log.e("Exception","I got Error",e);
        }
    }
}
