abstract class Vechicle {
    abstract void start(); // abstract method

    void stop() { // concrete method
        System.out.println("This is a concrete method in an abstract class.");
    }


    
}

class car extends Vechicle{

void start(){
    System.out.println("This is the implementation of the abstract method in the car class.");
}
    
}

class bike  extends Vechicle{


    void start() {
        System.out.println("This is the implementation of the abstract method in the bike class.");
    }
    
}

public class Abstraction {
    public static void main(String[] args) {
        Vechicle c = new car();//via this implementation is hidded and only the abstract method is visible to the user
        

        c.start(); // calls the implementation in the car class
        c.stop();  // calls the concrete method in the abstract class

        bike b = new bike();
        b.start(); // calls the implementation in the bike class
        b.stop();  // calls the concrete method in the abstract class
    }
}

