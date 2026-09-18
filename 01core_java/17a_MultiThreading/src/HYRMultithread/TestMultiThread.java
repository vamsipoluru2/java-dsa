package HYRMultithread;

//Thread ceation and implanmenting by extanding thread way thre are 
public class TestMultiThread {

    // Java creates a thread for the main method.
    // This thread is called the main thread.
    //
    // The main thread is a user thread.
    // When we run the program, the main thread is created
    // and it executes the main() method.
    //
    // After executing main(), the main thread finishes.

    public static void main(String[] args) {

        System.out.println("Main thread started");

        //basics
        System.out.println(Thread.activeCount());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getPriority());//ranges from 0 to 10, default is 5

        System.out.println("Main thread ended");


        // Thread Creation and execution
        Thread t1=new Thread();
        t1.start(); //thread starts running
        Thread t2=new Thread();
        t2.start(); //thread starts running
        Thread t3=new Thread();
        t3.start(); //thread starts running
        
        Thread t4=new Thread();
        t4.start(); //thread starts running


        EmployeeThread e1=new EmployeeThread("T1");//we can give name two thread by calling a super class
        e1.start();//we should  create instance of thread bcs our code is in employee class which is below and run method is ovrided 
        //thread runs sun method inside it to runn we use start method so we need to extend the class and put my code

        //here we are using thread to excute so excution might be the diff oorder than normal class obj excution
        ManagerThread m1=new ManagerThread();
        m1.start();


        //thread are killed after there excuation so the active count keep change every tume
        System.out.println("Active Threads Count:"+Thread.activeCount());

        //the threads can randomly perform the excutions

    }
} 


class EmployeeThread extends Thread{//Thread is a class

    //there is method in Thread this one so we have extended so we can overide
    //     public Thread(String name) {
    //     this(null, null, name, 0);
    // }
    public EmployeeThread(String tname){
        super(tname);

    }
    @Override //help to implement coorect func 
    public void run(){
        //to print thread name id
            System.out.println("Hello "+Thread.currentThread().getName()+">>"+Thread.currentThread().getId());
    }

}


class ManagerThread extends Thread{//Thread is a class

    @Override //help to implement coorect func 
    public void run(){
        System.out.println("Hi"+Thread.currentThread().getName()+">>"+Thread.currentThread().getId());

    }

}