package com.day4;

public class Main {

    public static void main(String[] args){
//        int i,j,row=6;
//        for(i=0;i<row;i++){
//            for(j=row-1;j>1;j--){
//                System.out.println("");
//            }
//            for(j=0;j<=i;j++){
//                System.out.println("* ");
//            }
//            System.out.println();
//        }
        int i, j, row = 6;
//Outer loop work for rows
        for (i=0; i<row; i++)
        {
//inner loop work for space
            for (j=row-i; j>1; j--)
            {
//prints space between two stars
                System.out.print(" ");
            }
//inner loop for columns
            for (j=0; j<=i; j++ )
            {
//prints star
                System.out.print("* ");
            }
//throws the cursor in a new line after printing each line
            System.out.println();
        }
    }
}


