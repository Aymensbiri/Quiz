package com.example.momomo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText Mail,password;
    Button sign;
    TextView register;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Mail=findViewById(R.id.email);
        password=findViewById(R.id.password);
        sign=findViewById(R.id.signin);
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Mail.getText().toString().equals("aymoud") && password.getText().toString().equals("6378")) {
                    Intent intent = new Intent(getApplicationContext(), Quiz1.class);
                    startActivity(intent);
                } else {

                    Toast.makeText(getApplicationContext(), "login et password incorrects", Toast.LENGTH_SHORT).show();
                    register = findViewById(R.id.Register);
                    register.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent2 = new Intent(getApplicationContext(), Register.class);
                            startActivity(intent2);

                        }


                    });
                }
            }


        });

        }
    }


