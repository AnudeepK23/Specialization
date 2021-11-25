package com.company;
////// Java program to find common elements in three arrays
////public class Main
////{
////    // This function prints common elements in ar1
////    void main(int ar1[], int ar2[], int ar3[])
////    {
////        // Initialize starting indexes for ar1[], ar2[] and ar3[]
////        int i = 0, j = 0, k = 0;
////
////        // Iterate through three arrays while all arrays have elements
////        while (i < ar1.length && j < ar2.length && k < ar3.length)
////        {
////            // If x = y and y = z, print any of them and move ahead
////            // in all arrays
////            if (ar1[i] == ar2[j] && ar2[j] == ar3[k])
////            { System.out.print(ar1[i]+" "); i++; j++; k++; }
////
////            // x < y
////            else if (ar1[i] < ar2[j])
////                i++;
////
////                // y < z
////            else if (ar2[j] < ar3[k])
////                j++;
////
////                // We reach here when x > y and z < y, i.e., z is smallest
////            else
////                k++;
////        }
////    }
////
////    // Driver code to test above
////    public static void main(String args[])
////    {
////        Main ob = new Main();
////
////        int ar1[] = {1, 5, 10, 20, 40, 80};
////        int ar2[] = {6, 7, 20, 80, 100};
////        int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120};
////
////        System.out.print("Common elements are ");
////        ob.main(ar1, ar2, ar3);
////    }
////}
////
/////*This code is contributed by Rajat Mishra */
//
////
//import java.util.Scanner;
//
//public class Main {
//
//
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        int sum = 0;
//
//
//        for (int i = num1; i <= num2; i++) {
//            if (isPrime(i) == true)
//                System.out.print(i + " ");
//        }
//         sum =  num1 + num2;
//        System.out.println("Sum is" +sum);
//
//    }
//
//
//        static boolean isPrime (int n){
//
//            boolean res = false;
//            int i;
//            for (i = 2; (i <= n / 2) && (n % i != 0); i++) ;
//
//            if (i > n / 2) {
//                res = true;
//            }
//            return res;
//
//
//        }
//
//
//}

//import java.text.DecimalFormat;
//
//public class Main {
//    public static void main(String[] args){
//        double num = 1.4567;
//        DecimalFormat df = new DecimalFormat("#.##");
//        System.out.println(df.format(num));
//    }
//}
// Java Program to compute sum of prime number
// in a given range
public class Main {

    // Method to compute the prime number
    // Time Complexity is O(sqrt(N))
    static boolean checkPrime(int numberToCheck)
    {
        if(numberToCheck == 1) {
            return false;
        }
        for (int i = 2; i*i <= numberToCheck; i++) {
            if (numberToCheck % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to iterate the loop from l to r
    // If prime number detects, sum the value
    static int primeSum(int l, int r)
    {
        int sum = 0;
        for (int i = r; i >= l; i--) {

            // Check for prime
            boolean isPrime = checkPrime(i);
            if (isPrime) {

                // Sum the prime number
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args)
    {
        int l = 1, r = 6;

        // Call the method with l and r
        System.out.println(primeSum(l, r));
    }
}


