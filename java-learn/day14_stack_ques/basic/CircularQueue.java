package day14_stack_ques.basic;


public class CircularQueue {

    protected int[] data;

    private static final int DEFAULT_SIZE=10;

    protected int end=0;
    protected int front=0;
    private int size=0;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size){
        this.data=new int[size];
    }
    public boolean isFULL(){
        return end==data.length;//ptr is at the last
    }

    public   boolean isEmpty(){
        return size==0;//ptr is at last index
    }


    public boolean insert(int item){
        if(isFULL()){
            return false;
        }
        data[end++] =item;//post increment first assign then increment
        end=end%data.length;//it will help to insert the data after removing an element
        size++;
        return true;
    }


    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("queue is empty");
        }

        int removed = data[front++];//if front incresed by 1 the data is removed
        front = front % data.length;
        size--;
        return removed;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("queue is empty");
        }
        return data[front];
    }

    //display is from front till end
    public void display(){
        if(isEmpty()){
            System.out.println("empty");
            return;
        }
       int i=front;
       do{
           System.out.print(data[i]+"->");
           i++;
           i%=data.length;// when i start from 3 when it reches end and
           // it has to go back in order to do that we are taking rem
       }while (i!=end);
        System.out.println("End");
    }
}
