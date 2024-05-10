package com.example.hw1_3m;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView textViewData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textViewData = findViewById(R.id.textViewData);

        // Получаем данные из предыдущей активности
        String password = getIntent().getStringExtra("password");

        // Отображаем данные в TextView
        textViewData.setText("Пароль: " + password);
    }
}