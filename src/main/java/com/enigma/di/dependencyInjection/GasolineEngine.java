package com.enigma.di.dependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class GasolineEngine implements Engine {

    @Override
    public void startEngine() {
        System.out.println("Gasoline Engine is started");
    }

}
