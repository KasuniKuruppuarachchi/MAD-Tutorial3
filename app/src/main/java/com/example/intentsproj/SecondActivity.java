package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText n1 , n2;
    Button plus , min , mul , divi;
    TextView result;
    float res;
    int num1 , num2;
    String str1 , str2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        n1 = (EditText)findViewById(R.id.t3);
        n2 = (EditText)findViewById(R.id.t4);

        plus = findViewById(R.id.button);
        min = findViewById(R.id.button6);
        mul = findViewById(R.id.button7);
        divi = findViewById(R.id.button8);

        result = findViewById(R.id.textView5);

        Intent intent = getIntent();
        str1 = intent.getStringExtra("MAIN_EXTRA1");
        str2 = intent.getStringExtra("MAIN_EXTRA2");

        n1.setText(str1);
        n2.setText(str2);

        num1 = Integer.parseInt(str1);
        num2 = Integer.parseInt(str2);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //num1 = Integer.parseInt(str1);
                //num2 = Integer.parseInt(str2);

                res = num1 + num2;
                result.setText(String.valueOf(res));

            }
        });

        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                res = num1 - num2;
                result.setText(String.valueOf(res));

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                res = num1 * num2;
                result.setText(String.valueOf(res));

            }
        });

        divi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                res = num1 /num2;
                result.setText(String.valueOf(res));

            }
        });

    }


}