package com.jnsdev.exemple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Autor Jairo Nascimento
 * @Created 16/04/2026 - 15:39
 */

public class Exemplo6ComputeIfAbsent {
    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();

        map.computeIfAbsent("frutas", k -> new ArrayList<>()).add("Banana");
        map.computeIfAbsent("frutas", k -> new ArrayList<>()).add("Maçã");

        System.out.println(map);
    }
}

