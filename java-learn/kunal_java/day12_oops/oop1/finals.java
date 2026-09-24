package day12_oops.oop1;

class Car {
    String color;

    Car(String color) {
        this.color = color;
    }

    void showColor() {
        System.out.println("Car color: " + color);
    }
}

public class finals {
    public static void main(String[] args) {
        final Car myCar = new Car("Red");

        myCar.showColor(); // 👉 Car color: Red

        // ✅ Modifying internal value (allowed)
        myCar.color = "Blue";
        myCar.showColor(); // 👉 Car color: Blue

        // ❌ Trying to reassign (uncomment to see error)
        // myCar = new Car("Green"); // ❌ Compile-time error

        System.out.println("Final keyword test complete.");
    }
}

//final Car myCar = new Car("Red");
//A new Car object is created in memory.
//The color field is set to "Red".
//The myCar reference permanently points to this object.
//
//        myCar.color = "Blue";

//We are changing the value inside the object that myCar points to.
//color was "Red", now it's "Blue".
//We are not changing myCar, just what’s inside the object it points to.

