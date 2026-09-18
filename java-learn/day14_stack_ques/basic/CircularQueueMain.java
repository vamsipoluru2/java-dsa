package day14_stack_ques.basic;

public class CircularQueueMain {
    public static void main(String[] args) throws Exception{
//        CircularQueue queue1e= new CircularQueue(5);
        dynamicQueue queue=new dynamicQueue(5);
        queue.insert(3);
        queue.insert(6);
        queue.insert(5);
        queue.insert(9);
        queue.insert(13);

        queue.display();
        System.out.println(queue.remove());
        queue.insert(43);
        queue.display();
    }
}
