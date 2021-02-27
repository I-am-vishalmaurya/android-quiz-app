package com.example.quizzer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class registerActivity extends AppCompatActivity {
    EditText username,password,confirmPassword;
    Button Signup, Signin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        username = (EditText)findViewById(R.id.RtextUsername);
        password = (EditText)findViewById(R.id.RtextPassword);
        confirmPassword = (EditText)findViewById(R.id.RtextcnfPassword);
        Signup = (Button)findViewById(R.id.Rbtnsignup);
        Signin = (Button)findViewById(R.id.Rbtnlogin);

        Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        Signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}