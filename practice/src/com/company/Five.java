package com.company;


import java.util.*;

class Five
{
    // Function to count the sum
    static int sumKRepeating(int arr[],
                             int n, int k)
    {
        int sum = 0;

        
        Vector<Boolean> visited = new Vector<Boolean>();

        for (int i = 0; i < n; i++)
            visited.add(false);
        
        for (int i = 0; i < n; i++)
        {

            // If arr[i] already processed
            if (visited.get(i) == true)
                continue;

            // counting occurrences of arr[i]
            int count = 1;
            for (int j = i + 1; j < n; j++)
            {
                if (arr[i] == arr[j])
                {
                    count++;
                    visited.add(j, true);
                }
            }

            if (count == k)
                sum += arr[i];
        }

        return sum;
    }

    // Driver code
    public static void main(String args[])
    {
        int arr[] = { 9, 10, 10, 10,
                8, 8, 9, 8 };
        int n = arr.length;
        int k = 3;
        System.out.println(sumKRepeating(arr, n, k));
    }
}


