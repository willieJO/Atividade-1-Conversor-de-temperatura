package com.example.exercicio1conversordetemperatura.Model;

public class KelvinStrategy implements ConversorTemperatura{

    private static KelvinStrategy instance;

    private KelvinStrategy(){}

    public static KelvinStrategy getInstance() {
        if (instance == null) {
            instance = new KelvinStrategy();
        }
        return instance;
    }

    @Override
    public double getConversion(Double temperatura, boolean isCelciusKelvin) {
        if (isCelciusKelvin) {
            return (temperatura + 273.15);
        }
        return ((temperatura - 32) * 5/9 + 273.15);
    }
}
