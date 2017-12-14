package com.example.vihari.loginregister;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity implements View.OnClickListener{

    Button bRegister;
    EditText etName,etPhoneNumber,etPassword,etPassword2;
    String name,phonenum,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        etName = (EditText) findViewById(R.id.etName);
        etPhoneNumber = (EditText) findViewById(R.id.etPhoneNumber);
        etPassword = (EditText) findViewById(R.id.etPassword);
        etPassword2 = (EditText) findViewById(R.id.etPassword2);

        bRegister = (Button) findViewById(R.id.bRegister);
        bRegister.setOnClickListener(this);

    }
    @Override
    public void onClick(View v){
        String u=etPassword.getText().toString();
        String u2=etPassword2.getText().toString();
        switch(v.getId()) {
            case R.id.bRegister:
                if (etName.getText().toString().length() == 0)
                    etName.setError("Enter Name");
                else  if (etPhoneNumber.getText().toString().length() != 10) {
                    etPhoneNumber.setError("Enter Number");

                  Toast.makeText(this, "Enter 10 digits", Toast.LENGTH_SHORT).show();

                }

                else if (etPassword.getText().toString().length() < 6)
                    Toast.makeText(this, "Pwd Should be 6 characters", Toast.LENGTH_SHORT).show();
                else if (u.equals(u2)) {
                    startActivity(new Intent(this, WelocomeActivity.class));
                }
                else
                Toast.makeText(this, "Conform Password", Toast.LENGTH_SHORT).show();
                break;
        }
    }

}
