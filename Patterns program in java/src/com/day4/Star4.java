package com.day4;

import java.util.Scanner;

public class Star4 {
    public static void main(String[] args) {
//             *
//           * *
//         * * *
//       * * * *
//     * * * * *
//   * * * * * *

//        int i, j, row = 6;
//        for (i=0; i<row; i++)
//        {
//            for (j=2*(row-i); j>=0; j--)
//            {
//                System.out.print(" ");
//            }
//            for (j=0; j<=i; j++ )
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//            }

//     *
//    * *
//   * * *
//  * * * *
// * * * * *
//* * * * * *

//        int i, j, row = 5;
//
//        for (i = row; i > 0; i--) {
//            for (j = i - row; j < 0; j++) {
//                System.out.print(" ");
//            }
//            for (j = i; j > 0; j--) {
//
//                System.out.print(" *");
//            }
//        * * * * * *
//         * * * * *
//          * * * *
//           * * *
//            * *
//             *
//            * *
//           * * *
//          * * * *
//         * * * * *

//
//        int i, j, row = 5;
//        for (i = row; i >0; i--) {
//            for (j = 1; j <=row-i; j++) {
//                System.out.print(" ");
//            }
//            for (j = 0; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//            for (i = 0; i < row; i++) {
//                for (j = row - i; j > 1; j--) {
//                    System.out.print(" ");
//                }
//                for (j = 0; j <= i; j++) {
//                    System.out.print(" *");
//                }
//                System.out.println();
//            }

//        Enter the number of rows you want to print: 7
//                *
//               ***
//              *****
//             *******
//            *********
//           ***********
//          *************
//           ***********
//            *********
//             *******
//              *****
//               ***
//                *

//        int row, i, j, space = 1;
//        System.out.print("Enter the number of rows you want to print: ");
//        Scanner sc = new Scanner(System.in);
//        row = sc.nextInt();
//        space = row - 1;
//        for (j = 1; j <= row; j++) {
//            for (i = 1; i <= space; i++) {
//                System.out.print(" ");
//            }
//            space--;
//            for (i = 1; i <= 2 * j - 1; i++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//        space = 1;
//        for (j = 1; j <= row - 1; j++) {
//            for (i = 1; i <= space; i++) {
//                System.out.print(" ");
//            }
//            space++;
//            for (i = 1; i <= 2 * (row - j) - 1; i++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

//        ********
//         *******
//          ******
//           *****
//            ****
//             ***
//              **
//               *
//
//        int rows=8;
//        for (int i= 0; i<= rows-1; i++)
//        {
//            for (int j=0; j<=i; j++)
//            {
//                System.out.print(" ");
//            }
//            for (int k=0; k<=rows-1-i; k++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//            *
//           * *
//          *   *
//         *     *
//        *********

        int i, j, k, rows=5;
        for (i=1; i<= rows ; i++)
        {
            for (j = i; j < rows ; j++)
            {
                System.out.print(" ");
            }
            for (k = 1; k <= (2*i -1) ;k++)
            {
                if(k==1 || i == rows || k==(2*i-1))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }
}
