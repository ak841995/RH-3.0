package com.example.dodob.rajasthan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Login_Guide extends AppCompatActivity {

    private EditText mpassword,memail;
    private Button msignin,mregister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__guide);



        msignin=(Button)findViewById(R.id.signin);
        mregister=(Button)findViewById(R.id.Register);




    }
}
