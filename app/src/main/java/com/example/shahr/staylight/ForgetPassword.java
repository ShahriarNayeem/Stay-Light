package com.example.shahr.staylight;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ForgetPassword extends AppCompatActivity {

    private TextView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);

//        pressing back

        back = findViewById(R.id.backToLoginBtn);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ForgetPassword.this,LoginActivity.class);
                startActivity(i);
            }
        });
    }
}
