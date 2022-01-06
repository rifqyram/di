package com.enigma.di.dependencyInjection;

public class GasolineEngine implements Engine {

    @Override
    public void startEngine() {
        System.out.println("Gasoline Engine is started");
    }

}
