package com.jnsdev.exemple;

import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * @Autor Jairo Nascimento
 * @Created 16/04/2026 - 15:31
 */
public class Exemplo2OfFactory {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Banana", "Mango");
        Set<Integer> ids = Set.of(1, 2, 3);
        Map<Integer, String> map = Map.of(1, "A", 2, "B");

        System.out.println(fruits);
        System.out.println(ids);
        System.out.println(map);
    }
}
