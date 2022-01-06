package com.enigma.di;

import com.enigma.di.dependencyInjection.DieselEngine;
import com.enigma.di.dependencyInjection.ElectricEngine;
import com.enigma.di.dependencyInjection.GasolineEngine;
import com.enigma.di.oop.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public GasolineEngine gasolineEngine() {
        return new GasolineEngine();
    }

    @Bean
    public DieselEngine dieselEngine() {
        return new DieselEngine();
    }

    @Bean
    public ElectricEngine electricEngine() {
        return new ElectricEngine();
    }

    @Bean
    public Car mazda() {
        return new Car(gasolineEngine());
    }
}
