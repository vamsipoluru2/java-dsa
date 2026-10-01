import java.util.Arrays;
import java.util.HashMap;

public class Twosum {
    public static void main(String[] args) {
         
    int[] nums = {2, 6, 5, 8, 11,3};
    int target = 14;

    int[] ans = twoSum(nums, target);

    System.out.println("BRuteIndices: " + ans[0] + ", " + ans[1]);

    int[] anss = twoSum(nums, target);

        System.out.println("BetterIndices: " + anss[0] + ", " + anss[1]);

    int[] ansss = twoSumopti(nums, target);

        System.out.println("OptiIndices: " + ansss[0] + ", " + ansss[1]);
    }


    static int[] twoSum(int[] nums,int target){
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int[] twoSumbetter(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {

            int remaining = target - nums[i];

            if(map.containsKey(remaining)) {
                return new int[]{map.get(remaining), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }

    static String twoSumopti(int[] nums, int target) {
    Arrays.sort(nums);
    int left = 0;
    int right = nums.length - 1;
    

    while(left < right) {

        int sum = nums[left] + nums[right];

        if(sum == target) {
            // return new int[]{left, right};//after sort array 
            return "yes";
        }
        else if(sum < target) {
            left++;
        }
        else {
            right--;
        }
    }

    // return new int[]{-1, -1};
    return "No";
}


    
}
