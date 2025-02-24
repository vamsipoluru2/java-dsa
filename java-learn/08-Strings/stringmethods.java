import java.util.Arrays;
public class stringmethods {
    public static void main(String[] args) {
        String name = "Hello World!";
        System.out.println(Arrays.toString(name.toCharArray())); // Output: 13
        System.out.println(name.toLowerCase());
        System.out.println(name.substring(0, 5)); // Output: Hello
        System.out.println(name.toUpperCase());
        System.out.println(name.replace("World", "Universe")); // Output: Hello, Universe!
        System.out.println(name.indexOf('W')); // Output: 7
        System.out.println(name.lastIndexOf("World")); // Output: 12
        
    System.out.println("   vamsi  ".strip()); // Output: [Hello, World!]em.out.println(name);// it was not changoing the orininal name
        System.out.println(Arrays.toString(name.split(" "))); // Output: [Hello, World!]
    
    }
    
}
