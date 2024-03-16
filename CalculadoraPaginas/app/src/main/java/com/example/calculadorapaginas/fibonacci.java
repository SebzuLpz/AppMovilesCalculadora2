package com.example.calculadorapaginas;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class fibonacci extends AppCompatActivity {

    Button regresar;
    TextView resultado;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fibonacci);
        Bundle Recibiruno = getIntent().getExtras();
        String numero1 = Recibiruno.getString("keyuno");

        resultado = findViewById(R.id.resultado);
        fibonacci (numero1);

        regresar = (Button)findViewById(R.id.regresar);
        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent (fibonacci.this, MainActivity.class);
                startActivity(c);
                finish();
            }
        });

    }

    public void fibonacci(String numero1){
        int num = Integer.parseInt(numero1);
        resultado.setText(fibonacciRecursive(num) + "");
    }

    private int fibonacciRecursive(int num) {
        if (num <= 1) {
            return num;
        }
        return fibonacciRecursive(num - 1) + fibonacciRecursive(num - 2);
    }
}