

public class oddeven{
    public static void main(String[] args) {
        int n=67;
        System.out.println(isOdd(n)?"odd":"even");
    }

    private static boolean isOdd(int n) {
        return(n & 1)==1;//automatic computer is binary 
    }
    
}
  