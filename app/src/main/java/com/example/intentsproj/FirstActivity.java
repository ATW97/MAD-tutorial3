package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    Button okbtn;
    EditText tno1, tno2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        okbtn=findViewById(R.id.btnok);
        tno1=findViewById(R.id.extno1);
        tno2=findViewById(R.id.extno2);

        okbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number1 =tno1.getText().toString();
                String number2 =tno2.getText().toString();

                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                intent.putExtra( "keynu1",number1);
                intent.putExtra( "keynu2",number2);

                Context context = getApplicationContext(); //The context to use. Usually your Application or Activity object
                CharSequence message = "You just clicked the OK button"; //Display string
                int duration = Toast.LENGTH_SHORT; //How long the toast message will lasts
                Toast toast = Toast.makeText(context, message, duration); toast.show();
                startActivity(intent);
            }
        });
    }
}