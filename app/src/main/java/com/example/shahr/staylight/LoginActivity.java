package com.example.shahr.staylight;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private Button lgbtn;
    private TextView newUser,forget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

//        Login button onclick listener

        lgbtn = findViewById(R.id.loginBtn);

        lgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this,SignUpActivity.class);
                startActivity(i);
            }
        });

//        newUser textedit onclicklistener

        newUser = findViewById(R.id.createAccount);

        newUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent user = new Intent(LoginActivity.this,SignUpActivity.class);
                startActivity(user);
            }
        });

//        forget password
        forget = findViewById(R.id.forgot_password);

        forget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent forget = new Intent(LoginActivity.this,ForgetPassword.class);
                startActivity(forget);
            }
        });
    }
}
