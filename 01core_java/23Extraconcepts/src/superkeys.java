interface parentInterface{
    String name="giri";//this is public static final

}

class GrandParentClass{
    String name="hari";
}

class parentclass extends GrandParentClass{
    String name="sai";
    int age=66;

    public parentclass(){
        System.out.println("default constructor form parent class");
    }

    public void printDetails(){
        System.out.println("printing from parent class");
        System.out.println(name+">>"+age);
        System.out.println(parentInterface.name);//to accces the interface variables due to its is public static final
    }
}

public class superkeys extends parentclass implements parentInterface{
    String name="kunal";

    public superkeys(){
        //java wrtes super();to call parent defualt construcotr internally so it excutes parent first and then child
        System.out.println("default constructor form child class");
    }
    public static void main(String[] args) {
         superkeys  cc=new superkeys();//its aa defult constructor
         cc.dummy();
         cc.printDetails();//to get from parent you cant create static here so in non static method create and call here 
    }

    public void dummy(){
        System.out.println(super.name);// if you wnat to access the immidate parent class variable use super key woard
        super.printDetails();
    }
    @Override 
    public void printDetails(){
        super.printDetails();//to acces parent mehtod for reusablebity and add extra stmsts  
        System.out.println("printing from child class");
        System.out.println(name+">>"+age);
    }
}
