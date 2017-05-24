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
    double result;
    String score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tv_judging);

         readyBTN = (Button) findViewById(R.id.readyBTN);
         A_check = (CheckBox) findViewById(R.id.A_balance);
         B_check = (CheckBox) findViewById(R.id.B_balance);

        if(A_check.isChecked()){
            A_check.setChecked(false);
            result = 0.10;
        }
        else if(B_check.isChecked()){
            B_check.setChecked(false);
            result = 0.20;
        }
        else {
            result = 0.0;
       }

        readyBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startFinal = new Intent(TV_judging.this, Final.class);
                score = String.valueOf(result);
                startFinal.putExtra("Result", score);
                startActivity(startFinal);
            }
        });

    }


}
