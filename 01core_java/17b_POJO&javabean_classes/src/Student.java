//this is example of a java bean class  

import java.io.Serializable;

public class Student implements Serializable {
    private int id;
    private String name;
    private double marks;

    public Student() {
        // Default constructor created due to the presence of parameterized constructor,
        //  if we remove the parameterized constructor then this default constructor 
        // will be created by the compiler and we can create objects using it without any issues
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

   

}
