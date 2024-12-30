package com.hindicreator.financecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.simple);
        btn.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       Class<?> simple;
                                       Intent intent = new Intent(MainActivity.this, simple.class);
                                       startActivity(intent);
                                   }
                               });
        btn=findViewById(R.id.compound);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Class<?> compound;
                Intent intent = new Intent(MainActivity.this,Compound.class);
                startActivity(intent);
            }
        });
        btn=findViewById(R.id.inflation);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Class<?> Inflation;
                Intent intent = new Intent(MainActivity.this,Inflation.class);
                startActivity(intent);
            }
        });
        btn=findViewById(R.id.mutualfund);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Class<?> Inflation;
                Intent intent = new Intent(MainActivity.this, MF.class);
                startActivity(intent);
            }
        });
        btn=findViewById(R.id.roi);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Class<?> Inflation;
                Intent intent = new Intent(MainActivity.this, ROI.class);
                startActivity(intent);
            }
        });
        btn=findViewById(R.id.loan);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Class<?> Inflation;
                Intent intent = new Intent(MainActivity.this, Loan.class);
                startActivity(intent);
            }
        });

        btn=findViewById(R.id.emi);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Class<?> Inflation;
                Intent intent = new Intent(MainActivity.this, Emi.class);
                startActivity(intent);
            }
        });
    }
}