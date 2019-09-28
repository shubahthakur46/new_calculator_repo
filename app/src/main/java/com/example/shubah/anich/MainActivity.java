package com.example.shubah.anich;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,plus,sub,mul,div,equ,clr;
    private TextView input,output;
    String operation;
    int operand1 = -1,operand2 = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               input.setText(input.getText().toString() + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "1");

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "2");

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "3");

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "4");

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "5");

            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "6");

            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "7");

            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "8");

            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "9");

            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                if(operand1 == -1)
                {
                    String op = input.getText().toString();
                    operand1 = Integer.parseInt(op);
                    input.setText(input.getText().toString() + "+");
                }

                operation = "+";
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operand1 == -1){
                    operand1 = Integer.parseInt(input.getText().toString());
                    input.setText(input.getText().toString() + "-");
                }

                operation = "-";
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operand1 == -1){
                    operand1 = Integer.parseInt(input.getText().toString());
                    input.setText(input.getText().toString() + "*");
                }

                operation = "*";
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operand1 == -1){
                    operand1 = Integer.parseInt(input.getText().toString());
                    input.setText(input.getText().toString() + "/");
                }

                operation = "/";
            }
        });

        equ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s = input.getText().toString();

                int lastIndex = s.indexOf(operation);
                String second = s.substring(lastIndex + 1, s.length());
                operand2 = Integer.parseInt(second);

                if(operation == "+")
                {
                    int sum = operand1 + operand2;
                    input.setText("");
                    output.setText(Integer.toString(sum));
                }
                else if(operation == "-")
                {
                    int sub = operand1 - operand2;
                    input.setText("");
                    output.setText(Integer.toString(sub));
                }
                else if(operation == "*")
                {
                    int mul = operand1 * operand2;
                    input.setText("");
                    output.setText(Integer.toString(mul));
                }
                else if(operation == "/")
                {
                    if(operand2 == 0)
                    {
                        output.setText("Invalid operation");
                        input.setText("");
                    }
                }

                operand1 = operand2 = -1;
                operation = "";
            }
        });

        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText("");
                output.setText("");
                operand1 = operand2 = -1;
                operation = "";
            }
        });
    }

    private void initViews() {

        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);
        btn0 = (Button)findViewById(R.id.btn0);
        input = (TextView)findViewById(R.id.Input);
        output = (TextView)findViewById(R.id.Output);
        plus = (Button)findViewById(R.id.pls);
        sub = (Button)findViewById(R.id.sub);
        mul = (Button)findViewById(R.id.mul);
        div = (Button)findViewById(R.id.division);
        equ = (Button)findViewById(R.id.equal);
        clr = (Button)findViewById(R.id.clear);

    }
}
