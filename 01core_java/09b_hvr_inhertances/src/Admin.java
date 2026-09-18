 
public class Admin extends Devloper {
    public void execute() {
        super.read();//this will check in devloper class if not found it will check in parent class and execute the code
        //read();//this will check in admin class if not found it will check in parent class and execute the code
        write();
        System.out.println("Execute code");
    }
    public void  read() {
        System.out.println("Admin  read code");
    }
}
 