package com.example.exercicio1conversordetemperatura.Model;

public class CelciusStrategy implements   ConversorTemperatura {
    private static CelciusStrategy instance;
    private CelciusStrategy(){}

    public static CelciusStrategy getInstance() {
        if (instance == null) {
            instance = new CelciusStrategy();
        }
        return instance;
    }

    @Override
    public double getConversion(Double temperatura, boolean isCelciusKelvin) {
        return ((temperatura -32) * 5/9);
    }
}
