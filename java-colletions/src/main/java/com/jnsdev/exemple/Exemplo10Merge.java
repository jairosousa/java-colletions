package com.jnsdev.exemple;

import java.util.*;

/**
 * @Autor Jairo Nascimento
 * @Created 16/04/2026 - 15:52
 */
public class Exemplo10Merge {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        String[] words = {"java", "code", "java", "map", "code", "java"};

        for (String word : words) {
            map.merge(word, 1, Integer::sum);
        }

        System.out.println(map);
    }
}

