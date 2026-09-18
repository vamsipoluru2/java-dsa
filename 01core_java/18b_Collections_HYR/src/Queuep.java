import java.util.*;

public class Queuep{
    public static void main(String[] args) {
        //priority queue
        Queue<Integer> queue = new PriorityQueue<>();

        //priority queue creates array interanlly with size 11 and it will grow as we add more elements to the queue
        //it stores values randomly and dosent follow sorrted order
        //head always point to highest priority 



        //adding elements to the queue
        queue.add(10);
        queue.add(20);
        queue.add(5);
        queue.offer(15);
        queue.add(25);
        queue.add(1);
        //retival of elements from the queue -peek
        System.out.println(queue.peek());
        //removal of elements from the queue -poll
        System.out.println(queue.poll());
        System.out.println(queue);

        System.out.println(queue.contains(10));

        // for (Integer integer : queue) {//it gives the order of queue creation not based on priority so use while
        //     System.out.println(integer);
        // }

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());//it prints based on priority    
        }
        

        //comparator for obj we created 

        //Arraydeque it is two sided queue 
        ArrayDeque<String> ad=new ArrayDeque<>();
        ad.add("banana");
        ad.addFirst("Cheery");
        ad.addLast("apple");
        ad.offer("pear");
        ad.offerFirst("kiwi");
        ad.offerLast("Mango");
        
        System.out.println(ad);

    System.out.println(ad.peek());
    System.out.println(ad.peekFirst());
    System.out.println(ad.peekLast());

    System.out.println(ad.poll());
    System.out.println(ad.pollFirst());
    System.out.println(ad.pollLast());
    }

    //queue is not syncronized
    // it is good at priority based op
}