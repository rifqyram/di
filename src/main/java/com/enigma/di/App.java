package com.enigma.di;

public class App {

    static String address = "Jakarta";
    String alamat = "Jakarta";

    public static void main(String[] args) {
        String name = "Rifqi Ramadhan";
        String fullName = "M Rifqi Ramadhan";
        Integer umur = 24;
        int umur2 = 25;

        // Memanggil variable static di method static
//        System.out.println(address);

        // Memanggil variable non static di method static harus dibuat instance object baru (contoh class App)
        App app = new App();
//        System.out.println(app.alamat);
        Integer resultSum = app.sum(5, 5);
        System.out.println(resultSum);
        app.printName("Rifqi");
    }

    public Integer sum(Integer angka1, Integer angka2) {
        Integer result = angka1 + angka2;
        return result;
    }

    public void printName(String name) {
        System.out.println(name);
    }

}

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