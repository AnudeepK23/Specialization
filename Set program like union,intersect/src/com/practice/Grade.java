package com.practice;

import java.util.Scanner;

public class Grade {
    public static void Marks(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks :");
        int n = sc.nextInt();
        if(n<=40){
            System.out.println("Fail");
        }
        else if((n>40) && (n<=50)){
            System.out.println("DD");
        }
        else if((n>50) && (n<=60)){
            System.out.println("CD");
        }
        else if((n>60) && (n<=70)){
            System.out.println("BC");
        }
        else if((n>70) && (n<=80)){
            System.out.println("BB");
        }
        else if((n>80) && (n<=90)){
            System.out.println("AB");
        }
        else if((n>90) && (n<=100)){
            System.out.println("AA");
        }
        else{
            System.out.println("Enter correct marks");
        }
    }
    public static void main(String[] args){
        Marks();
    }
}
