package com.example.demo.lambdas.suplier;

import java.util.function.Supplier;

public class SuplierExample {
    public static void main(String[] args) {
        /* Suplier */
        // No recibe ningun valor y retorna un resultado.

        Supplier<String> supplier = () -> "Hola Mundo";
        System.out.println(supplier.get());
    }
}
