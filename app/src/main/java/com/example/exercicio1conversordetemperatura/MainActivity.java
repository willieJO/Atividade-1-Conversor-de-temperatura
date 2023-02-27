package com.example.exercicio1conversordetemperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private EditText valorASerConvertido;
    private Button botaoCelcius;
    private TextView textValorConvertidoCelcius;
    public static final String FORMAT_HOUR = "##:##";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botaoCelcius = findViewById(R.id.buttonConverteCelcius);
        textValorConvertidoCelcius = findViewById(R.id.textValorConvertido);
        valorASerConvertido = findViewById(R.id.textValue);
        botaoCelcius.setOnClickListener(view -> ConverteCelcius());

    }

    public void  ConverteCelcius() {
        Double temperaturaSelecionada = Double.parseDouble(valorASerConvertido.getText().toString());
        textValorConvertidoCelcius.setText(AplicarFormula(temperaturaSelecionada).toString());
    }
    public Double AplicarFormula(Double valor){
        try{
            return ((valor -32) * 5/9);
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Valor digitado é inválido.", Toast.LENGTH_SHORT).show();
            return 0.0;
        }
    }
}