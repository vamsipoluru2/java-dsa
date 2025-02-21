// Missing Number:Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
// Example 1:
// Input: nums = [3,0,1]
// Output: 2
// Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

public class missingnumber{
    public static void main(String[] args) {
        int[] nums = {3,0,1};//every index at its position     
        System.out.println(missingnumb(nums));
    }

    static int missingnumb(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct = arr[i];//vlue+1 for only 1-N range numbers

            if(arr[i]<arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }

        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index){
                // System.out.println("Missing number: "+index);
                return index;
            }
    
        }
        return arr.length;
    }
    static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

    }
}