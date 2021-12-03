package com.day10;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Map<String,Integer>priceMap = new HashMap<>();
        priceMap.put("TV",880);
        priceMap.put("FAN",900);
        priceMap.put("Fridge",980);
        priceMap.put("TABLE",8000);
        priceMap.put("TABLE",8000);
        System.out.println("priceMap "+priceMap);

        Set<String> keys = priceMap.keySet();
        Collection<Integer> values = priceMap.values();
        Set<Map.Entry<String,Integer>> entries = priceMap.entrySet();
        System.out.println("keys of Map "+keys);
        System.out.println("values from Map "+values);
        System.out.println("entries from Map "+entries);

    }
}
