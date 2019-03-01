package com.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Arrays;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        Arrays.parallelSort(arr);
        BigInteger common=BigInteger.valueOf(arr[1]).add(BigInteger.valueOf(arr[2])).add(BigInteger.valueOf(arr[3]));
        BigInteger min=BigInteger.valueOf(arr[4]).add(common);
        BigInteger max=BigInteger.valueOf(arr[4]).add(common);
        System.out.print(min);
        System.out.print(" ");
        System.out.print(max);
    }

    //private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = "256741038 623958417 467905213 714532089 938071625".split(" ");
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        //scanner.close();
    }
}
