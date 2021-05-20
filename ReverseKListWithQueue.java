package com.app;

import java.util.*;



public class Test2 {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int k=4;

        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < arr.length; i++) {
            dq.offer(arr[i]);
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            q.offer(dq.poll());
        }

        for (int i = 0; !q.isEmpty(); i++) {
            dq.offerFirst(q.poll());
        }

        dq.forEach(a-> System.out.print(a+" "));

    }
}
