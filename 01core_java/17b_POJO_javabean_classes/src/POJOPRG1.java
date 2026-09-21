public class POJOPRG1 {
    public static void main(String[] args) {
        Employee emp1=new Employee();//no args called and default constructor executed
        emp1.setEmpId(101);
        emp1.empName="John Doe";
        emp1.empSal=50000.0;


        System.out.println("Employee Id: "+emp1.getEmpId());
        System.out.println(emp1.empName);
        System.out.println(emp1.empSal);


        Employee emp2=new Employee(102);//parameterized constructor called and empId set to 102
        System.out.println("Employee Id: "+emp2.getEmpId());

        Employee e1=new Employee();
        e1.setEmpId(103);
        e1.empName="Jane Smith";
        e1.empSal=60000.0;

        Employee e2=new Employee();
        e2.setEmpId(104);
        e2.empName="Alice Johnson";
        e2.empSal=55000.0;

        Employee e3=new Employee();
        e3.setEmpId(105);
        e3.empName="Bob Brown";
        e3.empSal=45000.0;

        Employee[] employees=new Employee[] {e1,e2,e3};//creating an array of Employee objects
        System.out.println(employees);


        //java bean class exxample 
        Student s1=new Student(1,"Alice");//creating a Student object using parameterized constructor
        s1.setMarks(85.5);//setting marks using setter method duue to marks being private in Student class 
        System.out.println("Student Id: "+s1.getId());
        System.out.println("Student Name: "+s1.getName());  
        System.out.println("Student Marks: "+s1.getMarks());


    // assignment using array not by obj data 

     Employee[] employees2 = {
        new Employee(),
        new Employee(),
        new Employee()
    };

        employees2[0].setEmpId(103);
        employees2[0].empName = "Jane Smith";
        employees2[0].empSal = 60000.0;

        employees2[1].setEmpId(104);
        employees2[1].empName = "Alice Johnson";
        employees2[1].empSal = 55000.0;

        employees2[2].setEmpId(105);
        employees2[2].empName = "Bob Brown";
        employees2[2].empSal = 45000.0;

        for (Employee emp : employees2) {
            System.out.println("Employee Id: " + emp.getEmpId());
            System.out.println("Employee Name: " + emp.empName);
            System.out.println("Employee Salary: " + emp.empSal);
            System.out.println();
        }

    }
}
