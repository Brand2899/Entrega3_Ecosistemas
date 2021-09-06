package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText NombreTxtField;
    private Button ContinuarBtn;
    private Button ConfigBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NombreTxtField = findViewById(R.id.NombreTxtField);
        ContinuarBtn = findViewById(R.id.ContinuarBtn);
        ConfigBtn = findViewById(R.id.ConfigBtn);

        ContinuarBtn.setOnClickListener(
                (v) -> {
                    if(!NombreTxtField.getText().toString().replaceAll(" ", " ").isEmpty()){

                        Intent i = new Intent(this, CalculoNotaActivity.class);
                        startActivity(i);

                    }else{

                        Toast.makeText(this, "Ingresar nombre", Toast.LENGTH_SHORT).show();

                    }
                }
        );
    }
}