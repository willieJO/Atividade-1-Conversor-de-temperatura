package com.example.exercicio1conversordetemperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import com.example.exercicio1conversordetemperatura.Model.CelciusStrategy;
import com.example.exercicio1conversordetemperatura.Model.FahrenheitStrategy;


public class MainActivity extends AppCompatActivity {
    private EditText valorASerConvertido;
    private Button botaoCelcius;
    private TextView textValorConvertidoCelcius;
    private Button botaoFahrenheit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textValorConvertidoCelcius = findViewById(R.id.textValorConvertido);
        valorASerConvertido = findViewById(R.id.textValue);
        botaoCelcius = findViewById(R.id.buttonConverteCelcius);
        botaoCelcius.setOnClickListener(view -> ConverteCelcius());
        botaoFahrenheit = findViewById(R.id.buttonConverteFahrenheit);
        botaoFahrenheit.setOnClickListener(view -> ConverteFahrenheit());
    }

    public void  ConverteCelcius() {
        Double valor = CelciusStrategy.getInstance().getConversion(Double.parseDouble(valorASerConvertido.getText().toString()));
        textValorConvertidoCelcius.setText(valor.toString());
    }
    public void ConverteFahrenheit() {
        Double valor = FahrenheitStrategy.getInstance().getConversion(Double.parseDouble(valorASerConvertido.getText().toString()));
        textValorConvertidoCelcius.setText(valor.toString());
    }

}