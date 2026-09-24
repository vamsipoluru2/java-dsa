package day14_stack_ques.questions;

import java.util.Stack;

public class queueUsingStack {

        private Stack<Integer> first;
        private Stack<Integer> Second;

        public queueUsingStack(){
            first=new Stack<>();
            Second=new Stack<>();
        }

        public void add(int item) {
            first.push(item);
        }

        public int remove(){
            while (!first.isEmpty()){// removing from the first and storing in the second and removing the top act like queue
                Second.push(first.pop());
            }

            int removed= Second.pop();

            //while removeing from second stack keep it in first back
            while (!Second.isEmpty()){
                first.push(Second.pop());
            }
            return removed;
        }
        public int peek() throws Exception{
            while (!first.isEmpty()){
                Second.push(first.pop());
            }

            int peeked= Second.pop();

            while (!Second.isEmpty()){
                first.push(Second.pop());
            }
            return peeked;
        }
        public boolean isEmpty() {
            return first.isEmpty();
        }
}
