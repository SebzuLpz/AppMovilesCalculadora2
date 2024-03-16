package com.example.calculadorapaginas;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class resta extends AppCompatActivity {

    Button regresar;
    TextView resultado;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resta);

        resultado = findViewById(R.id.resultado);

        Bundle Recibiruno = getIntent().getExtras();
        String numero1 = Recibiruno.getString("keyuno");
        Bundle Recibirdos = getIntent().getExtras();
        String numero2 = Recibirdos.getString("keydos");

        resta(numero1, numero2);

        regresar = (Button)findViewById(R.id.regresar);
        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent (resta.this, MainActivity.class);
                startActivity(c);
                finish();
            }
        });

    }

    public void resta(String numero1, String numero2) {
        int num1 = Integer.parseInt(numero1);
        int num2 = Integer.parseInt(numero2);
        int sum = num1 - num2;
        resultado.setText(String.valueOf(sum));
    }
}