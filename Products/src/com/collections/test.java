package com.collections;

import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        Teacher t = new Teacher();
        Class_Id c = new Class_Id();
        map.put(t.setName("Anudeep"),c.setClassNo(1));
        map.put(t.setName("ram"),c.setClassNo(2));
        map.put(t.setName("raj"),c.setClassNo(3));
        map.put(t.setName("virat"),c.setClassNo(4));
        map.put(t.setName("ajay"),c.setClassNo(5));



        System.out.println(map);




    }
}