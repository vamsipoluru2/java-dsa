package day14_stack_ques.basic;

public class CustomStack {
    protected  int[] data;
    private static final int DEFAULT_SIZE=10;

    int pointer=-1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
        this.data=new int[size];
    }

    public boolean push(int item){
        if(isFULL()){
            System.out.println("Stack is full");
            return false;
        }
        pointer++;
        data[pointer]=item;
        return true;
    }

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("cannot pop from an empty stack");
        }
        return data[pointer--];//this make the last one is to print first
    }

    public int peek()throws StackException{// it will help to display exception
        if(isEmpty()){
            throw new StackException("cannot peek from an empty stack");
        }
        return data[pointer];

    }

    public boolean isFULL(){
        return pointer==data.length-1;//pointer is at the last
    }

    public   boolean isEmpty(){
        return pointer==-1;//pointer is at last index
    }
}
