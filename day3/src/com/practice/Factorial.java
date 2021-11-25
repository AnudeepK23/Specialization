package com.practice;

import java.util.Scanner;

public class Factorial {

    public static long fact(int x){
        if(x == 0 || x == 1){
            return 1;
        }
        else
        {
            return fact(x-1)*x;
        }


    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        System.out.println("Factorial is "+fact(a));
//        System.out.println(fact(4));
//        System.out.println(fact(3));
//        System.out.println(fact(2));
//        System.out.println(fact(1));
//        System.out.println(fact(0));
    }
}
