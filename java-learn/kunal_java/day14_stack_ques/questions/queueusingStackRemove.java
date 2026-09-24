package day14_stack_ques.questions;

import java.util.Stack;
//effieient remove
public class queueusingStackRemove {
    public static void main(String[] args) throws Exception {
        queueusingStackRemove queue = new queueusingStackRemove();

        queue.add(1);
        queue.add(2);


        System.out.println("Front element: " + queue.peek()); // Output: 1
        System.out.println("Removed element: " + queue.remove()); // Output: 1
        queue.add(4);

        System.out.println("Front element after removal: " + queue.peek()); // Output: 2
        System.out.println("Is the queue empty? " + queue.isEmpty()); // Output: false

        queue.remove();
        queue.remove();
        System.out.println("Is the queue empty? " + queue.isEmpty()); // Output: true

    }

        private Stack<Integer> first;
        private Stack<Integer> Second;

        public queueusingStackRemove(){
            first=new Stack<>();
            Second=new Stack<>();
        }

    //reverse pushing
    //So if we want to add if empty (add directly ) if not add existing into the second stack
    // and now add in the first stack it makes reverse order entries
        public void add(int item) throws Exception{
            while (!first.isEmpty()){
                Second.push(first.pop());
            }
            first.push(item);
            while (!Second.isEmpty()){
                first.push(Second.pop());
            }
        }

        public int remove(){
           return first.pop();
        }

        public int peek() throws Exception{
            return first.peek();
        }
        public boolean isEmpty(){
            return first.isEmpty();
        }
}
