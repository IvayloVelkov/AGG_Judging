package com.example.ivaylo.project_x_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import static android.R.attr.value;

public class Final extends Activity {
    Button sendBTN;
    TextView result;
    Bundle extras;
    String value = "";
    String name;
    EditText teamName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        result = (TextView) findViewById(R.id.score);
        teamName = (EditText) findViewById(R.id.editText);
        extras = getIntent().getExtras();
        value = extras.getString("Result");
        sendBTN = (Button) findViewById(R.id.sendBTN);
        setButton();
    }

    private void setButton() {
        sendBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder builder = new StringBuilder();
                int decimalPoint = value.indexOf('.');

                builder.append(value.substring(0, decimalPoint));
                builder.append(value.substring(decimalPoint, 3));

                result.setText("Score:" + builder.toString());
                name = teamName.getText().toString();
                Thread t =  new Thread() {
                    @Override
                    public void run() {
                        try {
                            System.out.println("Starting Connection");
                            Socket s = new Socket("192.168.1.104", 3306);
                            System.out.println("Connection DONE");
                            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
                            dos.writeUTF(name + ": " + value);
                            dos.flush();
                            dos.close();
                            s.close();
                            System.out.println("Closing socket");
                        } catch (UnknownHostException e) {
                            Log.e(" etgr", "There was an Unknown Erorr:");
                            e.printStackTrace();
                        } catch (IOException e) {
                            System.out.println("There was an IOException:");
                            e.printStackTrace();
                        } catch (Exception e) {
                            Log.e("err", e.toString());
                        }
                    }
                };
                t.start();
                Toast.makeText(getApplicationContext(), "Messagge Sent...", Toast.LENGTH_SHORT).show();
            }

        });

    }

}

