package com.example.demo.steam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SteamExample {
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("juan", "maria", "erika");

        List<String> result = names.stream()
            .map((name) -> name.toUpperCase())
            .collect(Collectors.toList());

            result.stream()
            .forEach(System.out::println);
    }
}
