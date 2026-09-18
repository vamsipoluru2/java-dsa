class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
}

// Car is a Vehicle → "is-a" relationship
class Car1 extends Vehicle {
    void openTrunk() {
        System.out.println("Trunk opened");
    }
}

public class IsAReleationShip {
    public static void main(String[] args) {
        Car1 c = new Car1();
        c.start();      // inherited method
        c.openTrunk();  // Car's own method
    }
}
