package com.example.momomo;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.content.Intent;

public class Quiz1 extends AppCompatActivity {
    RadioGroup rg;
    Button next;
    int score;
    String correctResponse = "Mars";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);

        rg = findViewById(R.id.rg);
        next = findViewById(R.id.next);
        Intent i1=getIntent();
        score= i1.getIntExtra("score",0);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int checkedId = rg.getCheckedRadioButtonId();
                if (checkedId != -1) {
                    RadioButton selectedRadioButton = findViewById(checkedId);
                    String selectedResponse = selectedRadioButton.getText().toString();
                    if (selectedResponse.equals(correctResponse)) {
                        score++;
                        startActivity(new Intent(Quiz1.this, Quiz2.class));
                        finish();
                    }
                } else {
                    Toast.makeText(Quiz1.this, "Please select an option", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
