public class factorial {
    public static void main(String[] args) {
        int ans=fact(5);
        System.out.println(ans);
        int sum=sumofnum(5);
        System.out.println(sum);
        
    }

    static int fact(int n){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    } 

    static int sumofnum(int n){
        if(n==1){
            return 1;
        }
        return n+sumofnum(n-1);
    } 
    
    
}
