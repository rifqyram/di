package com.enigma.di.dependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class ElectricEngine implements Engine {

    @Override
    public void startEngine() {
        System.out.println("Electric Engine is started");
    }
}
