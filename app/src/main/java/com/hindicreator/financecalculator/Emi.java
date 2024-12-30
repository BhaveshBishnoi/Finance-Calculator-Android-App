package com.hindicreator.financecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Emi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emi);
    }

    public void EMI(View view) {
        EditText et1 = findViewById(R.id.emip);
        EditText et2 = findViewById(R.id.emit);
        EditText et3 = findViewById(R.id.emir);
        TextView et4 = findViewById(R.id.ans);

        double n1 = Double.parseDouble(et1.getText().toString());
        double n2 = Double.parseDouble(et2.getText().toString());
        double n3 = Double.parseDouble(et3.getText().toString());
        double result = n1*n3/100/12*(Math.pow((1+n3/100/12),n2))/((Math.pow((1+n3/100/12),n2))-1);

        et4.setText("EMI per month = " + result);
    }
}