package com.enigma.di.dependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class DieselEngine implements Engine {

    @Override
    public void startEngine() {
        System.out.println("Diesel Engine is started");
    }
}
