package com.example.demo.lambdas.biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        /* BiConsumer */
        // Recibe dos parametros y no retorna nada.
        BiConsumer<String, Integer> biConsumer = (param1, param2) -> System.out.println(param1 + " " + param2);

        biConsumer.accept("Hola", 10);
    }
}
