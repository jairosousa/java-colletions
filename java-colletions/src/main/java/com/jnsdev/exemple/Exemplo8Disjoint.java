package com.jnsdev.exemple;

import java.util.*;

/**
 * @Autor Jairo Nascimento
 * @Created 16/04/2026 - 15:49
 */
public class Exemplo8Disjoint {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3);
        List<Integer> list2 = List.of(4, 5, 6);

        boolean noCommon = Collections.disjoint(list1, list2);

        System.out.println("Sem elementos em comum: " + noCommon);
    }
}
