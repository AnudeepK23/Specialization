package com.collections;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayList {

    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Leopard");
        animals.add("Elephant");
        System.out.println(animals);

        animals.add(2,"Giraffe");

        System.out.println(animals);

    }
}
