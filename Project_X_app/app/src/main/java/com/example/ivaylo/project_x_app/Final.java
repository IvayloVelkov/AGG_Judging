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

public class Final extends Activity {
    Button sendBTN;
    EditText result;
    Bundle extras = new Bundle();
    String value = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        sendBTN = (Button) findViewById(R.id.sendBTN);
        setButton();
        extras = getIntent().getExtras();
        value = extras.getString("Result");
    }

    private void setButton() {
        sendBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(value);
                Thread t =  new Thread() {
                    @Override
                    public void run() {
                        try {
                            System.out.println("Starting Connection");
                            Socket s = new Socket("192.168.1.105", 3306);
                            System.out.println("Connection DONE");
                            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
                            dos.writeUTF(String.valueOf(result));
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

