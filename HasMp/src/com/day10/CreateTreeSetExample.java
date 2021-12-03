package com.day10;

import java.util.SortedSet;
import java.util.TreeSet;

public class CreateTreeSetExample {
    public static void main(String[] args){
        SortedSet<String> fruits = new TreeSet<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("pineapple");
        System.out.println("Fruits are :"+fruits);

        fruits.add("Apple");
        System.out.println("Adding Apple Fruit :"+fruits);

        fruits.add("banana");
        System.out.println("Addind banana Fruit :"+fruits);



    }
}
