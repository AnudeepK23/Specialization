package com.day4;

//        10101
//        01010
//        10101
//        01010
//        10101


public class twopattern {
    public static void main(String[] args){
//    int rows=5;
//    for(int i=1;i<=rows;i++){
//        int num=0;
//        if(i%2==0){
//            num=0;
//            for(int j=1;j<=rows;j++){
//                System.out.print(num);
//                if(num == 0){
//                    System.out.print(0);
//                }
//                    else{
//                    System.out.print(1);
//                    }
//                }
//            }
//        else{
//            num =1; for(int j=1;j<=rows;j++){
//                System.out.print(num);
//                if(num == 0){
//                    System.out.print(1);
//                }
//                else{
//                    System.out.print(0);
//                }
//            }
//        }
//        System.out.println();
//        }

       // Sint rows=5;
    for(int i=1,k=1;i<=5;i++){
        for(int j=1;j <=5;j++){
            System.out.print(k++%2);
        }
        System.out.println();
    }
    }
}
