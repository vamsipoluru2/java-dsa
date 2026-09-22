import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comp_commparablle {
    public static void main(String[] args) {

    Comparator<Integer> comp =new Comparator<Integer>() {
        public int compare(Integer x, Integer y) {
                  return (x < y) ? 1 : ((x == y) ? 0 : -1);
                }
            };

        Integer [] arr={2,3,4,7,1,5};
        Arrays.sort(arr,comp);//the comp has been passed to the sort method to sort the array in descending order
        System.out.println(Arrays.toString(arr));
        // this is printing in ascending order because the default sorting order is ascending
        List<Integer> list=new ArrayList<>(Arrays.asList(arr));
        Collections.sort(list);
        System.out.println(list);


        Comparator<Student> nameComparator =new Comparator<Student>() {
                @Override
                public int compare(Student s1, Student s2) {
                    return s1.name.compareTo(s2.name);
                }
            };

        Comparator<Student> marksComparator =new Comparator<Student>() {
                @Override
                public int compare(Student s1, Student s2) {
                    return Integer.compare(s1.marks, s2.marks);
                }
            };

        Student [] students={
            new Student(1,"John",90),
            new Student(3,"Alice",85),
            new Student(2 ,"Bob",95)
            // new Student(4,null,87)
        };

        //original logic is not changed the comparator is used to sort name you can alos sort the marks of the student by changing the logic in the compare method of the nameComparator
        System.out.println("this is using the nameComparator to sort the array based on the name of the student");
        Arrays.sort(students,nameComparator.reversed());//desc using reversedthe nameComparator has been passed to the sort method to sort the array based on the name of the student
        System.out.println(Arrays.toString(students));

        System.out.println("this is using the compareTo method to sort the array based on the roll number of the student");
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));




        List<Student> studentList = new ArrayList<>(Arrays.asList(students));//converts your array into a List.
        System.out.println("this is using the compareTo method to sort the list based on the roll number of the student");
        //rollno
        Collections.sort(studentList);
        System.out.println(studentList);

        //name
        System.out.println("this is using the nameComparator to sort the list based on the name of the student");
        Collections.sort(studentList,nameComparator);
        System.out.println(studentList);

        //marks
        System.out.println("this is using the marksComparator to sort the list based on the marks of the student");
        Collections.sort(studentList,marksComparator);
        System.out.println(studentList);


    }
}

class Student implements Comparable<Student>{
    int rollno;
    String name;
    int marks;

    public Student(int rollno,String name,int marks){
        this.rollno=rollno;
        this.name=name;
        this.marks=marks;
    }

    @Override
    public String toString() {
        return "[rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
    }

    @Override
    public int compareTo(Student anotherstudent) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
        //to compare the roll numbers students
        int x=this.rollno;
        int y=anotherstudent.rollno;

        //for comparing the marks of student
        // return this.name.compareTo(anotherstudent.name);
        // for desc
        // return anotherstudent.name.compareTo(this.name);

        return (x < y) ? -1 : ((x == y) ? 0 : 1);
        //or return Integer.compare(this.rollno, anotherstudent.rollno);

        //for comparting the name of student

    }


}
