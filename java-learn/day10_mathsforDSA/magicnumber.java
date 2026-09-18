//amazon
public class magicnumber {
    public static void main(String[] args) {
        int n=6;
        int ans=0;
        int  b=5;
        int num=544541;
        
        while(n>0){
            int last=n&1;
            n=n>>1;
            ans+=last* b;
             b= b*5;
        }
        System.out.println(ans);

        
        int base=10;//for counting numbers
        int a=digits(num,base);
        System.out.println(a);
    }
    static int digits(int n, int  base){
        int ans=(int)(Math.log(n)/Math.log( base)+1);
        return ans;
    }
    
}
