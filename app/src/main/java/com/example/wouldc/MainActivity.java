package com.example.wouldc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText loginEditText, passwordEditText;
    private Button loginButton;
    private TextView welcomeText, infoText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginEditText = findViewById(R.id.loginEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.loginButton);
        welcomeText = findViewById(R.id.welcomeText);
        infoText = findViewById(R.id.infoText);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String enteredLogin = loginEditText.getText().toString().trim();
                String enteredPassword = passwordEditText.getText().toString().trim();

                if (enteredLogin.equalsIgnoreCase("admin") && enteredPassword.equalsIgnoreCase("admin")) {
                    Toast.makeText(getApplicationContext(), "Вы успешно зарегистрировались", Toast.LENGTH_SHORT).show();

                    loginButton.setVisibility(View.GONE);
                    loginEditText.setVisibility(View.GONE);
                    passwordEditText.setVisibility(View.GONE);

                    welcomeText.setText("Добро пожаловать!");
                    infoText.setText("Выполните вход или зарегистрируйтесь");
                } else {
                    Toast.makeText(getApplicationContext(), "Неправильный логин и пароль", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
