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
    CheckBox A_check_balance;
    CheckBox B_check_balance;
    CheckBox A_check_jump;
    CheckBox B_check_jump;
    CheckBox A_check_wave;
    CheckBox B_check_wave;
    CheckBox A_check_wool;
    CheckBox B_check_wool;
    CheckBox A_check_AB_1;
    CheckBox B_check_AB_1;
    CheckBox A_check_AB_2;
    CheckBox B_check_AB_2;
    CheckBox A_check_P;
    CheckBox B_check_P;
    CheckBox C_check_P;
    CheckBox A_check_P_1;
    CheckBox B_check_P_1;
    CheckBox C_check_P_1;
    CheckBox A_check_P_2;
    CheckBox B_check_P_2;
    CheckBox C_check_P_2;
    CheckBox A_check_P_3;
    CheckBox B_check_P_3;
    CheckBox C_check_P_3;;
    CheckBox A_check_P_4;
    CheckBox B_check_P_4;
    CheckBox C_check_P_4;
    CheckBox A_check_P_5;
    CheckBox B_check_P_5;
    CheckBox C_check_P_5;

    double final_result = 0;
    String score;
    int balance1 = 0,balance2 = 0,jump1 = 0,jump2 = 0,wave1 = 0,
            wave2 = 0,wool1 = 0,wool2 = 0,series11 = 0,series12 = 0,
            series21 = 0,series22 = 0,ABC11 = 0,ABC12 = 0,ABC13 = 0,
            ABC21 = 0,ABC22 = 0,ABC23 = 0 ,ABC31 = 0 ,ABC32 = 0,
            ABC33 = 0,ABC41 = 0,ABC42 = 0,ABC43 = 0,ABC51 = 0,
            ABC52 = 0,ABC53 = 0,ABC61 = 0,ABC62 = 0,ABC63 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tv_judging);

        readyBTN = (Button) findViewById(R.id.readyBTN);
        A_check_balance = (CheckBox) findViewById(R.id.A_balance);
        B_check_balance = (CheckBox) findViewById(R.id.B_balance);
        A_check_jump = (CheckBox) findViewById(R.id.A_jump);
        B_check_jump = (CheckBox) findViewById(R.id.B_jump);
        A_check_wave = (CheckBox) findViewById(R.id.A_wave);
        B_check_wave = (CheckBox) findViewById(R.id.B_wave);
        A_check_wool = (CheckBox) findViewById(R.id.A_wool);
        B_check_wool = (CheckBox) findViewById(R.id.B_wool);
        A_check_AB_1 = (CheckBox) findViewById(R.id.A_series1);
        B_check_AB_1 = (CheckBox) findViewById(R.id.B_series1);
        A_check_AB_2 = (CheckBox) findViewById(R.id.A_series2);
        B_check_AB_2 = (CheckBox) findViewById(R.id.B_series2);
        A_check_P = (CheckBox) findViewById(R.id.A_plus);
        B_check_P = (CheckBox) findViewById(R.id.B_plus);
        C_check_P = (CheckBox) findViewById(R.id.C_plus);
        A_check_P_1 = (CheckBox) findViewById(R.id.A2_plus);
        B_check_P_1 = (CheckBox) findViewById(R.id.B2_plus);
        C_check_P_1 = (CheckBox) findViewById(R.id.C2_plus);
        A_check_P_2 = (CheckBox) findViewById(R.id.A3_plus);
        B_check_P_2 = (CheckBox) findViewById(R.id.B3_plus);
        C_check_P_2 = (CheckBox) findViewById(R.id.C3_plus);
        A_check_P_3 = (CheckBox) findViewById(R.id.A4_plus);
        B_check_P_3 = (CheckBox) findViewById(R.id.B4_plus);
        C_check_P_3 = (CheckBox) findViewById(R.id.C4_plus);
        A_check_P_4 = (CheckBox) findViewById(R.id.A5_plus);
        B_check_P_4 = (CheckBox) findViewById(R.id.B5_plus);
        C_check_P_4 = (CheckBox) findViewById(R.id.C5_plus);
        A_check_P_5 = (CheckBox) findViewById(R.id.A6_plus);
        B_check_P_5 = (CheckBox) findViewById(R.id.B6_plus);
        C_check_P_5 = (CheckBox) findViewById(R.id.C6_plus);

        A_check_balance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkbox = (CheckBox)v;
                if(checkbox.isChecked()) {
                    balance1 = 1;
                    B_check_balance.setChecked(false);
                    if(balance2 == 1)
                        final_result -= 0.2;
                    final_result += 0.1;
                }
            }
        });

        B_check_balance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkbox = (CheckBox)v;
                if(checkbox.isChecked()) {
                    balance2 = 1;
                    A_check_balance.setChecked(false);
                    if(balance1 == 1)
                        final_result -= 0.1;
                    final_result += 0.2;
                }
            }

        });

        A_check_jump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkbox = (CheckBox)v;
                if(checkbox.isChecked()) {
                    jump1 = 1;
                    B_check_jump.setChecked(false);
                    if(jump2 == 1)
                         final_result -= 0.2;
                    final_result += 0.1;
                }
            }
        });

        B_check_jump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkbox = (CheckBox)v;
                if(checkbox.isChecked()) {
                    jump2 = 1;
                    A_check_jump.setChecked(false);
                    if(jump1 == 1)
                        final_result -= 0.1;
                    final_result += 0.2;
                }
            }
        });

        A_check_wave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkbox = (CheckBox)v;
                if(checkbox.isChecked()) {
                    wave1 = 1;
                    B_check_wave.setChecked(false);
                    if(wave2 == 1)
                        final_result -= 0.2;
                    final_result += 0.1;
                }
            }
        });

        B_check_wave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkbox = (CheckBox)v;
                if(checkbox.isChecked()) {
                    wave2 = 1;
                    A_check_wave.setChecked(false);
                    if(wave1 == 1)
                        final_result -= 0.1;
                    final_result += 0.2;
                }
            }

        });

        A_check_wool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkbox = (CheckBox)v;
                if(checkbox.isChecked()) {
                    wool1 = 1;
                    B_check_wool.setChecked(false);
                    if(wool2 == 1)
                        final_result -= 0.2;
                    final_result += 0.1;
                }
            }
        });

        B_check_wool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkbox = (CheckBox)v;
                if(checkbox.isChecked()) {
                    wool2 = 1;
                    A_check_wool.setChecked(false);
                    if(wool1 == 1)
                        final_result -= 0.1;
                    final_result += 0.2;
                }
            }

        });

        A_check_AB_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkbox = (CheckBox)v;
                if(checkbox.isChecked()) {
                    series11 = 1;
                    B_check_AB_1.setChecked(false);
                    if(series12 == 1)
                        final_result -= 0.4;
                    final_result += 0.3;
                }
            }
        });

        B_check_AB_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkbox = (CheckBox)v;
                if(checkbox.isChecked()) {
                    series12 = 1;
                    A_check_AB_1.setChecked(false);
                    if(series11 == 1)
                        final_result -= 0.3;
                    final_result += 0.4;
                }
            }

        });


        A_check_AB_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkbox = (CheckBox)v;
                if(checkbox.isChecked()) {
                    series21 = 1;
                    B_check_AB_2.setChecked(false);
                    if(series22 == 1)
                        final_result -= 0.4;
                    final_result += 0.3;
                }
            }
        });

        B_check_AB_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkbox = (CheckBox)v;
                if(checkbox.isChecked()) {
                    series22 = 1;
                    A_check_AB_2.setChecked(false);
                    if(series21 == 1)
                        final_result -= 0.3;
                    final_result += 0.4;
                }
            }

        });

      /*  A_check_P.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkbox = (CheckBox)v;
                if(checkbox.isChecked()) {
                    B_check_P.setChecked(false);
                    C_check_P.setChecked(false);
                    //ABC1_result = 0.2;
                    final_result += ABC1_result;
                }
            }
        });


        B_check_P.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkbox = (CheckBox)v;
                if(checkbox.isChecked()) {
                    A_check_P.setChecked(false);
                    C_check_P.setChecked(false);
                    ABC1_result = 0.3;
                    final_result += ABC1_result;
                }
            }
        });

        C_check_P.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkbox = (CheckBox)v;
                if(checkbox.isChecked()) {
                    B_check_P.setChecked(false);
                    A_check_P.setChecked(false);
                    ABC1_result = 0.5;
                    final_result += ABC1_result;
                }
            }
        });

        A_check_P_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkbox = (CheckBox)v;
                if(checkbox.isChecked()) {
                    B_check_P_1.setChecked(false);
                    C_check_P_1.setChecked(false);
                    ABC2_result = 0.2;
                    final_result += ABC2_result;
                }
            }
        });


        B_check_P_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkbox = (CheckBox)v;
                if(checkbox.isChecked()) {
                    A_check_P_1.setChecked(false);
                    C_check_P_1.setChecked(false);
                    ABC2_result = 0.3;
                    final_result += ABC2_result;
                }
            }
        });

        C_check_P_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkbox = (CheckBox)v;
                if(checkbox.isChecked()) {
                    B_check_P_1.setChecked(false);
                    A_check_P_1.setChecked(false);
                    ABC2_result = 0.5;
                    final_result += ABC2_result;
                }
            }
        });


        A_check_P_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkbox = (CheckBox)v;
                if(checkbox.isChecked()) {
                    B_check_P_2.setChecked(false);
                    C_check_P_2.setChecked(false);
                    ABC3_result = 0.2;
                    final_result += ABC3_result;
                }
            }
        });


        B_check_P_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkbox = (CheckBox)v;
                if(checkbox.isChecked()) {
                    A_check_P_2.setChecked(false);
                    C_check_P_2.setChecked(false);
                    ABC3_result = 0.3;
                    final_result += ABC3_result;
                }
            }
        });

        C_check_P_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkbox = (CheckBox)v;
                if(checkbox.isChecked()) {
                    B_check_P_2.setChecked(false);
                    A_check_P_2.setChecked(false);
                    ABC3_result = 0.5;
                    final_result += ABC3_result;
                }
            }
        });


        A_check_P_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkbox = (CheckBox)v;
                if(checkbox.isChecked()) {
                    B_check_P_3.setChecked(false);
                    C_check_P_3.setChecked(false);
                    ABC4_result = 0.2;
                    final_result += ABC4_result;
                }
            }
        });


        B_check_P_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkbox = (CheckBox)v;
                if(checkbox.isChecked()) {
                    A_check_P_3.setChecked(false);
                    C_check_P_3.setChecked(false);
                    ABC4_result = 0.3;
                    final_result += ABC4_result;
                }
            }
        });

        C_check_P_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkbox = (CheckBox)v;
                if(checkbox.isChecked()) {
                    B_check_P_3.setChecked(false);
                    A_check_P_3.setChecked(false);
                    ABC4_result = 0.5;
                    final_result += ABC4_result;
                }
            }
        });


        A_check_P_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkbox = (CheckBox)v;
                if(checkbox.isChecked()) {
                    B_check_P_4.setChecked(false);
                    C_check_P_4.setChecked(false);
                    ABC5_result = 0.2;
                    final_result += ABC5_result;
                }
            }
        });


        B_check_P_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkbox = (CheckBox)v;
                if(checkbox.isChecked()) {
                    A_check_P_4.setChecked(false);
                    C_check_P_4.setChecked(false);
                    ABC5_result = 0.3;
                    final_result += ABC5_result;
                }
            }
        });

        C_check_P_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkbox = (CheckBox)v;
                if(checkbox.isChecked()) {
                    B_check_P_4.setChecked(false);
                    A_check_P_4.setChecked(false);
                    ABC5_result = 0.5;
                    final_result += ABC5_result;
                }
            }
        });


        A_check_P_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkbox = (CheckBox)v;
                if(checkbox.isChecked()) {
                    B_check_P_5.setChecked(false);
                    C_check_P_5.setChecked(false);
                    ABC6_result = 0.2;
                    final_result += ABC6_result;
                }
            }
        });


        B_check_P_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkbox = (CheckBox)v;
                if(checkbox.isChecked()) {
                    A_check_P_5.setChecked(false);
                    C_check_P_5.setChecked(false);
                    ABC6_result = 0.3;
                    final_result += ABC6_result;
                }
            }
        });

        C_check_P_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkbox = (CheckBox)v;
                if(checkbox.isChecked()) {
                    B_check_P_5.setChecked(false);
                    A_check_P_5.setChecked(false);
                    ABC6_result = 0.5;
                    final_result += ABC6_result;
                }
            }
        });


*/

        readyBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startFinal = new Intent(TV_judging.this, Final.class);
                score = String.valueOf(final_result);
                startFinal.putExtra("Result", score);
                startActivity(startFinal);
            }
        });
    }
}
