package com.example.login;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button Submit;
    private EditText Name;
    private EditText Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = findViewById(R.id.editText);
        Password = findViewById(R.id.editText2);
        Submit = findViewById(R.id.button);

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitbtn(Name.getText().toString(), Password.getText().toString());
            }
        });
    }
    public void submitbtn(String userName, String userPassword) {
        if ((userName.equals("usama") && userPassword.equals("12345"))) {

            Intent i = new Intent(MainActivity.this, display.class);
            startActivity(i);
        }
        if ((userName.equals("roy") && userPassword.equals("6789"))) {

            Intent i = new Intent(MainActivity.this, display.class);
            startActivity(i);
        }

        if ((userName.equals("jay") && userPassword.equals("55555"))) {

            Intent i = new Intent(MainActivity.this, display.class);
            startActivity(i);
        }

        else {
            Toast.makeText(this, "Invalid user", Toast.LENGTH_LONG).show();
        }
            }

        }



