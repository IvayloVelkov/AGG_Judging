package com.example.ivaylo.project_x_app;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Checkable;

public class AV_judging_4 extends Activity {

    Button readyBTN;
    CheckBox A_check1;
    CheckBox A_check2;
    CheckBox A_check3;
    CheckBox A_check4;
    CheckBox A_check5;
    CheckBox A_check6;

    double final_result;
    String score;
    Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_av_judging_4);

        readyBTN = (Button) findViewById(R.id.readyBTN);
        A_check1 = (CheckBox) findViewById(R.id.check1);
        A_check2 = (CheckBox) findViewById(R.id.check2);
        A_check3 = (CheckBox) findViewById(R.id.check3);
        A_check4 = (CheckBox) findViewById(R.id.check4);
        A_check5 = (CheckBox) findViewById(R.id.check5);
        A_check6 = (CheckBox) findViewById(R.id.check6);
        extras = getIntent().getExtras();
        final_result += extras.getDouble("Result");

        A_check1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkbox = (CheckBox)v;
                if(checkbox.isChecked()) {
                    A_check1.setChecked(true);
                    final_result -= 0.1;
                }
            }
        });

        A_check2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkbox = (CheckBox)v;
                if(checkbox.isChecked()) {
                    A_check2.setChecked(true);
                    final_result -= 0.2;
                }
            }
        });

        A_check3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkbox = (CheckBox)v;
                if(checkbox.isChecked()) {
                    A_check3.setChecked(true);
                    final_result -= 0.1;
                }
            }
        });

        A_check4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkbox = (CheckBox)v;
                if(checkbox.isChecked()) {
                    A_check4.setChecked(true);
                    final_result -= 0.5;
                }
            }
        });

        A_check5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkbox = (CheckBox)v;
                if(checkbox.isChecked()) {
                    A_check5.setChecked(true);
                    final_result -= 0.1;
                }
            }
        });

        A_check6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkbox = (CheckBox)v;
                if(checkbox.isChecked()) {
                    A_check6.setChecked(true);
                    final_result -= 0.3;
                }
            }
        });

        readyBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startFinal = new Intent(AV_judging_4.this, Final.class);
                score = String.valueOf(final_result);
                startFinal.putExtra("Result", score);
                startActivity(startFinal);
            }
        });
    }
}