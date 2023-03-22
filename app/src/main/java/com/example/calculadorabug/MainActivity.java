package com.example.calculadorabug;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText N1;
    EditText N2;
    TextView RN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        N1 = findViewById(R.id.N1);
        N2 = findViewById(R.id.N2);
        RN = findViewById(R.id.RN);
    }
    public void somar(View v){


    }
}