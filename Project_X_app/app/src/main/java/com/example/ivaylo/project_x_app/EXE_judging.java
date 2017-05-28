package com.example.ivaylo.project_x_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class EXE_judging extends AppCompatActivity {

    Button readyBTN, plus1, plus2, plus3, plus4, plus5, plus6, plus7;
    CheckBox tech;
    TextView score1 , score2, score3, score4, score5, score6, score7;
    String score;
    double result1 = 0.0, result2 = 0.0, result3 = 0.0, result4 = 0.0, result5 = 0.0, result6 = 0.0, result7 = 0.0, result8 = 0.0;
    double MAX_result = 10.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exe_judging);
        readyBTN = (Button) findViewById(R.id.readyBTN);
        plus1 = (Button) findViewById(R.id.plus1);
        score1 = (TextView) findViewById(R.id.score1);
        plus2 = (Button) findViewById(R.id.plus2);
        score2 = (TextView) findViewById(R.id.score2);
        plus3 = (Button) findViewById(R.id.plus3);
        score3 = (TextView) findViewById(R.id.score3);
        plus4 = (Button) findViewById(R.id.plus4);
        score4 = (TextView) findViewById(R.id.score4);
        plus5 = (Button) findViewById(R.id.plus5);
        score5 = (TextView) findViewById(R.id.score5);
        plus6 = (Button) findViewById(R.id.plus6);
        score6 = (TextView) findViewById(R.id.score6);
        plus7 = (Button) findViewById(R.id.plus7);
        score7 = (TextView) findViewById(R.id.score7);
        tech = (CheckBox) findViewById(R.id.AGG_tech);


        plus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1 += 0.1;
                score = String.valueOf(result1);
                score1.setText("Score:" + score);
                MAX_result -= result1;
            }
        });

        plus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result2 += 0.1;
                score = String.valueOf(result2);
                score2.setText("Score:" + score);
                MAX_result -= result2;
            }
        });

        plus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result3 += 0.1;
                score = String.valueOf(result3);
                score3.setText("Score:" + score);
                MAX_result -= result3;
            }
        });

        plus4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result4 += 0.1;
                score = String.valueOf(result4);
                score4.setText("Score:" + score);
                MAX_result -= result4;
            }
        });

        plus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result5 += 0.1;
                score = String.valueOf(result5);
                score5.setText("Score:" + score);
                MAX_result -= result5;
            }
        });

        plus6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result6 += 0.1;
                score = String.valueOf(result6);
                score6.setText("Score:" + score);
                MAX_result -= result6;
            }
        });

        plus7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result7 += 0.1;
                score = String.valueOf(result7);
                score7.setText("Score:" + score);
                MAX_result -= result7;
            }
        });

        tech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkbox = (CheckBox)v;
                if(checkbox.isChecked())
                    tech.setChecked(true);
                    result8 = 0.3;
                    score = String.valueOf(result8);
                MAX_result -= result8;
                }
        });

        if(MAX_result <= 0) {
            MAX_result = 0.0;
        }
        readyBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startFinal = new Intent(EXE_judging.this, Final.class);
                score = String.valueOf(MAX_result);
                startFinal.putExtra("Result", score);
                startActivity(startFinal);
            }
        });
    }
}


