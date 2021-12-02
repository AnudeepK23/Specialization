package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CreateHashSetFromCollections {
    public static void main(String[] args){
        List<Integer> numDivBy5 = new ArrayList<>();
        numDivBy5.add(25);
        numDivBy5.add(95);
        numDivBy5.add(35);
        numDivBy5.add(15);

        List<Integer> numDivBy3 = new ArrayList<>();
        numDivBy3.add(33);
        numDivBy3.add(9);
        numDivBy3.add(15);
        numDivBy3.add(3);

        Set<Integer> numDivBy5Or3 = new HashSet<>(numDivBy5);
        numDivBy5Or3.addAll(numDivBy3);
        System.out.println(numDivBy5Or3);

    }
}
