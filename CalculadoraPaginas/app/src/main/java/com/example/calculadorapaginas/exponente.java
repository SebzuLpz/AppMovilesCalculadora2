package com.example.calculadorapaginas;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class exponente extends AppCompatActivity {

    Button regresar;
    TextView resultado;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exponente);
        Bundle Recibiruno = getIntent().getExtras();
        String numero1 = Recibiruno.getString("keyuno");
        Bundle Recibirdos = getIntent().getExtras();
        String numero2 = Recibirdos.getString("keydos");

        resultado = findViewById(R.id.resultado);
        potencias(numero1,numero2);

        regresar = (Button)findViewById(R.id.regresar);
        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent (exponente.this, MainActivity.class);
                startActivity(c);
                finish();
            }
        });

    }

    public void potencias(String numero1,String numero2){
        int base = Integer.parseInt(numero1);
        int exponente = Integer.parseInt(numero2);
        resultado.setText(potenciasRecursive(base, exponente) + "");
    }

    private double potenciasRecursive(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        return base * potenciasRecursive(base, exponente - 1);
    }
}