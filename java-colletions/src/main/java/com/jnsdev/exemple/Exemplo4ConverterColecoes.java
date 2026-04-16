package com.jnsdev.exemple;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Autor Jairo Nascimento
 * @Created 16/04/2026 - 15:35
 */
public class Exemplo4ConverterColecoes {
    public static void main(String[] args) {
        List<String> list = List.of("A", "B", "C");

        Set<String> set = new HashSet<>(list);
        List<String> list2 = new ArrayList<>(set);

        System.out.println(set);
        System.out.println(list2);
    }
}

