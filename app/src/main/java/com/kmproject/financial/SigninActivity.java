package com.kmproject.financial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SigninActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        Button login;
        TextView signUp;


        login = findViewById(R.id.buttonLogin);
        signUp = findViewById(R.id.buttonSignUp);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent login = new Intent(SigninActivity.this, HomeActivity.class);
                startActivity(login);
            }
        });

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signUp = new Intent(SigninActivity.this, SignupActivity.class);
                startActivity(signUp);
            }
        });


    }
}