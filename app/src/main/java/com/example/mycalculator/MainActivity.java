package com.example.mycalculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnAdd, btnSub, btnMul, btnDiv, btnDot, btnEqual;
    Button btnClear;
    EditText edl;
    float Res1, Res2;
    boolean Add, Sub, Mul, Div, checkflag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn0 = findViewById(R.id.btn0);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        btnDot = findViewById(R.id.btnDot);
        btnEqual = findViewById(R.id.btnEqual);
        btnClear = findViewById(R.id.btnClear);
        edl = findViewById(R.id.edl);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkflag){
                    edl.setText("");
                    checkflag = false;
                }
                edl.setText(edl.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkflag){
                    edl.setText("");
                    checkflag = false;
                }
                edl.setText(edl.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkflag){
                    edl.setText("");
                    checkflag = false;
                }
                edl.setText(edl.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkflag){
                    edl.setText("");
                    checkflag = false;
                }
                edl.setText(edl.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkflag){
                    edl.setText("");
                    checkflag = false;
                }
                edl.setText(edl.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkflag){
                    edl.setText("");
                    checkflag = false;
                }
                edl.setText(edl.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkflag){
                    edl.setText("");
                    checkflag = false;
                }
                edl.setText(edl.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkflag){
                    edl.setText("");
                    checkflag = false;
                }
                edl.setText(edl.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkflag){
                    edl.setText("");
                    checkflag = false;
                }
                edl.setText(edl.getText() + "9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkflag){
                    edl.setText("");
                    checkflag = false;
                }
                edl.setText(edl.getText() + "0");
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkflag){
                    edl.setText("");
                    checkflag = false;
                }
                edl.setText(edl.getText() + ".");
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edl == null){
                    edl.setText("");
                }
                else{
                    Res1 = Float.parseFloat(edl.getText() + "");
                    Add = true;
                    edl.setText(null);
                }
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edl == null){
                    edl.setText("");
                }
                else{
                    Res1 = Float.parseFloat(edl.getText() + "");
                    Sub = true;
                    edl.setText(null);
                }
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edl == null){
                    edl.setText("");
                }
                else{
                    Res1 = Float.parseFloat(edl.getText() + "");
                    Mul = true;
                    edl.setText(null);
                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edl == null){
                    edl.setText("");
                }
                else{
                    Res1 = Float.parseFloat(edl.getText() + "");
                    Div = true;
                    edl.setText(null);
                }
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Res2 = Float.parseFloat(edl.getText() + "");
                if(Add == true){
                    edl.setText(Res1 + Res2 + "");
                    Add = false;
                }
                if(Sub == true){
                    edl.setText(Res1 - Res2 + "");
                    Sub = false;
                }
                if(Mul == true){
                    edl.setText(Res1 * Res2 + "");
                    Mul = false;
                }
                if(Div == true){
                    if(Res2==0){
                        edl.setText("Math Error ;(");
                    }
                    else{
                        edl.setText(Res1 / Res2 + "");
                    }
                    Div = false;
                }
            checkflag = true;
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edl.setText("");
            }
        });


    }
}