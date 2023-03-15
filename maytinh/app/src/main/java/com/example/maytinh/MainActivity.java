package com.example.maytinh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView input1;
    TextView input2;
    TextView result;

    Button btnadd;
    Button btnsub;
    Button btnmul;
    Button btndiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);
        result = findViewById(R.id.result);

        btnadd = findViewById(R.id.add);
        btndiv = findViewById(R.id.divide);
        btnsub = findViewById(R.id.sub);
        btnmul = findViewById(R.id.mul);


        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(input1.getText().toString());
                int number2 = Integer.parseInt(input2.getText().toString());
                int sum = number1 + number2;
                result.setText(String.valueOf(sum));
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(input1.getText().toString());
                int number2 = Integer.parseInt(input2.getText().toString());
                int sub = number1 - number2;
                result.setText(String.valueOf(sub));
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(input1.getText().toString());
                int number2 = Integer.parseInt(input2.getText().toString());
                int div = number1 / number2;
                result.setText(String.valueOf(div));
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(input1.getText().toString());
                int number2 = Integer.parseInt(input2.getText().toString());
                int mul = number1 * number2;
                result.setText(String.valueOf(mul));
            }
        });
    }

}