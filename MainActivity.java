package com.example.vihari.loginregister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class  MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button bLogin;
    EditText etUserName,etpassword;
    TextView tvRegisterLink;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUserName=(EditText) findViewById(R.id.etUsername);
        etpassword=(EditText) findViewById(R.id.etPassword);
        bLogin = (Button) findViewById(R.id.bLogin);
        tvRegisterLink = (TextView) findViewById(R.id.tvRegisterLink);
        bLogin.setOnClickListener(this);
        tvRegisterLink.setOnClickListener(this);


    }
    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.bLogin:
                if (etUserName.getText().toString().length() == 0)
                    etUserName.setError("Enter Name");
              else  if (etpassword.getText().toString().length() == 0)
                    etpassword.setError("Enter Number");
                else {
                    startActivity(new Intent(this, Maps.class));

                }
                break;
            case R.id.tvRegisterLink:
                startActivity(new Intent(this,Register.class ));
                break;
        }
    }

public void userReg(View view)
{

}
    public  void userLogin(View view)
    {

    }


}
