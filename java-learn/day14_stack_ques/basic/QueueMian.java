package day14_stack_ques.basic;

public class QueueMian {
    public static void main(String[] args) throws Exception {
        CustomQueue queue=new CustomQueue(5);

        queue.insert(3);
        queue.insert(6);
        queue.insert(5);
        queue.insert(9);
        queue.insert(13);
        queue.display();
        System.out.println(queue.remove());
        queue.display();



    }
}
