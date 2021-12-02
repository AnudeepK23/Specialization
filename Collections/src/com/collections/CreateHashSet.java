package com.collections;

import java.util.HashSet;
import java.util.Set;

public class CreateHashSet {
    public static void main(String[] args){
        Set<String> daysOfWeek = new HashSet<>();

        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        System.out.println(daysOfWeek);

        daysOfWeek.add("Monday");
        System.out.println(daysOfWeek);


    }
}
