package com.enigma.di.oop;

import com.enigma.di.dependencyInjection.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnotherCar {

    @Autowired
    @Qualifier("dieselEngine")
    private Engine engine;

    public AnotherCar() {
    }

    public void run() {
        engine.startEngine();
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
