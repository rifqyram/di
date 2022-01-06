package com.enigma.di.dependencyInjection;

public class ElectricEngine implements Engine {

    @Override
    public void startEngine() {
        System.out.println("Electric Engine is started");
    }
}
