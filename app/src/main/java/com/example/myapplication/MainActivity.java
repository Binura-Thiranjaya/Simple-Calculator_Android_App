package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etfNum1,etfNum2;
    Button btnAdd,btnSub,btnMultiply,btnDivide;
    TextView tvResult;
    Double Num1,Num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etfNum1=findViewById(R.id.etfNum1);
        etfNum2=findViewById(R.id.etfNum2);
        btnAdd=findViewById(R.id.btnAdd);
        btnSub=findViewById(R.id.btnSub);
        btnMultiply=findViewById(R.id.btnMultiply);
        btnDivide=findViewById(R.id.btnDivide);
        tvResult=findViewById(R.id.tvResult);
        ClickListener();
    }
    public void ClickListener(){
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Num1 = Double.parseDouble(etfNum1.getText().toString());
                Num2 = Double.parseDouble(etfNum2.getText().toString());
                Double result=Num1+Num2;
                tvResult.setText(String.valueOf(result));
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Num1 = Double.parseDouble(etfNum1.getText().toString());
                Num2 = Double.parseDouble(etfNum2.getText().toString());
                Double result=Num1-Num2;
                tvResult.setText(String.valueOf(result));
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Num1 = Double.parseDouble(etfNum1.getText().toString());
                Num2 = Double.parseDouble(etfNum2.getText().toString());
                Double result=Num1*Num2;
                tvResult.setText(String.valueOf(result));
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Num1 = Double.parseDouble(etfNum1.getText().toString());
                Num2 = Double.parseDouble(etfNum2.getText().toString());
                Double result=Num1/Num2;
                tvResult.setText(String.valueOf(result));
            }
        });
    }
}