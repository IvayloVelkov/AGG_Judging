package com.example.ivaylo.project_x_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MainActivity extends Activity {
    private Button AVbtn, TVbtn, EXEbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setButtons();
    }

    private void setButtons() {
        TVbtn = (Button) findViewById(R.id.TVbtn);
        AVbtn = (Button) findViewById(R.id.AVbtn);
        EXEbtn = (Button) findViewById(R.id.EXEbtn);

        TVbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startTV = new Intent(getApplicationContext(),TV_judging.class);
                startActivity(startTV);
            }
        });

        EXEbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startEXE = new Intent(getApplicationContext(),EXE_judging.class);
                startActivity(startEXE);
            }
        });

        AVbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startAV = new Intent(getApplicationContext(),AV_judging.class);
                startActivity(startAV);
            }
        });
    }

    }
