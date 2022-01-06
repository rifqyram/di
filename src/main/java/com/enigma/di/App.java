package com.enigma.di;

import com.enigma.di.dependencyInjection.DieselEngine;
import com.enigma.di.dependencyInjection.ElectricEngine;
import com.enigma.di.dependencyInjection.GasolineEngine;
import com.enigma.di.oop.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        GasolineEngine gasolineEngine = (GasolineEngine) applicationContext.getBean("gasolineEngine");
        ElectricEngine electricEngine = (ElectricEngine) applicationContext.getBean("electricEngine");
        DieselEngine dieselEngine = (DieselEngine) applicationContext.getBean("dieselEngine");

        Car mazda = (Car) applicationContext.getBean("mazda");
        mazda.run();
    }
}

/* public void sayHello(String name) {
        System.out.println(name);
    }

    public void sayHello(String firstName, String lastName) {
        System.out.println(firstName + " " + lastName);
    }

    public Integer sum(Integer angka1, Integer angka2) {
        Integer result = angka1 + angka2;
        return result;
    }

    public void printName(String name) {
        System.out.println(name);
    }*/

 /*Car toyota = new Car(4, "Yellow");
        toyota.setColor("Black");
        toyota.setWheel(6);
        System.out.println("Ban Mobil: " + toyota.getWheel());
        System.out.println("Warna Mobil: " + toyota.getColor());
        */

        /*Rectangle rectangle = new Rectangle(10.0, 5.0);
        Double surface = rectangle.getSurface();
        System.out.println(surface);
        */

/*        Block block = new Block(10.5, 5.5, *//*20.0);
        Double result = block.getSurface();
        System.out.println(result);*/

/*        App app = new App();
        app.sayHello("Rifqi", "Ramadhan");*/

        /*Engine engine = new GasolineEngine();
        GasolineEngine gasolineEngine = new GasolineEngine();
        DieselEngine dieselEngine = new DieselEngine();
        ElectricEngine electricEngine = new ElectricEngine();

        Car mazda = new Car(4, "Black", dieselEngine);
        mazda.run();*/


//    String name = "Rifqi Ramadhan";
//    String fullName = "M Rifqi Ramadhan";
//    Integer umur = 24;
//    int umur2 = 25;
//
//    // Memanggil variable static di method static
////        System.out.println(address);
//
//    // Memanggil variable non static di method static harus dibuat instance object baru (contoh class App)
//    App app = new App();
//    //        System.out.println(app.alamat);
//    Integer resultSum = app.sum(5, 5);
//        System.out.println(resultSum);
//                app.printName("Rifqi");

// byte short int log float double boolean -- Tipe Data Primitive
// String, Collection(List, Set, Map) -- Tipe Data Non-Primitive

// Looping for, foreach, while, do while
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//        }

// If else
//        if (umur == 25) {
//            System.out.println("Benar");
//            // Eksekusi program disini
//        } else {
//            System.out.println("Salah");
//            // Eksekusi program else
//        }

// array di java
//    int[] numbers = new int[5];
//        numbers[0] = 5;
//                numbers[1] = 4;
//                numbers[2] = 3;
//                numbers[3] = 2;
//                numbers[4] = 1;
//
//                for (int i = 0; i < numbers.length; i++) {
//        System.out.println(numbers[i]);
//        }
//
//        // Cara lain buat array di java
//        String[] names = {"Rifqi", "Ramadhan"};
//
//        for (int i = 0; i < names.length; i++) {
//        System.out.println(names[i]);
//        }