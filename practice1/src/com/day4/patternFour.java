package com.day4;

public class patternFour {
    public static void main(String[] args) {
//        for (int i = 1, k = 64; i <= 6; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print((char) (k + j) + " ");
//            }
//            System.out.println();
//        }
        for (int i = 1, k = 65; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (k ++) + " ");
            }
            System.out.println();
        }

    }
}
