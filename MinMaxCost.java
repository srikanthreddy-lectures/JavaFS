package com.app;
/*
 You are given a sequence of N integers of array A. You need to partition the sequence,
 where the cost of making a partition from L to R is AL + AR.
 Output the minimum and maximum total cost of making exactly K partitions where the total cost is the sum of costs of each partition.
Example
Input:
5 //size
2 // k value
1 2 3 4 5 // elements

Output:
9 15
*/
import java.util.*;

public class MinMaxCost {
    public static void main(String[] args) {
        int arr[]={1,0,0,0,1};
        int k=2;
        int minCost=0;
        int maxCost=0;

        PriorityQueue<Integer> min = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return Integer.compare(a,b);
            }
        });

        PriorityQueue<Integer> max = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return Integer.compare(b,a);
            }
        });

        for (int i = 0; i < arr.length-1; i++) {
            min.offer(arr[i]+arr[i+1]);
            max.offer(arr[i]+arr[i+1]);
        }

        minCost = arr[0] + arr[arr.length-1];
        maxCost = arr[0] + arr[arr.length-1];

        for (int i = 1; i < k; i++) {
            minCost = minCost + min.poll();
            maxCost = maxCost + max.poll();
        }

        System.out.println(minCost +","+ maxCost);
    }
}
