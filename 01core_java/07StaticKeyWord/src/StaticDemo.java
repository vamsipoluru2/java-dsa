public class StaticDemo {

    // Static variable: shared among all objects of this class
    static String companyName = "Manhatten";
    
    // Instance variable: unique for each object
    int empId;
    String empName;

    // Static block: executes once when the class is loaded
    static {
        System.out.println("Static block executed. Initializing static resources...");
        companyName = "Manhatten Corp";
    }

    // Constructor
    StaticDemo(int id, String name) {
        this.empId = id;
        this.empName = name;
        System.out.println("Constructor called for " + name);
    }

    // Instance method: can access both instance and static variables
    void showEmployeeDetails() {
        System.out.println("Employee: " + empName + ", ID: " + empId + ", Company: " + companyName);
    }

    // Static method: can access only static variables
    static void showCompany() {
        System.out.println("Company name: " + companyName);
        // System.out.println(empName); // ❌ Error: cannot access instance variable
    }

    // Static nested class
    static class Department {
        String deptName;

        Department(String deptName) {
            this.deptName = deptName;
        }

        void showDept() {
            System.out.println("Department: " + deptName + ", Company: " + companyName);
        }
    }

    @SuppressWarnings("static-access")
	public static void main(String[] args) {
        System.out.println("Access static variable directly: " + StaticDemo.companyName);

        // Call static method without creating object
        StaticDemo.showCompany();

        // Create instances of StaticDemo
        StaticDemo e1 = new StaticDemo(1001, "Vamsi");
        StaticDemo e2 = new StaticDemo(1002, "Mudit");

        e1.showEmployeeDetails();
        e2.showEmployeeDetails();

        // Change static variable through one object
        e1.companyName = "Manhatten Pvt Ltd";

        // Both objects reflect the change
        e1.showEmployeeDetails();
        e2.showEmployeeDetails();

        // Using static nested class
        StaticDemo.Department dept = new StaticDemo.Department("Java");//use of nested classes
        dept.showDept();

        // Access static variable through nested class
        System.out.println("Access from nested class: " + StaticDemo.Department.class);
    }
}
