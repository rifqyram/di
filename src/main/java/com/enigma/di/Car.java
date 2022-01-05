package com.enigma.di;

public class Car {

    /*
    * Access Modifier di Java (Private, Protected, Public)
    * - Public properti atau method bisa diakses di file atau class manapun
    * - Protected bisa diakses di class turunan (inheritance)
    * - Private hanya bisa diakses di class itu sendiri
    * */

    private Integer wheel;

    private String color;

    public Car(Integer wheel, String color) {
        this.wheel = wheel;
        this.color = color;
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
