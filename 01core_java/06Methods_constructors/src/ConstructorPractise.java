public class ConstructorPractise {

    int i;

    public static void main(String[] args) {

        ConstructorPractise ob = new ConstructorPractise();

        System.out.println("hello world");

        System.out.println(ob.i);

        ConstructorPractise ob2 = new ConstructorPractise(30);
        // when we are creating the object then the constructor is called
        // initially value of i is 0 by default
        // but inside constructor we are assigning value to i
        // so it prints updated value

        System.out.println(ob2.i);
    }

    public ConstructorPractise() {

        // when memory is allocated for object
        // default value of int is 0
        // then constructor executes and changes value

        i = 20;

        System.out.println("i am an explicit constructor");
    }

    public ConstructorPractise(int a) {

        i = a;

        System.out.println("i am a parameterized constructor");
    }
}