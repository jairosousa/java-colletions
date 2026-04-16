package com.jnsdev.exemple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Autor Jairo Nascimento
 * @Created 16/04/2026 - 15:34
 */
public class Exemplo3Unmodifiable {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("A");
        items.add("B");

        List<String> safeList = Collections.unmodifiableList(items);

        System.out.println(safeList);
    }
}

