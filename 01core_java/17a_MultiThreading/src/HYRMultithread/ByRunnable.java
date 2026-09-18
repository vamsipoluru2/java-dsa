package HYRMultithread;

// implementing by runnable way due to interface can implements multiple interfaces  
public class ByRunnable {
    public static void main(String[] args) {

        Employee e1 = new Employee();

        // Creating Thread object and giving it the Runnable object
        Thread t1 = new Thread(e1, "t1");

        // Starting the thread
        t1.start();

        Manager m1 = new Manager();

        // Creating another Thread object //why we have created thread agagin due to runnable dosent have any method only contains class methods 
        Thread t2 = new Thread(m1, "t2");

        // Starting the thread
        t2.start();


        //thread are killed after there excuation so the active count keep change every tume
        System.out.println("Active Threads Count:"+Thread.activeCount());

        //the threads can randomly perform the excutions

    }
} 


class Employee implements Runnable{// this is not thread class extend runnable  is an interface
     @Override //help to implement coorect func 
    public void run(){
        System.out.println("Hi"+Thread.currentThread().getName()+">>"+Thread.currentThread().getId());

    }

}

class Manager implements Runnable{//Thread is a class

    @Override //help to implement coorect func 
    public void run(){
        System.out.println("Hello"+Thread.currentThread().getName()+">>"+Thread.currentThread().getId());

    }

}
