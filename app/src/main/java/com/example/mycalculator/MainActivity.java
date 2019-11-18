package com.example.mycalculator;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etNumber;
    Button btnOne,btnTwo,btnThree,btnFour,btnFive,btnSix,btnSeven,
            btnNine, btnEight, btnZero,btnClear, btnMultiply,btnDivide,btnAdd,btnSub,btnEquals;
    private String numberone;
    private String command;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNumber= findViewById(R.id.etNumber);
        btnOne=findViewById(R.id.btnOne);
        btnTwo=findViewById(R.id.btnTwo);
        btnThree=findViewById(R.id.btnThree);
        btnFour=findViewById(R.id.btnFour);
        btnFive=findViewById(R.id.btnFive);
        btnSix=findViewById(R.id.btnSix);
        btnSeven=findViewById(R.id.btnSeven);
        btnEight=findViewById(R.id.btnEight);
        btnNine=findViewById(R.id.btnNine);
        btnZero=findViewById(R.id.btnZero);
        btnClear=findViewById(R.id.btnClear);
        btnAdd=findViewById(R.id.btnAdd);
        btnSub=findViewById(R.id.btnSubtract);
        btnMultiply=findViewById(R.id.btnMultilpy);
        btnDivide=findViewById(R.id.btnDivide);
        btnEquals=findViewById(R.id.btnEqual);
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one="1";
                Calculate operation= new Calculate(etNumber.getText().toString());
                String result = operation.Print(one);
                etNumber.setText(result);
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one="2";
                Calculate operation= new Calculate(etNumber.getText().toString());
                String result = operation.Print(one);
                etNumber.setText(result);
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one="3";
                Calculate operation= new Calculate(etNumber.getText().toString());
                String result = operation.Print(one);
                etNumber.setText(result);
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one="4";
                Calculate operation= new Calculate(etNumber.getText().toString());
                String result = operation.Print(one);
                etNumber.setText(result);
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one="5";
                Calculate operation= new Calculate(etNumber.getText().toString());
                String result = operation.Print(one);
                etNumber.setText(result);
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one="6";
                Calculate operation= new Calculate(etNumber.getText().toString());
                String result = operation.Print(one);
                etNumber.setText(result);
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one="7";
                Calculate operation= new Calculate(etNumber.getText().toString());
                String result = operation.Print(one);
                etNumber.setText(result);
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one="8";
                Calculate operation= new Calculate(etNumber.getText().toString());
                String result = operation.Print(one);
                etNumber.setText(result);
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one="9";
                Calculate operation= new Calculate(etNumber.getText().toString());
                String result = operation.Print(one);
                etNumber.setText(result);
            }
        });
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one="0";
                Calculate operation= new Calculate(etNumber.getText().toString());
                String result = operation.Print(one);
                etNumber.setText(result);
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberone="";
                command="";
                etNumber.setText("");
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number =etNumber.getText().toString();
                Calculate operation= new Calculate(number,"add");
                String[] iteams= operation.Math();
                command =iteams[0];
                numberone=iteams[1];
                etNumber.setText("");
            }

        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number =etNumber.getText().toString();
                Calculate operation= new Calculate(number,"sub");
                String[] iteams= operation.Math();
                command =iteams[0];
                numberone=iteams[1];
                etNumber.setText("");
            }

        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number =etNumber.getText().toString();
                Calculate operation= new Calculate(number,"divide");
                String[] iteams= operation.Math();
                command =iteams[0];
                numberone=iteams[1];
                etNumber.setText("");
            }

        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number =etNumber.getText().toString();
                Calculate operation= new Calculate(number,"multiply");
                String[] iteams= operation.Math();
                command =iteams[0];
                numberone=iteams[1];
                etNumber.setText("");
            }

        });
        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(etNumber.getText()))
                {
                    etNumber.setText("");
                    return;
                }
                else    {
                    int numberTwo =Integer.parseInt(etNumber.getText().toString());
                    Calculate operation= new Calculate(Integer.parseInt(numberone),numberTwo);
                    int result=operation.Equlas(command);
                    etNumber.setText(result+"");
                }

            }
        });
    }
}
