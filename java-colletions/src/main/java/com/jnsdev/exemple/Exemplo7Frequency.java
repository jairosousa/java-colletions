package com.jnsdev.exemple;

import java.util.*;

/**
 * @Autor Jairo Nascimento
 * @Created 16/04/2026 - 15:42
 */
public class Exemplo7Frequency {
    public static void main(String[] args) {
        List<String> list = List.of("apple", "banana", "apple", "orange", "apple");

        int count = Collections.frequency(list, "apple");

        System.out.println("Ocorrências de 'apple': " + count);
    }
}

