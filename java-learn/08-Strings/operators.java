import java.util.ArrayList;
public class operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println(('a'+3));
        System.out.println((char)('a'+3));
        System.out.println("a"+3);//integer will convert into Integer that willcall toString()
        System.out.println("vamsi"+ new ArrayList<>());
        // System.out.println("vamsi"+new Integer(20));
        // System.out.println(new Integer(20)+ new ArrayList<>());//atleast  any one is string only works 
        // String ans=(new Integer(20)+""+new ArrayList<>());
        // System.out.println(ans);
        System.out.println("a"+'b');
    }
    
}
