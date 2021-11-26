package com.practice;

import java.util.Scanner;

public class Summethod {
    public static void Add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int n1 = sc.nextInt();
        System.out.println("Enter second number");
        int n2 = sc.nextInt();
        int sum = n1 + n2;
        System.out.println("Sum is :"+sum);

    }
    public static void main(String[] args){
        Add();
    }
}
