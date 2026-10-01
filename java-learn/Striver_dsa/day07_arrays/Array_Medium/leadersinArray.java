import java.util.ArrayList;

public class leadersinArray {
    public static void main(String[] args) {
        int[] nums ={10,22,12,3,0,6};
        System.out.println(LeaderBrute(nums,nums.length));
        System.out.println(LeaderOpti(nums,nums.length));


    }
    static ArrayList<Integer> LeaderBrute(int[] nums,int n){
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0;i<n;i++){
            boolean leader=true;
            for(int j=i+1;j<n;j++){
                if(nums[j]>nums[i]){
                    leader=false;
                    break;
                }
            }
            if(leader){
                ans.add(nums[i]);
            }
        }
        return ans;
    }
    static ArrayList<Integer> LeaderOpti(int[] nums,int n){
    ArrayList<Integer> ans = new ArrayList<>();
    int maxi=Integer.MIN_VALUE;
    for(int i=n-1;i>=0;i--){
        if(nums[i]>maxi){
            ans.add(nums[i]);
        }
        maxi=Math.max(maxi,nums[i]);
    }
    return ans;
    }

}
