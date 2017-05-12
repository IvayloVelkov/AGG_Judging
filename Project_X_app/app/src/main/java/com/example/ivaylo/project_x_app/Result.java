package com.example.ivaylo.project_x_app;

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

public class MainActivity extends AppCompatActivity  {
    Button sendBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setButton();

    }

    private void setButton() {
        sendBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Thread t = new Thread() {
                    @Override
                    public void run() {
                        try {
                            System.out.println("Starting Connection");
                            Socket s = new Socket("192.168.1.103", 3306);
                            System.out.println("Connection DONE");
                            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
                            dos.writeUTF(".");
                            dos.flush();
                            dos.close();
                            s.close();
                            System.out.println("Closing socket");
                        } catch (UnknownHostException e) {
                            System.out.println("There was an Unknown Erorr:");
                            e.printStackTrace();
                        } catch (IOException e) {
                            System.out.println("There was an IOException:");
                            e.printStackTrace();
                        }
                    }
                };
                t.start();
                Toast.makeText(getApplicationContext(), "Messagge Sent...", Toast.LENGTH_SHORT).show();
            }

        });

    }

}

