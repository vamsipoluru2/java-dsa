// package day8 strings;

public class stringss {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(str);
        str="Hello";// didnot chaged object but created new object
        System.out.println(str);


        String a="Hello";
        String b="Hello";
        String c=a;
        System.out.println(c==a);
        System.out.println(a==b);   // true, because both are referring to same object

        String a1=new String("Hello");
        String b1=new String("Hello");// created out side of pool
        System.out.println(a1==b1); // false, because they are two different objects
        System.out.println(a1.equals(b1)); // true, because it is a method reference
        System.out.println(a1.charAt(0));
   
    }    

}
