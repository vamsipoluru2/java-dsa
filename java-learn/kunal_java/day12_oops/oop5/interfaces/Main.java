package day12_oops.oop5.interfaces;

public class Main {
    public static void main(String[] args) {
        car car=new car();
        car.acc();
        car.start();
        car.stop();
        System.out.println();

        Media carmedia=new car();
        carmedia.stop();// here there is problem we are not getting what we require we are getting custom
        // so we are creating seperate classes for the interfaces
        System.out.println();

        brake car3=new car();
        car3.start();

        System.out.println("hi");
        
         NiceCar car1=new NiceCar();
         car1.start();//power engine starts
         car1.startMusic();
         car1.acc();
         car1.upgradeEngine();//to change the engine
         car1.start();//electric engine starts
         car1.stop();
         car1.acc();
    }

}
