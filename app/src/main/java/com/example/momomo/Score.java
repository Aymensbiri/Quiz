package com.example.momomo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Score extends AppCompatActivity {

    TextView tvscore;
    ProgressBar pb;
    Button bt, bl;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        tvscore = findViewById(R.id.tvScore);
        pb = findViewById(R.id.progressBar);
        bt = findViewById(R.id.bt);
        bl = findViewById(R.id.bl);
        Intent i1 = getIntent();
        int score = i1.getIntExtra("score", 0);
        tvscore.setText(score * 20+ "%");
        pb.setProgress(score * 20);
        pb.setMax(100);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(getApplicationContext(), Quiz1.class);
                startActivity(i2);
                finish();
            }

        });
        bl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i3);
                finish();
            }
        });
    }
}
