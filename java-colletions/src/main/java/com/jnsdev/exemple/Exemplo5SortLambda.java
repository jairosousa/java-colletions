package com.jnsdev.exemple;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @Autor Jairo Nascimento
 * @Created 16/04/2026 - 15:36
 */
public class Exemplo5SortLambda {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Banana", "Kiwi", "Apple"));

        list.sort(Comparator.comparing(String::length));

        System.out.println(list);
    }
}

