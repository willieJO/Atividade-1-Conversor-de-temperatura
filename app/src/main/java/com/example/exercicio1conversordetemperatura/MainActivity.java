package com.example.exercicio1conversordetemperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import com.example.exercicio1conversordetemperatura.Model.CelciusStrategy;
import com.example.exercicio1conversordetemperatura.Model.FahrenheitStrategy;
import com.example.exercicio1conversordetemperatura.Model.KelvinStrategy;


public class MainActivity extends AppCompatActivity {
    private EditText valorASerConvertido;
    private Button botaoCelcius;
    private TextView textValorConvertidoCelcius;
    private Button botaoFahrenheit;
    private Button buttonCelciusKelvin;
    private Button buttonFahrenheitKelvin;
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

        buttonCelciusKelvin = findViewById(R.id.buttonConvertCelciusKelvin);
        buttonCelciusKelvin.setOnClickListener(view -> ConverteKelvin(true));

        buttonFahrenheitKelvin = findViewById(R.id.buttonConverteFahrenheitKelvin);
        buttonFahrenheitKelvin.setOnClickListener(view -> ConverteKelvin(false));

    }

    public void  ConverteCelcius() {
        Double valor = CelciusStrategy.getInstance().getConversion(Double.parseDouble(valorASerConvertido.getText().toString()));
        textValorConvertidoCelcius.setText(valor.toString());
    }
    public void ConverteFahrenheit() {
        Double valor = FahrenheitStrategy.getInstance().getConversion(Double.parseDouble(valorASerConvertido.getText().toString()));
        textValorConvertidoCelcius.setText(valor.toString());
    }
    public void ConverteKelvin(boolean isCelcius) {
        Double valor = KelvinStrategy.getInstance().getConversion(Double.parseDouble(valorASerConvertido.getText().toString()),isCelcius);
        textValorConvertidoCelcius.setText(valor.toString());
    }

}