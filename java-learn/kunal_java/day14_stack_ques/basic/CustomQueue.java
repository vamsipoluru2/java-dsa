package day14_stack_ques.basic;

public class CustomQueue {
    private int[] data;

    private static final int DEFAULT_SIZE=10;

    int end=0;//end is pointer

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size){
        this.data=new int[size];
    }

    public boolean isFULL(){
        return end==data.length;//ptr is at the last
    }

    public   boolean isEmpty(){
        return end==0;//ptr is at last index
    }

    public boolean insert(int item){
        if(isFULL()){
            return false;
        }
        data[end++] =item;//post increment first assign then increment
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("queue is empty");

        }
        int removed=data[0];

        //shift the element to left
//        from index 1 we are sifiting
        for(int i=1;i<end;i++){
            data[i-1]=data[i];//changing the position

        }
        end--;
        return removed;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("queue is empty");
        }
        return data[0];
    }

    //display
    public void display(){
        for(int i=0;i<end;i++){
            System.out.print(data[i]+" <-");
        }
        System.out.println("End");
    }
}
