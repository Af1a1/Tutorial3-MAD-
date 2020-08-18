package com.example.tute3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    double num1;
    double num2;

    Button plus, minus, multiply, divide;
    EditText number1, number2;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        num1 = intent.getDoubleExtra("Number_1",0);
        num2 = intent.getDoubleExtra("Number_2",0);

        plus = findViewById(R.id.add);
        minus = findViewById(R.id.subract);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.devide);


        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);

        number1.setText(num1+"");
        number2.setText(num2+"");


        res = findViewById(R.id.result);

    }

    @Override
    public void onResume(){
        super.onResume();

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                res.setText(num1 + " + " + num2 + " = " + (num1+num2) + "");
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                res.setText(num1 + " - " + num2 + " = " + (num1-num2) + "");

            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                res.setText(num1 + " x " + num2 + " = " + (num1*num2) + "");
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                res.setText(num1 + " x " + num2 + " = " + (num1/num2) + "");
            }
        });




    }
}