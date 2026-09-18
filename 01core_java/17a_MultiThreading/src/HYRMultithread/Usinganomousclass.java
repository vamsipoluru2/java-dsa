package HYRMultithread;

//thisis 2 ways anonomousa nd lamda exp 

public class Usinganomousclass {
    public static void main(String[] args) throws Exception {

        // Employee task using anonymous class
        //to chcek threads are going excutuion same time or not using for loop 
        Runnable employee = ()-> 
        {
            for(int i=0;i<10;i++){
            System.out.println("Hilamda " +Thread.currentThread().getName() +" >> " + Thread.currentThread().getId());
            }
        };
     


        // Manager task using anonymous class
        Runnable manager = ()->
        {
            for(int i=0;i<10;i++){
            System.out.println("Hellolamda " +Thread.currentThread().getName() +" >> " + Thread.currentThread().getId());
            }
        };


        Thread t1 = new Thread(employee, "t1");
        Thread t2 = new Thread(manager, "t2");
        System.out.println(t1.getState());
        
        // //
        // t1.start();
        // t2.start();
        //you can oberve the threads going excution at same tmme so there is a mix
        // to make one thread run first and next after completing use join
        // t1.start();
        // t1.join();
        // t2.start();
        //to make thread to stop for sometime called sleep method 

        t1.start();
        System.out.println(t1.getState());
        t1.sleep(1000);//make 10 ms slleo
        t2.start();
 

        System.out.println(t1.getState());
        System.out.println(
            "Active Threads Count: " + Thread.activeCount()
        );
        t1.start();//this wont work due it ggot terminated so create new thread 
    }

    
}
