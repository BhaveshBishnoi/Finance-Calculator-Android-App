package com.hindicreator.financecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ROI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roi);
    }
    @SuppressLint("NotConstructor")
    public void ROI(View view)
        { EditText et1 = findViewById(R.id.lnet);
            EditText et2 = findViewById(R.id.linterest);

            TextView et3 = findViewById(R.id.lans);

            double n1= Double.parseDouble(et1.getText().toString());
            double n2= Double.parseDouble(et2.getText().toString());

            double result = (n1/n2)*100;

            et3.setText("Return of Investment = "+ result +"%");
        }}

