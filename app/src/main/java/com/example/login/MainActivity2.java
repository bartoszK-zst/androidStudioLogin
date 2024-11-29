package com.example.login;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.login.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {
    TextView loginView;
    TextView passwordView;
    Button przyciskPowrotu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);

        loginView = findViewById(R.id.loginView);
        passwordView = findViewById(R.id.passwordView);

        Intent intent = getIntent();
        loginView.setText("Login: " + intent.getStringExtra("login"));
        passwordView.setText("Hashowane hasło: " + intent.getStringExtra("password").hashCode());


        przyciskPowrotu = findViewById(R.id.returnButton);

        przyciskPowrotu.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent intent = new Intent(MainActivity2.this, MainActivity.class);

                startActivity(intent);

            }

        });
    }





}