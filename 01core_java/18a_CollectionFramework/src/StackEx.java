import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<>();//cant create stack with initial capacity or list of elements because stack is a class and it does not have any constructor which takes initial capacity or list of elements as argument  

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
}
