package com.example.demo.lambdas.consumer;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        /* CONSUMER */
        // RECIBE UN VALOR Y NO RETORNA NADA

        Consumer<String> consumer = System.out::println;
            

        consumer.accept("Hi");
    }
}
