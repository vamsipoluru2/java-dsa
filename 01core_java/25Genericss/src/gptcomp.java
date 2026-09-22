import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class gptcomp {

    public static void main(String[] args) {

        // =================================================
        // INTEGER COMPARATOR
        // =================================================

        Comparator<Integer> comp = (x, y) -> (x < y) ? 1 : ((x == y) ? 0 : -1);

        Integer[] arr = {2, 3, 4, 7, 1, 5};

        Arrays.sort(arr, comp);

        System.out.println("Integer array - descending:");
        System.out.println(Arrays.toString(arr));


        List<Integer> list = new ArrayList<>(Arrays.asList(arr));

        Collections.sort(list);

        System.out.println("Integer list - ascending:");
        System.out.println(list);


        // =================================================
        // COMPARATORS FOR STUDENT
        // =================================================

        // Roll number
        Comparator<Student> rollComparator = (s1, s2) -> Integer.compare(s1.rollno, s2.rollno);


        // Name
        // null comes first
        Comparator<Student> nameComparator = Comparator.comparing(s -> s.name, Comparator.nullsFirst(Comparator.naturalOrder()));


        // Marks
        Comparator<Student> marksComparator = (s1, s2) -> Integer.compare(s1.marks, s2.marks);


        // Extra-curricular marks
        Comparator<Student> extraCirMarksComparator = (s1, s2) -> Integer.compare(s1.extraCirMarks, s2.extraCirMarks);


        // =================================================
        // STUDENTS
        // =================================================

        Student[] students = {

                new Student(1, "John", 90, 5),

                new Student(3, "Alice", 85, 8),

                new Student(2, "Bob", 90, 7),

                new Student(4, null, 87, 6)
        };


        // =================================================
        // ARRAY SORT - NAME
        // =================================================

        System.out.println(
                "\nStudents sorted by name - ASCENDING:"
        );

        Arrays.sort(students, nameComparator);

        System.out.println(
                Arrays.toString(students)
        );


        // =================================================
        // ARRAY SORT - NAME DESCENDING
        // =================================================

        System.out.println(
                "\nStudents sorted by name - DESCENDING:"
        );

        Arrays.sort(students, nameComparator.reversed());

        System.out.println(
                Arrays.toString(students)
        );


        // =================================================
        // ARRAY SORT - ROLL NUMBER
        // =================================================

        System.out.println(
                "\nStudents sorted by roll number:"
        );

        Arrays.sort(students, rollComparator);

        System.out.println(
                Arrays.toString(students)
        );


        // =================================================
        // ARRAY SORT - COMPARABLE
        // =================================================

        System.out.println(
                "\nStudents sorted using Comparable:"
        );

        Arrays.sort(students);

        System.out.println(
                Arrays.toString(students)
        );


        // =================================================
        // ARRAY → LIST
        // =================================================

        List<Student> studentList =
                new ArrayList<>(Arrays.asList(students));


        // =================================================
        // LIST SORT - ROLL
        // =================================================

        System.out.println(
                "\nList sorted by roll number:"
        );

        Collections.sort(studentList, rollComparator);

        System.out.println(studentList);


        // =================================================
        // LIST SORT - NAME
        // =================================================

        System.out.println(
                "\nList sorted by name:"
        );

        Collections.sort(studentList, nameComparator);

        System.out.println(studentList);


        // =================================================
        // LIST SORT - MARKS
        // =================================================

        System.out.println(
                "\nList sorted by marks:"
        );

        Collections.sort(studentList, marksComparator);

        System.out.println(studentList);


        // =================================================
        // LIST SORT - MARKS + EXTRA CIR MARKS + ROLL
        // =================================================

        System.out.println(
                "\nList sorted by marks + extraCirMarks + roll:"
        );

        Collections.sort(
                studentList,
                marksComparator
                        .thenComparing(extraCirMarksComparator)
                        .thenComparing(rollComparator)
        );

        System.out.println(studentList);
    }
}


// =========================================================
// STUDENT CLASS
// =========================================================

class Student implements Comparable<Student> {

    // Instance variables

    int rollno;
    String name;
    int marks;
    int extraCirMarks;


    // Constructor

    public Student(
            int rollno,
            String name,
            int marks,
            int extraCirMarks
    ) {

        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
        this.extraCirMarks = extraCirMarks;
    }


    // =====================================================
    // toString()
    // =====================================================

    @Override
    public String toString() {

        return "[rollno=" + rollno
                + ", name=" + name
                + ", marks=" + marks
                + ", extraCirMarks=" + extraCirMarks
                + "]";
    }


    // =====================================================
    // COMPARABLE
    // =====================================================

    // Natural ordering = roll number

    @Override
    public int compareTo(Student anotherstudent) {

        return Integer.compare(
                this.rollno,
                anotherstudent.rollno
        );
    }
}