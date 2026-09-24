import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodRef {

    public static void main(String[] args) {

        List<String> name = Arrays.asList(
                "vamsi",
                "kunal",
                "sai"
        );

        // Lambda expression
        name.forEach(names -> greet(names));

        // Method reference static method reference
        name.forEach(MethodRef::greet);
        // Method reference non static method reference
        MethodRef methodRef = new MethodRef();
        name.forEach(methodRef::greetNonStatic);
        // or
        name.forEach(new MethodRef()::greetNonStatic);
        // Method reference to sort names
                System.out.println("\n");

        Collections.sort(name, String::compareToIgnoreCase);///s1,s2 compare s1 is string s2 is compareToIgnoreCase is method reference to compareToIgnoreCase method of String class
        name.forEach(System.out::println);

        //calling constructor using method reference
        name.forEach(student::new);
    }

    public static void greet(String name) {
        System.out.println("Hello " + name);
    }

    //for non static method reference we have to create an object of the class and then call the method reference
    public void greetNonStatic(String name) {
        System.out.println("Hello " + name);
    }

    //sort names using method reference
    public static void sortNames(List<String> names) {
        names.sort(String::compareToIgnoreCase);
    }

}

class student{
    String name;

    //constructor
    public student(String name){
        this.name=name;
        System.out.println("Student name is: "+name);
    }
}