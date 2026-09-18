interface Vehicle {

    // abstract method
    void start();

    // default method
    default void stop() {

        System.out.println("Vehicle stopped");
    }
    static void honk() {

        System.out.println("Vehicle honking");
    }
}

class Car implements Vehicle {

    public void start() {

        System.out.println("Car started");
    }
}

public class interface_hvr{

    public static void main(String[] args) {

        Car c = new Car();
        c.start();

        Vehicle v = new Car();
        v.start();// abstract method called using interface reference
        //car started printed 
        
        // inherited default method
        c.stop();// default method called using object
        Vehicle.honk();// static method called using interface name
    }
}