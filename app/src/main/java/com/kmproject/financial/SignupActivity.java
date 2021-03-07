package com.kmproject.financial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        TextView signIn;
        Button signUp;



        signIn = findViewById(R.id.signIn);
        signUp = findViewById(R.id.sigUp);

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signIn = new Intent(SignupActivity.this, SigninActivity.class);
                startActivity(signIn);
                finish();
                overridePendingTransition(R.anim.no_animation, R.anim.slide_out);
            }
        });

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signUp = new Intent(SignupActivity.this, SigninActivity.class);
                finish();
                startActivity(signUp);
                overridePendingTransition(R.anim.slide_in, R.anim.slide_in_out);
            }
        });

    }
}