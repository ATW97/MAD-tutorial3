package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText teno1, teno2;
    Button adding,sub, multi,divi;
    TextView viewanswers;
    String takeNumber1, takeNumber2;
    int number1, number2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        teno1 = findViewById(R.id.edno1);
        teno2 = findViewById(R.id.edno2);

        adding= findViewById(R.id.btnadd);
        sub = findViewById(R.id.btnsub);
        multi= findViewById(R.id.btnmulti);
        divi = findViewById(R.id.btndivi);

        viewanswers= findViewById(R.id.txtviewanswer);



        Intent intent=getIntent();
         takeNumber1 = getIntent().getStringExtra("keynu1");
         takeNumber2 = getIntent().getStringExtra("keynu2");

         //addition of two numbers
         adding.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                  int sum;

                  number1 = Integer.parseInt(teno1.getText().toString()) ;
                  number2 =Integer.parseInt(teno2.getText().toString());

                  sum = number1+number2;
                 viewanswers.setText(number1+"+"+number2+ "=" +sum);
             }



         });

        //substraction of two numbers
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sub;

                number1 = Integer.parseInt(teno1.getText().toString()) ;
                number2 =Integer.parseInt(teno2.getText().toString());

                sub = number1-number2;
                viewanswers.setText(number1+"-"+number2+ "=" +sub);
            }



        });

        //multiplication of two numbers
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int mult;

                number1 = Integer.parseInt(teno1.getText().toString()) ;
                number2 =Integer.parseInt(teno2.getText().toString());

                mult = number1*number2;
                viewanswers.setText(number1+"*"+number2+ "=" +mult);
            }



        });

        //devision of two numbers
        divi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int divi;
                number1 = Integer.parseInt(teno1.getText().toString()) ;
                number2 =Integer.parseInt(teno2.getText().toString());

                divi = number1/number2;
                viewanswers.setText(number1+"/"+number2+ "=" +divi);
            }



        });






    }

    @Override
    protected void onResume() {
        super.onResume();
        teno1.setText(takeNumber1);
        teno2.setText(takeNumber2);
    }
}