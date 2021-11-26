package com.practice;

import java.util.Scanner;

class Income
{
    public static void main(String args[])
    {
        double t=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter income ");
        double i=sc.nextDouble();
        t=incomeTax(i);
        System.out.println("Income tax amount is "+t);
    }
    static double incomeTax(double i)
    {
        double tax;
        if(i<=100000)
            tax=0;
        else if((i>100000) && (i<=200000))
            tax=0.1*(i-100000);
        else if((i>200000) && (i<=500000))
            tax=(0.2*(i-200000))+10000;
        else
            tax=(0.3*(i-500000))+50000;
//        else
//            tax=(0.4*(i-1000000))+200000;
        return tax;

    }
}