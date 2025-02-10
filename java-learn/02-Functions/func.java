import java.lang.invoke.StringConcatFactory;
import java.util.Scanner;

public class func {
    public static void main(String[] args) {
     int sum1 =0;//with out parameters and argumnets
     sum1=addnumbers1();
     System.out.println("sum of the numbers is: "+sum1);
    
    int sum =0;//with  parameters and argumnets
    sum=addnumbers(5,6);
    System.out.println("sum of the numbers is: "+sum);

    String a=greet();
    System.out.println(a);


    Scanner in =new Scanner(System.in);
    System.out.print("enter your name");
    String name=in.next();
    String personalized =myGreet(name);
    System.out.println(personalized);
    }

    static String myGreet(String name) {
        String message="hello"+" "+name;
        return message;

    }

    static int addnumbers1(){
    int sum=5+5;
     return sum;}

    static String greet(){
        String message="welcome";
        return message;
    }
    static int addnumbers(int x,int y){
        return x+y;

}


    
}
