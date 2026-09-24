public class reverseannummber {
    static int sum = 0;


    static void rev(int n){  ///way1 
        if(n==0){
            return;
        }
        int lastDigit = n%10;
        sum = sum*10 + lastDigit;
        rev(n/10);

    }

    static int rev2(int n){      //way2
          int digits =(int)(Math.log10(n))+1;//This is used to count the number of digits in the number n.
          return helper(n, digits);//
    }

    private static int helper(int n, int digits){
        if(n%10 == 0){
            return n;
        }
        int rem = n%10;
        return rem *(int)(Math.pow(10,digits-1))+helper(n/10,digits-1);//to bring the last digit first we multoply it with digts-1 thousabad

    }

    public static void main(String[] args) {
        rev(1234);
        System.out.println(sum);
        System.out.println(rev2(123456));
    
      
    }
}
