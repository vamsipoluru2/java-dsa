 abstract class Student{
	abstract void getStudentDetails(); // they can't be instansiated only can use in child class then you can use it 
	void show() {
		System.out.println("i am from abstract class of concret method ");
	}
}

class MyStudent extends Student{

	@Override
	void getStudentDetails() {
		System.out.println("hi i am from abstract method but implemented in child class");
	}
	
}

public class Abstractclass {
	public static void main(String[] args) {
	
		   // Create object of child class
        MyStudent obj = new MyStudent();

        // Call methods
        obj.getStudentDetails(); // implemented method
        obj.show();              // concrete method from abstract class
	}

}
