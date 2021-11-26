package com.day4;




public class Star3 {
    public static void main(String[] args) {
//
//       *
//      * *
//     * * *
//    * * * *
//   * * * * *
//    * * * *
//     * * *
//      * *
//       *

//        int i,j;
//        for ( i=0; i<5; i++)
//        {
//            for ( j=5-i; j>1; j--)
//            {
//                System.out.print(" ");
//            }
//            for (j=0; j<=i; j++ )
//            {
//
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for ( i=4; i>0; i--)
//        {
//            for ( j=i-4; j<0; j++)
//            {
//                System.out.print(" ");
//            }
//            for (j=i; j>0; j-- )
//            {
//
//                System.out.print(" *");
//            }
//            System.out.println();
//        }
        int rows=8;
        for (int i= 0; i<= rows-1; i++)
        {
            for (int j=0; j<=i; j++)
            {
                System.out.print(" ");
            }
            for (int k=0; k<=rows-1-i; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


