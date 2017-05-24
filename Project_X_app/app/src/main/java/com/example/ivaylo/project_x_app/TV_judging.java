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

public class TV_judging extends Activity {

    Button readyBTN;
    CheckBox A_check;
    CheckBox B_check;
    double balance_result;
    String score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tv_judging);

         readyBTN = (Button) findViewById(R.id.readyBTN);
         A_check = (CheckBox) findViewById(R.id.A_balance);
         B_check = (CheckBox) findViewById(R.id.B_balance);

        A_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkbox = (CheckBox)v;
                if(checkbox.isChecked()) {
                    B_check.setChecked(false);
                    balance_result = 0.1;
                }
            }
        });

        B_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkbox = (CheckBox)v;
                if(checkbox.isChecked()) {
                    A_check.setChecked(false);
                    balance_result = 0.2;
                }
            }

        });

        readyBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startFinal = new Intent(TV_judging.this, Final.class);
                score = String.valueOf(balance_result);
                startFinal.putExtra("Result", score);
                startActivity(startFinal);
            }
        });
    }
}
