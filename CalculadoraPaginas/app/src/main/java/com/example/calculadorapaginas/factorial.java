package com.example.calculadorapaginas;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class factorial extends AppCompatActivity {

    Button regresar;
    TextView resultado;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factorial);
        Bundle Recibiruno = getIntent().getExtras();
        String numero1 = Recibiruno.getString("keyuno");

        resultado = findViewById(R.id.resultado);
        factorial(numero1);

        regresar = (Button)findViewById(R.id.regresar);
        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent (factorial.this, MainActivity.class);
                startActivity(c);
                finish();
            }
        });

    }

    public void factorial(String numero1){
        int num = Integer.parseInt(numero1);
        long fact = factorialRecursive(num);
        resultado.setText(fact+"");
    }

    private long factorialRecursive(int num) {
        if (num == 0) {
            return 1;
        }
        return num * factorialRecursive(num - 1);
    }
}