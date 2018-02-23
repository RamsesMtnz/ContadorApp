package com.ramsesmtnz.android.contadorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText mCampocontar;
    Button mBotonContar;
    Button mBotonLimpiar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCampocontar =(EditText) findViewById(R.id.campo_Conteo);
        mBotonContar =  findViewById(R.id.botonContar);
        mBotonLimpiar = findViewById(R.id.botonReiniciar);

        mBotonContar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = mCampocontar.getText().toString();
                double contador = Double.parseDouble(s);
                contador=contador+1;
                s = String.format("%2.0f", contador);
                mCampocontar.setText(s);
            }
        });
        mBotonLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCampocontar.setText("0");
            }
        });
    }
}
