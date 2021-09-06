package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalculoNotaActivity extends AppCompatActivity {

    private EditText et1, et2, et3, et4, et5;
    private TextView tv1;
    private Button bn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_nota);

        et1= findViewById(R.id.et1);
        et2= findViewById(R.id.et2);
        et3= findViewById(R.id.et3);
        et4= findViewById(R.id.et4);
        et5= findViewById(R.id.et5);

        tv1 = findViewById(R.id.tv1);

        bn1 = findViewById(R.id.bn1);


        bn1.setOnClickListener(
                (v)->{

                    if(!et1.getText().toString().isEmpty() && et2.getText().toString().isEmpty() && et3.getText().toString().isEmpty() && et4.getText().toString().isEmpty() && et5.getText().toString().isEmpty()) {

                        Intent i = new Intent(this, MainActivity.class);
                        startActivity(i);

                    }else{
                        Toast.makeText(this,"Colocar todas las notas", Toast.LENGTH_LONG).show();
                    }


                }
        );



    }
}