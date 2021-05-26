package com.app;
/*

You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.

Return the max sliding window.

Example 1:

Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]
Explanation:
Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7
Example 2:

Input: nums = [1], k = 1
Output: [1]
Example 3:

Input: nums = [1,-1], k = 1
Output: [1,-1]


case=1

input=8             //size of array
1 3 -1 -3 5 3 6 7  // elements
3                   // k value
output=[3, 3, 5, 5, 6, 7]

*/
import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        System.out.println(solver(nums,k));
    }

    public static List<Integer> solver(int[] nums, int k){
        List<Integer> list = new ArrayList<>();
        //logic
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < k; i++) {
            while (!dq.isEmpty() && nums[i]>= nums[dq.peekLast()])
                dq.pollLast();
           dq.offerLast(i);
        }

        for (int i = k; i < nums.length; i++) {
            list.add(nums[dq.peekFirst()]);
            while (!dq.isEmpty() && dq.peekFirst() <= i-k )
                dq.pollFirst();
            while (!dq.isEmpty() && nums[i]>= nums[dq.peekLast()])
                dq.pollLast();
            dq.offerLast(i);
        }
        list.add(nums[dq.pollFirst()]);
        return list;
    }
}
