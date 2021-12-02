package com.collections;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IterateOverHashSet {
    public static void main(String[] args){
        Set<String> progLang = new HashSet<>();
        progLang.add("C");
        progLang.add("C++");
        progLang.add("Python");
        progLang.add("Java");

        System.out.println("==Iterate over a HashSet using Java 8 forEach and lambda ==");
        progLang.forEach(progLanguage->{
            System.out.println(progLanguage);
        });

        System.out.println("==Iterate over a HashSet using iterator() ==");
        Iterator<String> progLanguageIterator = progLang.iterator();
        while (progLanguageIterator.hasNext()){
            String progLanguage = progLanguageIterator.next();
            System.out.println(progLanguage);
        }
        System.out.println("==Iterate over a HashSet using iterator() and Java 8 forEachRemaining() method  ==");
        progLanguageIterator = progLang.iterator();

        progLanguageIterator.forEachRemaining(progLanguage->{
            System.out.println(progLanguage);
        });

        System.out.println("==Iterate over a HashSet using simple forEach loop ==");
        for(String progLanguage:progLang){
            System.out.println(progLanguage);
        }

    }
}
