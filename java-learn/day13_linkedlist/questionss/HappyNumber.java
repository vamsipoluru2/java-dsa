package day13_linkedlist.questionss;
//https://leetcode.com/problems/happy-number/submissions/1540728448/
public class HappyNumber {
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        do{//due to fast and slow are  staring at same point
            slow=findsqr(slow);
            fast=findsqr(findsqr(fast));// mmoving two steps ahead
            //at last if 1 comes 1^2 always 1 so fast remainsame and
            // slow comes near 1 slowys but it comes then true

        }while (fast != slow);
        if(slow==1){
            return true;
        }return false;
    }
    private int findsqr(int number){
        int ans=0;
        while(number>0){
            int rem=number%10;
            ans+=rem*rem;
            number /=10;
        }
        return ans;
    }

    public static void main(String[] args) {
        HappyNumber hn = new HappyNumber();

        // Another Happy Number (19)
        int num3 = 19;
        boolean isHappy3 = hn.isHappy(num3);
        System.out.println(num3 + " is a happy number: " + isHappy3); // Output: true


        // Not happy number test case (4)
        int num2 = 12;
        boolean isHappy2 = hn.isHappy(num2);
        System.out.println(num2 + " is a happy number: " + isHappy2); // Output: false
    }
}
