//this is example of a POJO class 
public class Employee{
    private int empId;//can be accessed only within the class and via getter and setter methods
    public String empName;
    protected double empSal;


    public Employee()    {
        System.out.println("Default Constructor");

    }
    public Employee(int empid){//using parameterized constructor to set the value of empId
        this.empId=empid;
    }

   public void setEmpId(int empId){
        this.empId=empId;
    }
    
    //in the main class we can set the value of empId using
    //  this method and access it using the getter method
    public int getEmpId(){
        return empId;
    }

}