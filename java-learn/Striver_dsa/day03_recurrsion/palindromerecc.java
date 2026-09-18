package Striver_dsa.day03_recurrsion;

public class palindromerecc { 
    public static void main(String[] args) {
        String S = "MadaM";
        System.out.println(ispalindrome(S,0));
    }

    static boolean ispalindrome(String S,int start){

        if(start>=S.length()/2){
            return true;
        }
      if (S.charAt(start) != S.charAt(S.length() - start - 1)) {
            return false;
        }
        return ispalindrome(S,start+1);
    }
    
}
