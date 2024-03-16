package com.example.calculadorapaginas;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button suma;
    Button resta;
    Button multiplicacion;
    Button division;

    Button fibonacci;
    Button factorial;
    Button potencias;


     EditText numero1;
     EditText numero2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numero1=findViewById(R.id.numero1);
        numero2= findViewById(R.id.numero2);
        suma = (Button)findViewById(R.id.suma);
        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle uno = new Bundle();
                uno.putString("keyuno",numero1.getText().toString());
                Bundle dos = new Bundle();
                dos.putString("keydos",numero2.getText().toString());


                Intent i = new Intent ( MainActivity.this, suma.class);
                i.putExtras(uno);
                i.putExtras(dos);
                startActivity(i);
            }
        });
        resta = (Button)findViewById(R.id.resta);
        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle uno = new Bundle();
                uno.putString("keyuno",numero1.getText().toString());
                Bundle dos = new Bundle();
                dos.putString("keydos",numero2.getText().toString());


                Intent e = new Intent ( MainActivity.this, resta.class);
                e.putExtras(uno);
                e.putExtras(dos);
                startActivity(e);
            }
        });
        multiplicacion = (Button)findViewById(R.id.multi);
        multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle uno = new Bundle();
                uno.putString("keyuno",numero1.getText().toString());
                Bundle dos = new Bundle();
                dos.putString("keydos",numero2.getText().toString());


                Intent e = new Intent ( MainActivity.this, multiplicacion.class);
                e.putExtras(uno);
                e.putExtras(dos);
                startActivity(e);
            }
        });
        division = (Button)findViewById(R.id.division);
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle uno = new Bundle();
                uno.putString("keyuno",numero1.getText().toString());
                Bundle dos = new Bundle();
                dos.putString("keydos",numero2.getText().toString());


                Intent e = new Intent ( MainActivity.this, division.class);
                e.putExtras(uno);
                e.putExtras(dos);
                startActivity(e);
            }
        });
        fibonacci = (Button)findViewById(R.id.fibo);
        fibonacci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle uno = new Bundle();
                uno.putString("keyuno",numero1.getText().toString());

                Intent e = new Intent ( MainActivity.this, fibonacci.class);
                e.putExtras(uno);
                startActivity(e);
            }
        });
        factorial = (Button)findViewById(R.id.pot);
        factorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle uno = new Bundle();
                uno.putString("keyuno",numero1.getText().toString());

                Intent e = new Intent ( MainActivity.this, factorial.class);
                e.putExtras(uno);
                startActivity(e);
            }
        });
        potencias = (Button)findViewById(R.id.expo);
        potencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle uno = new Bundle();
                uno.putString("keyuno",numero1.getText().toString());
                Bundle dos = new Bundle();
                dos.putString("keydos",numero2.getText().toString());


                Intent e = new Intent ( MainActivity.this, exponente.class);
                e.putExtras(uno);
                e.putExtras(dos);
                startActivity(e);
            }
        });
    }
}