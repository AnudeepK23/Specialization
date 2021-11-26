package com.day4;

import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args){
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5
//
//
//        for(int i=1;i<=5;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j+ " ");
//            }
//            System.out.println();
//        }


//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15
//        for(int i=1,k=1;i<=5;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(k+++ " ");
//            }
//            System.out.println();
//        }

//                1
//              1   1
//            1   2   1
//          1   3   3   1
//         1   4   6   4   1

//
//        int n =5;
//        for(int i=0;i<n;i++){
//            int num =1;
//            System.out.printf("%"+(n-i)*2 + "s" , "");
//            for(int j=0;j<=i;j++){
//                System.out.printf("%4d",num);
//                num=num*(i-j)/(j+1);
//            }
//            System.out.println();
//       }




//        1
//        212
//        32123
//        4321234
//        32123
//        212
//        1


//        for (int i = 1; i <= 4; i++)
//        {
//            int n = 8;
//            for (int j = 1; j<= n - i; j++)
//            {
//                System.out.print(" ");
//            }
//            for (int k = i; k >= 1; k--)
//            {
//                System.out.print(k);
//            }
//            for (int l = 2; l <= i; l++)
//            {
//                System.out.print(l);
//            }
//            System.out.println();
//        }
//        for (int i = 3; i >= 1; i--) {
//            int n = 10;
//            for (int j = 0; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = i; k >= 1; k--) {
//                System.out.print(k);
//            }
//            for (int l = 2; l <= i; l++) {
//                System.out.print(l);
//            }
//            System.out.println();
//
//        }
//
//        1
//        2 2
//        3 3 3
//        4 4 4 4
//        5 5 5 5 5

//        int i,j;
//        for(i=1;i<=5;i++){
//            for(j=1;j<=i;j++){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }
//        Enter number of rows you want :
//        6
//        6
//        65
//        654
//        6543
//        65432
//        654321

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number of rows you want : ");
//        int rows = sc.nextInt();
//        for(int i=rows;i>=1;i--){
//            for(int j=rows;j>=i;j--){
//                System.out.print(j+"");
//            }
//            System.out.println();
//        }

//        Enter number of rows you want :
//        5
//        1
//        21
//        321
//        4321
//        54321

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number of rows you want : ");
//        int rows = sc.nextInt();
//        for(int i=1;i<=rows;i++){
//            for(int j=i;j>=1;j--){
//                System.out.print(j+"");
//            }
//            System.out.println();
//        }


//        Enter number of rows you want :
//        5
//        1 2 3 4 5
//        2 3 4 5
//        3 4 5
//        4 5
//        5
//        4 5
//        3 4 5
//        2 3 4 5
//        1 2 3 4 5

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows you want : ");
        int rows = sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for (int k=i;k<=rows;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
        for(int i=rows-1;i>=1;i--){
            for(int j=i;j>1;j--){
                System.out.print(" ");
            }
            for (int k=i;k<=rows;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
