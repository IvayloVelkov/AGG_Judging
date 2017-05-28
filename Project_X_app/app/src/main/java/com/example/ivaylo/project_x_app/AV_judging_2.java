package com.example.ivaylo.project_x_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AV_judging_2 extends AppCompatActivity {

    Button nextBTN;
    Button prevBTN;
    String score;
    double final_result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_av_judging_2);

        nextBTN = (Button) findViewById(R.id.nextBTN);
        prevBTN = (Button) findViewById(R.id.prevBTN);

        nextBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startAV3 = new Intent(AV_judging_2.this, AV_judging_3.class);
                score = String.valueOf(final_result);
                startAV3.putExtra("Result", score);
                startActivity(startAV3);
            }
        });

        prevBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startAV1 = new Intent(AV_judging_2.this, AV_judging_1.class);
                startActivity(startAV1);
            }
        });
    }
}
