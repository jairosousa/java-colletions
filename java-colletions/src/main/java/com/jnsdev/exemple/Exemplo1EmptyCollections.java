package com.jnsdev.exemple;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Autor Jairo Nascimento
 * @Created 16/04/2026 - 15:29
 */
public class Exemplo1EmptyCollections {
    public static void main(String[] args) {
        List<String> list = Collections.emptyList();
        Set<Integer> set = Collections.emptySet();
        Map<String, String> map = Collections.emptyMap();

        System.out.println(list);
        System.out.println(set);
        System.out.println(map);
    }
}

