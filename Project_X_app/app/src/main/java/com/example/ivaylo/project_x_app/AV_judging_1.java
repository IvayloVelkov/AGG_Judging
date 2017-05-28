package com.example.ivaylo.project_x_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AV_judging_1 extends AppCompatActivity {

    Button nextBTN;
    String score;
    double final_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nextBTN = (Button) findViewById(R.id.nextBTN);

        nextBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startFinalAV = new Intent(AV_judging_1.this, AV_judging_2.class);
                score = String.valueOf(final_result);
                startFinalAV.putExtra("Result", score);
                startActivity(startFinalAV);
            }
        });

    }
}
