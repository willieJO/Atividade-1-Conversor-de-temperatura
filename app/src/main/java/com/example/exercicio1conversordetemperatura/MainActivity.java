package com.example.exercicio1conversordetemperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
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
    private Button convertButton;
    private RadioGroup temperatureOptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textValorConvertidoCelcius = findViewById(R.id.textValorConvertido);
        valorASerConvertido = findViewById(R.id.textValue);
        convertButton = findViewById(R.id.convert_button);
        temperatureOptions = findViewById(R.id.temperature_options);
        convertButton.setOnClickListener(view -> ConverteTemperatura());

    }

    public void ConverteTemperatura() {
        int selectedOptionId = temperatureOptions.getCheckedRadioButtonId();
        switch (selectedOptionId) {
            case R.id.celsius_option:
                ConverteCelcius();
                break;
            case R.id.fahrenheit_option:
                ConverteFahrenheit();
                break;
            case R.id.kelvin_Celsius_option:
                ConverteKelvin(true);
                break;
            case R.id.kelvin_Fahrenheit_option:
                ConverteKelvin(false);
                break;
        }
    }

    public void  ConverteCelcius() {
        Double valor = CelciusStrategy.getInstance().getConversion(Double.parseDouble(valorASerConvertido.getText().toString()));
        textValorConvertidoCelcius.setText(String.format("%.2f °C", valor));
    }
    public void ConverteFahrenheit() {
        Double valor = FahrenheitStrategy.getInstance().getConversion(Double.parseDouble(valorASerConvertido.getText().toString()));
        textValorConvertidoCelcius.setText(String.format("%.2f °F", valor));
    }
    public void ConverteKelvin(boolean isCelcius) {
        Double valor = KelvinStrategy.getInstance().getConversion(Double.parseDouble(valorASerConvertido.getText().toString()),isCelcius);
        textValorConvertidoCelcius.setText(String.format("%.2f K", valor));
    }

}