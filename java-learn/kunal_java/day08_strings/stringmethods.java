import java.util.Arrays;
public class stringmethods {
    public static void main(String[] args) {
        String name = "Hello World!";
        System.out.println(Arrays.toString(name.toCharArray()));//[H, e, l, l, o,  , W, o, r, l, d, !]
        System.out.println(name.toLowerCase());//hello world!
        System.out.println(name.substring(0, 5)); // Output: Hello
        System.out.println(name.toUpperCase());//HELLO WORLD!
        System.out.println(name.replace("World", "Universe")); // Output: Hello, Universe!
        System.out.println(name.indexOf('W')); // Output: 6
        System.out.println(name.lastIndexOf("World")); // Output: 6 starting index of the last occurrence
        
        System.out.println("   vamsi  ".strip()); // Output: [Hello, World!]em.out.println(name);// white spaces are removed it was not changoing the orininal name
        System.out.println(Arrays.toString(name.split(" "))); // Output: [Hello, World!] where ever is space split it
    
    }
    
}
