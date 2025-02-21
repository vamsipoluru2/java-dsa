// package day5_1 sortingkunal;
// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/submissions/1487050390/
//google question
import java.util.ArrayList;

public class findallduplicateinanarrayy {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        ArrayList<Integer> result = findallduplicateinanarray(arr);
        System.out.println(result);
    }

        static ArrayList<Integer> findallduplicateinanarray(int[] arr) {
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
    
