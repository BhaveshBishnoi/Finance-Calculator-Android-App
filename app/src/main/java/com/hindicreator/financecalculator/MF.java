package com.hindicreator.financecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MF extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mf);
    }

    public void MutualFund(View view)
    { EditText et1 = findViewById(R.id.lnet);
        EditText et2 = findViewById(R.id.linterest);
        EditText et3 = findViewById(R.id.mfinterest);
        TextView et4 = findViewById(R.id.lans);

        double n1= Double.parseDouble(et1.getText().toString());
        double n2= Double.parseDouble(et2.getText().toString());
        double n3= Double.parseDouble(et3.getText().toString());
        double result = ((n1*n2*n3)/100)+n1;

        et4.setText("Total Amount = "+ result);
}}