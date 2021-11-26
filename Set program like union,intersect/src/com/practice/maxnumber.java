package com.practice;

import java.util.Scanner;

public class maxnumber {
    public static void Big(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a = sc.nextInt();
        System.out.println("Enter the second number :");
        int b = sc.nextInt();
        System.out.println("Enter the third number :");
        int c = sc.nextInt();
        int g = Math.max(a, b);
        g = Math.max(g, c);

        System.out.println("Greatest Number = " + g);
        int x = Math.min(a, b);
        x = Math.min(x, c);
        System.out.println("Lowest Number = " + x);



        //or
//        if(a>b){
//            if(a>c){
//                System.out.println("The highest number is"+a);
//            }
//        }
//        else if(b>c){
//            if(b>a){
//                System.out.println("The highest number is"+b);
//            }
//        }
//        else{
//            System.out.println("The highest number is"+c);
//        }
//
        }

    public static void main(String[] args){
        Big();
    }

}
