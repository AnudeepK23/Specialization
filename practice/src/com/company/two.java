package com.company;

import java.util.*;



public class two {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to be round of upto two decimal places");
        double number = sc.nextDouble();
        System.out.format("%.2f", number);
    }
}