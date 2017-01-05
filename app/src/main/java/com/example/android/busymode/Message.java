package com.example.android.busymode;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

/**
 * Created by paudelroshan93 on 12/28/2016.
 */

    public class Message extends AppCompatActivity {

        Button submitBtn;
        EditText messageSub;
        EditText messageDes;
        String msgSub;
        String msgDes;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.message);

            final DatabaseHandler db = new DatabaseHandler(this);
            final int cardNo = getIntent().getExtras().getInt("cardNo");
            /// There can be error in the above line. Be cautious.Not sure about getInt method and final//

            submitBtn = (Button) findViewById(R.id.msg_submit);
            messageDes = (EditText) findViewById(R.id.message_des);
            messageSub = (EditText) findViewById(R.id.message_sub);

            Information info = db.getInfo(cardNo);
            messageSub.setText(info.getMessageSub());
            messageDes.setText(info.getMessageDes());

            submitBtn.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    msgSub = messageSub.getText().toString();
                    msgDes = messageDes.getText().toString();

                    if(msgSub.equals("")||msgSub.equals("")){
                        Toast.makeText(Message.this,"Please write the message",Toast.LENGTH_SHORT).show();
                    }
                    else {
                        db.resetSelect();
                        db.updateInfo(new Information(cardNo,1,msgSub, msgDes));
                        Toast.makeText(Message.this,""+Integer.toString(cardNo),Toast.LENGTH_SHORT).show();

                        // Reading all contacts
                        Log.d("Reading: ", "Reading all contacts..");
                        List<Information> messages = db.getAllMessage();

                        for (Information info : messages) {
                            String log = "Id: " + info.getID() + " ,Topic: " + info.getMessageSub() + " ,Description: " + info.getMessageDes() + " ,Select: " + info.getSelected();
                            // Writing Contacts to log
                            Log.d("NameRoshan: ", log);
                        }
                        finish();
                    }

                }
            });

        }
}
