import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<>();

		stack.push(10);
        stack.push(20);//all are appending so capacity is default 
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(10);
        stack.push(20);//all are appending so capacity is default 
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(10);
        stack.push(20);//all are appending so capacity is default 
        stack.push(30);
        stack.push(40);
        stack.push(50);
        
        
        
        

        System.out.println( stack);

        System.out.println(stack.peek());

        System.out.println(stack.pop());
        
        System.out.println(stack);

        System.out.println( stack.search(20));

        System.out.println(stack.empty());

        System.out.println(stack.size());
        System.out.println(stack.capacity());
	}

    //stack is good at insertion and deletion because it follows LIFO principle and it can access the element directly using index but bad at searching and accessing elements
    //  because it is not stored in contiguous memory locations and it has to traverse the stack to find the element

    //is stack syncronized? yes stack is synchronized because it is a legacy class and it is thread safe but it is not recommended to use stack in multithreaded environment 
    // because it has some performance issues due to synchronization
}