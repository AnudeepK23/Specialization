package com.practice;

import java.util.Scanner;

public class Product {
    public static void Mul(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int n1 = sc.nextInt();
        System.out.println("Enter second number");
        int n2 = sc.nextInt();
        int n3 = n1 * n2;
        System.out.println("Product is :"+n3);

    }
    public static void main(String[] args){
        Mul();
    }
}
