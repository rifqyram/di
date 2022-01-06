package com.enigma.di.oop;

import com.enigma.di.dependencyInjection.Engine;

public class Car {

    /*
    * Access Modifier di Java (Private, Protected, Public)
    * - Public properti atau method bisa diakses di file atau class manapun
    * - Protected bisa diakses di class turunan (inheritance)
    * - Private hanya bisa diakses di class itu sendiri
    * */

    private Integer wheel;
    private String color;
    private Engine engine;

    public Car(Integer wheel, String color, Engine engine) {
        this.wheel = wheel;
        this.color = color;
        this.engine = engine;
    }

    public Car(Engine engine) {
        this.engine = engine;
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
