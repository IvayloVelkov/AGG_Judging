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

public class AV_judging_2 extends Activity {

    Button nextBTN;
    CheckBox A_check1;
    CheckBox A_check2;
    CheckBox A_check3;
    CheckBox A_check4;
    CheckBox A_check5;
    CheckBox A_check6;
    CheckBox A_check7;
    CheckBox A_check8;
    CheckBox A_check9;
    CheckBox A_check10;
    CheckBox A_check11;
    CheckBox A_check12;

    double final_result = 0;
    //double send_result;
    //String score;
    Bundle extras;
    double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_av_judging_2);
        extras = getIntent().getExtras();
        final_result += extras.getDouble("Result");

        nextBTN = (Button) findViewById(R.id.nextBTN);
        A_check1 = (CheckBox) findViewById(R.id.check1);
        A_check2 = (CheckBox) findViewById(R.id.check2);
        A_check3 = (CheckBox) findViewById(R.id.check3);
        A_check4 = (CheckBox) findViewById(R.id.check4);
        A_check5 = (CheckBox) findViewById(R.id.check5);
        A_check6 = (CheckBox) findViewById(R.id.check6);
        A_check7 = (CheckBox) findViewById(R.id.check7);
        A_check8 = (CheckBox) findViewById(R.id.check8);
        A_check9 = (CheckBox) findViewById(R.id.check9);
        A_check10 = (CheckBox) findViewById(R.id.check10);
        A_check11 = (CheckBox) findViewById(R.id.check11);
        A_check12 = (CheckBox) findViewById(R.id.check12);

        A_check1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkbox = (CheckBox)v;
                if(checkbox.isChecked()) {
                    A_check1.setChecked(true);
                    final_result += 0.1;
                }
            }
        });

        A_check2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkbox = (CheckBox)v;
                if(checkbox.isChecked()) {
                    A_check2.setChecked(true);
                    final_result += 0.1;
                }
            }
        });

        A_check3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkbox = (CheckBox)v;
                if(checkbox.isChecked()) {
                    A_check3.setChecked(true);
                    final_result += 0.1;
                }
            }
        });

        A_check4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkbox = (CheckBox)v;
                if(checkbox.isChecked()) {
                    A_check4.setChecked(true);
                    final_result += 0.1;
                }
            }
        });

        A_check5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkbox = (CheckBox)v;
                if(checkbox.isChecked()) {
                    A_check5.setChecked(true);
                    final_result += 0.1;
                }
            }
        });

        A_check6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkbox = (CheckBox)v;
                if(checkbox.isChecked()) {
                    A_check6.setChecked(true);
                    final_result += 0.1;
                }
            }
        });

        A_check7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkbox = (CheckBox)v;
                if(checkbox.isChecked()) {
                    A_check7.setChecked(true);
                    final_result += 0.1;
                }
            }
        });

        A_check8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkbox = (CheckBox)v;
                if(checkbox.isChecked()) {
                    A_check8.setChecked(true);
                    final_result += 0.1;
                }
            }
        });

        A_check9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkbox = (CheckBox)v;
                if(checkbox.isChecked()) {
                    A_check9.setChecked(true);
                    final_result += 0.1;
                }
            }
        });

        A_check10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkbox = (CheckBox)v;
                if(checkbox.isChecked()) {
                    A_check10.setChecked(true);
                    final_result += 0.1;
                }
            }
        });

        A_check11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkbox = (CheckBox)v;
                if(checkbox.isChecked()) {
                    A_check11.setChecked(true);
                    final_result += 0.1;
                }
            }
        });

        A_check12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkbox = (CheckBox)v;
                if(checkbox.isChecked()) {
                    A_check12.setChecked(true);
                    final_result += 0.1;
                }
            }
        });

        nextBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startFinalAV = new Intent(AV_judging_2.this, AV_judging_3.class);
                result = final_result;
                startFinalAV.putExtra("Result", result);
                startActivity(startFinalAV);
            }
        });

    }
}
