package com.example.demo.lambdas.function;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        /* Function */
        // Recibe un valor y lo retorna como en un resultado.

        Function<Integer, String> function = (param) -> "El numero es: " + param;
        System.out.println(function.apply(5));
    }
}
