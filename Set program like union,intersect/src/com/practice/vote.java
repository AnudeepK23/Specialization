package com.practice;

import java.util.Scanner;

public class vote {
    public static void Election(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age :");
        int age = sc.nextInt();

        if(age>= 18){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println(" Not Eligible to vote");
        }
    }
    public static void main(String[] args){
        Election();
    }
}
