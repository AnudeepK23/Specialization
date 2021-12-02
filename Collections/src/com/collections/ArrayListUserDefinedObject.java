package com.collections;

import java.util.ArrayList;
import java.util.List;

class User{

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



}

public class ArrayListUserDefinedObject {
    public static void main(String[] args){
        List<User> users = new ArrayList<>();
        users.add(new User("Raj",30));
        users.add(new User("Cherry",49));
        users.add(new User("Chiru",65));
        users.add(new User("Kalyan",50));
        users.forEach(user ->{
            System.out.println("Name :"+user.getName()+",Age :"+user.getAge());
        });

    }
}
