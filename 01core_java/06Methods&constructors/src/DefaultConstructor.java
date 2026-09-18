
class Student{
	int id;
	String name;
	void showStudentDetails() {
		System.out.println("Id "+id);
		System.out.println("name " +name);
	}
	
	Student(){
		id=10;
		name="vamsi";
		System.out.println("i am default constru ctor");
		
	}
	
	
	
	
	Student(int id,String name){
		this();// calling a defult constroctor
		this.id=id;//this is a key word restricted to the curre
		this.name=name;
		System.out.println("i am prametarized constctro");
		
	}
}
public class DefaultConstructor {

	public static void main(String[] args) {
		Student ob=new Student();
		ob.showStudentDetails();
		
		Student ob2=new Student(20,"mudit");
		ob2.showStudentDetails();
		
	}

}
