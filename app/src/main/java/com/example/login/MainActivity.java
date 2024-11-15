package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText login;
    EditText haslo;
    Button przyciskRejestracji;



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);



        login = findViewById(R.id.loginInput);
        haslo = findViewById(R.id.passwordInput);

        przyciskRejestracji = findViewById(R.id.registerButton);



        przyciskRejestracji.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                String loginText = login.getText().toString();
                String passwordText = haslo.getText().toString();

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                intent.putExtra("login", loginText);
                intent.putExtra("password", passwordText);

                startActivity(intent);

            }

        });

    }
}