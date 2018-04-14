package com.example.vx15.motionsg1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText username, password;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String u = username.getText().toString();
                String p = password.getText().toString();

                if (u.equals("apa") && p.equals("hayo")){
                    Toast.makeText(MainActivity.this, "nyambung", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Salah", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}
