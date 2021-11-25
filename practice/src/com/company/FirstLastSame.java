package com.company;



public class FirstLastSame {



    public static void main(String[] args) {

        int n=78887;
        int firstno=0;
        int lastno=0;

        lastno=n%10;
        System.out.print(lastno);


        while(n!=0) {
            firstno = n%10;
            n=n/10;
            System.out.print(firstno);
        }
        if(firstno==lastno) {
            System.out.println("First and Last digits are Same");
        }
        else
        {
            System.out.println("Different");
        }



    }
}