package com.enigma.di.dependencyInjection;

public class DieselEngine implements Engine {

    @Override
    public void startEngine() {
        System.out.println("Diesel Engine is started");
    }
}
