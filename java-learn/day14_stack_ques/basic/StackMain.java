package day14_stack_ques.basic;

public class StackMain {
    public static void main(String[] args) throws StackException {
        //if stack exception is used in the class it also throws  in the main class
        CustomStack stack1=new CustomStack(5);//if you add more than elemnts that you have decelred it throws exception
        DynamicStack stack=new DynamicStack(5);//it will not throw exception if you add more than elemnets decelered
//        CustomStack stack=new DynamicStack(5);//opp explaained

        stack.push(34);
        stack.push(45);
        stack.push(2);
        stack.push(9);
        stack.push(18);
        stack.push(23);


        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
