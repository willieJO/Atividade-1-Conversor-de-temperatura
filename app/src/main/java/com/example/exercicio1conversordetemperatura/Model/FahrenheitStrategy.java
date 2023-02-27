package com.example.exercicio1conversordetemperatura.Model;

public class FahrenheitStrategy implements  ConversorTemperatura{

    private static FahrenheitStrategy instance;

    private FahrenheitStrategy(){}

    public static FahrenheitStrategy getInstance() {
        if (instance == null) {
            instance = new FahrenheitStrategy();
        }
        return instance;
    }


    @Override
    public double getConversion(Double temperatura, boolean isCelciusKelvin) {
        return ((temperatura * 9/5) + 32);
    }
}
