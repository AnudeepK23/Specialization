package com.company;

class Three {
    public static void commonElements(int[] arr1,
                                      int[] arr2,
                                      int[] arr3, int n1,
                                      int n2, int n3)
    {
        // creating a max variable
        // for storing the maximum
        // value present in the all
        // the three array
        // this will be the size of
        // array for calculating the
        // frequency of each element
        // present in all the array
        int max = Integer.MIN_VALUE;

        // deleting duplicates in linear time
        // for arr1
        int res1 = 1;
        for (int i = 1; i < n1; i++)
        {
            max = Math.max(arr1[i], max);
            if (arr1[i] != arr1[res1 - 1])
            {
                arr1[res1] = arr1[i];
                res1++;
            }
        }

        // deleting duplicates in linear time
        // for arr2
        int res2 = 1;
        for (int i = 1; i < n2; i++)
        {
            max = Math.max(arr2[i], max);
            if (arr2[i] != arr2[res2 - 1])
            {
                arr2[res2] = arr2[i];
                res2++;
            }
        }

        // deleting duplicates in linear time
        // for arr3
        int res3 = 1;
        for (int i = 1; i < n3; i++)
        {
            max = Math.max(arr3[i], max);
            if (arr3[i] != arr3[res3 - 1])
            {
                arr3[res3] = arr3[i];
                res3++;
            }
        }

        // creating an array for finding frequency
        int[] freq = new int[max + 1];

        // calculating the frequency of
        // all the elements present in
        // all the array
        for (int i = 0; i < res1; i++)
            freq[arr1[i]]++;
        for (int i = 0; i < res2; i++)
            freq[arr2[i]]++;
        for (int i = 0; i < res3; i++)
            freq[arr3[i]]++;

        // iterating till max and
        // whenever the frequency of element
        // will be three we print that element
        for (int i = 0; i <= max; i++)
            if (freq[i] == 3)
                System.out.print(i + " ");
    }

    
    public static void main(String[] arg)
    {

        int arr1[] = { 12, 35, 310, 120, 640, 180,20 };
        int arr2[] = {656, 327, 120, 180, 5600,20};
        int arr3[] = {33, 44, 515, 120, 330, 770, 180, 1120,0};

        commonElements(arr1, arr2, arr3, 7, 6, 9);
    }
}
