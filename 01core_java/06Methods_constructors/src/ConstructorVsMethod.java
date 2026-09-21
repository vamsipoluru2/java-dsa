
public class ConstructorVsMethod {

    public static void main(String[] args) {

        // =========================
        // CONSTRUCTOR
        // =========================

        // Constructor is automatically called when object is created
        Employee e1 = new Employee("Vamsi", 22);

        System.out.println("Employee created");


        // =========================
        // METHODS
        // =========================

        // Method must be called explicitly
        e1.displayDetails();

        e1.setAge(23);

        System.out.println("After changing age:");

        e1.displayDetails();

        System.out.println("Age returned by method: " + e1.getAge());
    }
}


// ==================================================
// EMPLOYEE CLASS
// ==================================================

class Employee {

    // Instance variables
    String name;
    int age;


    // ==================================================
    // CONSTRUCTOR
    // ==================================================

    Employee(String name, int age) {

        System.out.println("Constructor is called");

        this.name = name;
        this.age = age;
    }


    // ==================================================
    // METHOD 1 - display
    // ==================================================

    void displayDetails() {

        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }


    // ==================================================
    // METHOD 2 - setter
    // ==================================================

    void setAge(int age) {

        this.age = age;
    }


    // ==================================================
    // METHOD 3 - getter
    // ==================================================

    int getAge() {

        return this.age;
    }
}