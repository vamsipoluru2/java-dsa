// package day5_1 sortingkunal;
// https://leetcode.com/problems/set-mismatch/
import java.util.ArrayList;

public class setmissmatch {


    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        ArrayList<Integer> result = findDisappearedNumbers(arr);
        System.out.println(result);
    }

        static ArrayList<Integer> findDisappearedNumbers(int[] arr) {
            int i=0;
            while(i<arr.length){
                int correct = arr[i]-1;//vlue+1 for only 1-N range numbers
    
                if(arr[i]!=arr[correct]){
                    swap(arr,i,correct);
                }else{
                    i++;
                }
            }
            ArrayList<Integer> ans =new ArrayList<>();
            for(int index=0;index<arr.length;index++){
                if(arr[index]!=index+1){
                    ans.add(arr[index]);
                    ans.add(index+1);
                    
                   
                }
            }
            return ans;
    
        }
       
        static void swap(int[] arr,int start,int end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
    
        }
}

