package com.example.android.busymode;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by paudelroshan93 on 12/28/2016.
 */

    public class Message extends AppCompatActivity {

        Button submitBtn;
        EditText messageSub;
        EditText messageDes;
        String message;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.message);

            submitBtn = (Button) findViewById(R.id.msg_submit);
            messageDes = (EditText) findViewById(R.id.message_des);
            messageSub = (EditText) findViewById(R.id.message_sub);

            submitBtn.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    message = messageDes.getText().toString();

                    if(message.equals("")){
                        Toast.makeText(Message.this,"Please write the message",Toast.LENGTH_SHORT).show();
                    }
                    else {
                        messageDes.setText("");
                        messageSub.setText("");
                        Toast.makeText(Message.this,"Message being set..",Toast.LENGTH_SHORT).show();
                    }

                }
            });

        }
}
