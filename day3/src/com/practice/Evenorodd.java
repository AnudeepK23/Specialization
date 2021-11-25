package com.practice;

import java.util.Scanner;

public class Evenorodd {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Elements are even");
        } else {
            System.out.println("Elements are odd");
        }
    }
}
