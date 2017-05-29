package com.example.ivaylo.project_x_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class AV_judging_1 extends AppCompatActivity {

    Button nextBTN, plus1, plus2, plus3, plus4;
    TextView score1 , score2, score3, score4;
    String score;
    double result1 = 0.0, result2 = 0.0, result3 = 0.0, result4 = 0.0;
    double final_result;
    double result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        nextBTN = (Button) findViewById(R.id.nextBTN);
        plus1 = (Button) findViewById(R.id.plus1);
        score1 = (TextView) findViewById(R.id.score1);
        plus2 = (Button) findViewById(R.id.plus2);
        score2 = (TextView) findViewById(R.id.score2);
        plus3 = (Button) findViewById(R.id.plus3);
        score3 = (TextView) findViewById(R.id.score3);
        plus4 = (Button) findViewById(R.id.plus4);
        score4 = (TextView) findViewById(R.id.score4);

        plus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result1 >= 0.4){
                    Toast.makeText(AV_judging_1.this, "MAX value", Toast.LENGTH_SHORT).show();
                }
                else {
                    result1 += 0.1;
                    score = String.valueOf(result1);
                    score1.setText("Score:" + score);
                    final_result += result1;
                }
            }
        });

        plus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result2 >= 0.2){
                    Toast.makeText(AV_judging_1.this, "MAX value", Toast.LENGTH_SHORT).show();
                }
                else {
                    result2 += 0.1;
                    score = String.valueOf(result2);
                    score2.setText("Score:" + score);
                    final_result += result2;
                }
            }
        });

        plus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result3 >= 0.3){
                    Toast.makeText(AV_judging_1.this, "MAX value", Toast.LENGTH_SHORT).show();
                }
                else {
                    result3 += 0.1;
                    score = String.valueOf(result3);
                    score3.setText("Score:" + score);
                    final_result += result3;
                }
            }
        });

        plus4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result4 >= 0.3){
                    Toast.makeText(AV_judging_1.this, "MAX value", Toast.LENGTH_SHORT).show();
                }
                else {
                    result4 += 0.1;
                    score = String.valueOf(result4);
                    score4.setText("Score:" + score);
                    final_result += result4;
                }
            }
        });

        nextBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startFinal = new Intent(AV_judging_1.this, AV_judging_2.class);
                result = final_result;
                startFinal.putExtra("Result", result);
                startActivity(startFinal);
            }
        });
    }
}
