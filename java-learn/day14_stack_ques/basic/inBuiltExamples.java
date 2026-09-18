package day14_stack_ques.basic;

import java.util.*;

public class inBuiltExamples {
    public static void main(String[] args) {
        System.out.println("stack");

        Stack<Integer> stack=new Stack<>();
        stack.push(34);
        stack.push(45);
        stack.push(2);
        stack.push(9);
        stack.push(18);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println("queue");

//Queue is a interface
        Queue<Integer>  queue=new LinkedList<>();
        queue.add(3);
        queue.add(13);
        queue.add(23);
        queue.add(43);
        queue.add(33);

        System.out.println(queue.peek());//it tell about first elemnet
        System.out.println(queue.remove());//it will remove first element


        System.out.println("Deque");
        //dequeue//Array has resizable array they dont have paarticular size
        Deque<Integer> deque=new ArrayDeque<>();//mainly uses in tress

        deque.add(24);
        deque.add(118);
        deque.addFirst(34);//118,24,34
        deque.add(108);

//        deque.removeFirst();
        System.out.println(deque.peek());//only first ele
        System.out.println(deque.pop());//pop line by line
        System.out.println(deque.pop());
        deque.removeLast();
        System.out.println(deque.pop());



    }
}
