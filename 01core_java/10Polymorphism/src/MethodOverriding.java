// run time polymorphism
//Same name + same parameter list + different class (inheritance) →
//✅ Method overriding.
class Students{
	int regNo;
	String name;
	
	
	public Students(int regNo, String name) {
		this.regNo=regNo;
		this.name=name;
		// TODO Auto-generated constructor stub
	}


	void show() {
		System.out.println("Reg No:" + regNo);
		System.out.println("Name:" + name);
	}
}
 

class StudentRegistration extends Students{
	String emailId;
	String mobileNo;

	public StudentRegistration(int regNo,String name,String emailId,String mobileNo) {
		super(regNo,name);
		this.emailId=emailId;
		this.mobileNo=mobileNo;

	}
	
	void show() {
		System.out.println("Reg No:" + regNo);
		System.out.println("Name:" + name);
		System.out.println("Email:" + emailId);
		System.out.println("Mobile Number :" + mobileNo);
	}
}
	
public class MethodOverriding {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentRegistration ch = new StudentRegistration(21130,"vasmi","vasmipoluru2@gmial.com","9573639355");
		ch.show();
	}
 
}

