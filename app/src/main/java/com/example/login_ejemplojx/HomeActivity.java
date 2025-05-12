package com.example.login_ejemplojx;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TextView welcomeText = findViewById(R.id.welcome_text);
        welcomeText.setText("¡Bienvenido al Home!");
    }
}