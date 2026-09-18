package day12_oops.oop6.compare;

// implement compareable keyword
public class Student implements Comparable<Student>{//implements is a keyword in Java used when a class wants to provide code for an interface.
    int rollno;
    float marks;
    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return marks+" ";
    }

    @Override
    public int compareTo(Student o) {//it required to spcific one
        int diff=(int)(this.marks-o.marks);//if you want o compare with marks
//        if diff==0 both are equals()
//        if diff<0 means o is bigger
        return diff;
    }
}
