package com.company;

import java.util.Scanner;

public class four {
    public static void main(String[] args) {
//        int a = 5696;
//
//
//
//        int first = a / 1000 + 3;
//
//        int b = a % 1000;
//        int second = b / 100 + 3;
//
//        int c = b % 100;
//        int d = c / 10 + 3;
//        int third = d / 10;
//
//        int e = c % 10;
//        int fourth = e + 3;
//
//        String result = Integer.toString(first) + Integer.toString(second) + Integer.toString(third) + Integer.toString(fourth);
//
//        System.out.println(result);
//    }
        //or



           //n = 78887
        // n = n%10000 = 8887
        // n = n%1000 = 887
        // n = n%100 = 87
        //n = n%10=7

        //n = n/10000 = 7


        // 5696.....
        // 8929... 1000 * 8 + 9 * 100 + 2* 10 + 9 * 1

        // 5696...

//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//
//        int p = 1;
//        int res =0;
//        for(int r=0; n != 0 ;) {
//
//            r = n % 10;// 5696 % 10....6
//            n = n /10; // 569... 56 5 0
//            r = r+3;
//            r = r % 10;// 10 % 10 ===0
//            //if(r >= 10) {
//            //r = r - 10;// 9+3=12-10=2
//            //r = r % 10;// 12 % 10===2
//            //    }
//            res = res + r * p;
//            p = p* 10;
//
//        }
//
//        System.out.println("result...."+res);///
//        // 5678
//        //8901

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
       // int i = scanner.nextInt();
        int i = n%10;






    }

}