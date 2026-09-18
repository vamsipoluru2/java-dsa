

public class MyFirstJavaProject {
		
		static int b=1000;
		
		public static void main(String[] args) {
			System.out.println("Welcome to Manhatten");
			int id=1001;
			System.out.println(id);
			employee e1=new employee();
			System.out.println(e1.empId);//defult is zero
			e1.empId=1001;
			e1.name="raju";
			employee e2=new employee();
			e2.empId=1002;
			e2.name="vamsi";
			
			
			System.out.println(e1.empId+"-> "+e1.name);	
			System.out.println(e2.empId+"->  "+e2.name);	
			
			//using class name bcs it is static
			System.out.println(b+"-> "+employee2.name2);
			
			employee.companyName="manhatten";
			// System.out.println(e1.empId+"->"+e1.name+"-> "+e1.companyName);
			
			System.out.println(b);

			System.out.println(employee2.emp1);
			
		}

		 static class employee2{
			static int emp1=1000;
			static String name2="vamsi4";
		}
		
	}
		 

		class employee {
			 int empId;
			String name;
			static String companyName;
		}
	
