package com.enigma.di.oop;

import com.enigma.di.dependencyInjection.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {

    /*
    * Access Modifier di Java (Private, Protected, Public)
    * - Public properti atau method bisa diakses di file atau class manapun
    * - Protected bisa diakses di class turunan (inheritance)
    * - Private hanya bisa diakses di class itu sendiri
    * */

    private Integer wheel;
    private String color;

    @Autowired
    @Qualifier("gasolineEngine")
    private Engine engine;

    public Car(Integer wheel, String color) {
        this.wheel = wheel;
        this.color = color;
    }

    public Car() {
    }

    public void run() {
        engine.startEngine();
    }

    public Integer getWheel() {
        return this.wheel;
    }

    public String getColor() {
        return this.color;
    }

    public void setWheel(Integer wheel) {
        this.wheel = wheel;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
