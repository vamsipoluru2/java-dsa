class Student{
	private int rollno;
	private int age;
	private String name;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class Encapsulation {
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setRollno(01);
		s1.setName("vamsi");
		s1.setAge(21);
		//s1.rollno can't access due to it is private
		
		System.out.println("roll no "+s1.getRollno());
		System.out.println("name "+s1.getName());
		System.out.println("age"+s1.getAge());
		
	}

}
