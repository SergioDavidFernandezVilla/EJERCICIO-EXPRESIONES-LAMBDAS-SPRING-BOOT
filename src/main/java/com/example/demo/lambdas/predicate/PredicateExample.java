package com.example.demo.lambdas.predicate;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        /* Predicate */
        // Recibe dos valores y devuelve un booleano.
        Predicate<Integer> predicate = (num) -> num % 2 == 0; // <- SI ES PAR O IMPAR 
        System.out.println(predicate.test(21));
    }
}
