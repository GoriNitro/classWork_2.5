package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id._button);
        EditText text = findViewById(R.id.text);
        TextView niva = findViewById(R.id._niva);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text1 = text.getText().toString();
                if (text1.isEmpty()) {
                    niva.setText("Вы не ввели текст");
                }
                else {
                niva.setText(text1);
                }
            }
        });
    }
}