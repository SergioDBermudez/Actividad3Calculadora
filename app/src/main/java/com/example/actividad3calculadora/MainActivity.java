package com.example.actividad3calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText num1,num2;
    Button suma, resta, mult, divi;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);

        /*Botones*/

        suma = findViewById(R.id.sumar);
        resta = findViewById(R.id.restar);
        mult = findViewById(R.id.multiplicar);
        divi = findViewById(R.id.div);

        resultado = findViewById(R.id.resultado);

        /*Declaración de eventos*/

        suma.setOnClickListener(this);
        resta.setOnClickListener(this);
        mult.setOnClickListener(this);
        divi.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        String n1 = num1.getText().toString();
        String n2 = num2.getText().toString();

        /*Convertir enteros*/

        int entero1 = Integer.parseInt(n1);
        int entero2 = Integer.parseInt(n2);

        int rta = 0;

        /*Acción de cada botón*/

        switch (v.getId()){
            case R.id.sumar:
                rta = entero1+entero2;
                break;
            case R.id.restar:
                rta = entero1-entero2;
                break;
            case R.id.multiplicar:
                rta = entero1*entero2;
                break;
            case R.id.div:
                rta = entero1/entero2;
                break;

        }
        /*Tranformamos el entero rta a una cadena de texto*/
        resultado.setText(""+rta);
    }
}