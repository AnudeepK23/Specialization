package com.day4;

public class Star2 {
    public static void main(String[] args) {
//        * * * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *

//        int i, j, row = 6;
//        for (i = row; i > 0; i--) {
//            for (j = row ; j > 0; j--) {
//
//                System.out.print("");
//            }
//            for (j = 0; j <= i-1; j++) {
//                System.out.print("* ");
//
//            }
//
//            System.out.println();
//        }

//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *


        int i, j, row = 5;
        for (i =0; i <row; i++) {
            for (j = 0 ; j <row; j++) {
                System.out.print("");
            }
            for (j = i; j>0; j--) {
                System.out.print("* ");

            }

            System.out.println();
        }
        for (i = row; i > 0; i--) {
            for (j = row ; j > 0; j--) {
                System.out.print("");
            }
            for (j = 0; j <= i-1; j++) {
                System.out.print("* ");

            }

            System.out.println();
        }

    }
}
