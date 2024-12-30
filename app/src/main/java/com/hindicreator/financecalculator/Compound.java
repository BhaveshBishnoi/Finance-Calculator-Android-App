package com.hindicreator.financecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Compound extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compound);
    }
    public void CompoundInterest(View view) {
        EditText et1 = findViewById(R.id.lnet);
        EditText et2 = findViewById(R.id.linterest);
        EditText et3 = findViewById(R.id.ltime);
        TextView et4 = findViewById(R.id.lans);

        Double n1 = Double.parseDouble(et1.getText().toString());
        Double n2 = Double.parseDouble(et2.getText().toString());
        Double n3 = Double.parseDouble(et3.getText().toString());
        Double result = n1*(Math.pow((1+(n3/100)),n2));

        et4.setText("Compound Interest = " + result);
    }

    }