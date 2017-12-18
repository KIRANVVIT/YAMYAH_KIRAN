package com.example.vihari.sms;

import android.app.Activity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.mkyong.android.R;

class SendSMSActivity extends Activity {

    ImageButton buttonSend;
    EditText textPhoneNo;
    EditText textSMS;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSend = (ImageButton) findViewById(R.id.button);
        textPhoneNo = (EditText) findViewById(R.id.editText);
        textSMS = (EditText) findViewById(R.id.editText2);



        buttonSend.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                String phoneNo = textPhoneNo.getText().toString();
                String sms = textSMS.getText().toString();
                if (textPhoneNo.getText().toString().length() == 0)
                    textPhoneNo.setError("Enter Phone Number");
                else if (textSMS.getText().toString().length() == 0) {
                    textSMS.setError("Enter Message");
                } else {
                    try {
                        SmsManager smsManager = SmsManager.getDefault();
                        smsManager.sendTextMessage(phoneNo, null, sms, null, null);
                        Toast.makeText(getApplicationContext(), "SMS Sent!",
                                Toast.LENGTH_LONG).show();
                    } catch (Exception e) {
                        Toast.makeText(getApplicationContext(),
                                "SMS faild, please try again later!",
                                Toast.LENGTH_LONG).show();
                        e.printStackTrace();
                    }

                }
            }
        });
    }
}
