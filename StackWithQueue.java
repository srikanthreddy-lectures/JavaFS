package com.app;

import java.util.*;

class MyStack{
    Queue<Integer> queue = new LinkedList<>();
    //push(int i)
    public void push(int i){
        queue.offer(i);
        for (int j = 0; j < queue.size()-1; j++) {
            queue.offer(queue.poll());
        }
    }
    public int pop(){
        return queue.poll();
    }
    public int top(){
        return queue.peek();
    }
    public boolean empty(){
        return queue.isEmpty();
    }
    public void printList(){
        queue.forEach(a-> System.out.print(a+" "));
    }
}

public class Test2 {
    public static void main(String[] args) {
    MyStack stack = new MyStack();
    Scanner scan=new Scanner(System.in);
    while (true){
        String str  = scan.nextLine(); // push 20
        String choice[]=str.split(" ");

        switch (choice[0]){
            case "push": stack.push(Integer.parseInt(choice[1]));break;
            case "pop": System.out.println(stack.pop());break;
            case "top": System.out.println(stack.top());break;
            case "empty": System.out.println(stack.empty());break;
            case "list": stack.printList();break;
            default:System.exit(0);
        }
    }

    }
}
