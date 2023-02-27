package com.example.exercicio1conversordetemperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import com.example.exercicio1conversordetemperatura.Model.CelciusStrategy;


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

    }

    public void  ConverteCelcius() {
        Double valor = CelciusStrategy.getInstance().getConversion(Double.parseDouble(valorASerConvertido.getText().toString()));
        textValorConvertidoCelcius.setText(valor.toString());
    }

}