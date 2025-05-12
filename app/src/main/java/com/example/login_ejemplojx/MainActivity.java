package com.example.login_ejemplojx;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText usernameEditText, passwordEditText;
    private TextView errorTextView;
    private Button loginButton;

    private final String validUsername = "admin";
    private final String validPassword = "1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameEditText = findViewById(R.id.username);
        passwordEditText = findViewById(R.id.password);
        errorTextView = findViewById(R.id.error_message);
        loginButton = findViewById(R.id.login_button);

        // Configuración de la lógica de login
        loginButton.setOnClickListener(v -> {
            String username = usernameEditText.getText().toString();
            String password = passwordEditText.getText().toString();

            if (username.equals(validUsername) && password.equals(validPassword)) {
                // Login exitoso, ir a la pantalla principal
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(intent);
                finish(); // Terminamos la actividad de login para evitar volver atrás
            } else {
                // Mostrar mensaje de error
                errorTextView.setText("Credenciales incorrectas");
            }
        });
    }
}