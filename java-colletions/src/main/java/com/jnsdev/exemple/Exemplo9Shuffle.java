package com.jnsdev.exemple;

import java.util.*;

/**
 * @Autor Jairo Nascimento
 * @Created 16/04/2026 - 15:51
 */
public class Exemplo9Shuffle {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        Collections.shuffle(list);

        System.out.println(list);
    }
}

