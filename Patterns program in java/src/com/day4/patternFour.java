package com.day4;

public class patternFour {
    public static void main(String[] args) {

//        A
//        A B
//        A B C
//        A B C D
//        A B C D E
//        A B C D E F
//        for (int i = 1, k = 64; i <= 6; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print((char) (k + j) + " ");
//            }
//            System.out.println();
//        }



//        A
//        B C
//        D E F
//        G H I J
//        K L M N O
//        P Q R S T U



        for (int i = 1, k = 65; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (k ++) + " ");
            }
            System.out.println();
        }

    }
}
