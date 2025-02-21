// package day5_1 sortingkunal;

public class findduplicates {
    public static void main(String[] args) {
        int[] nums = {1,3,3,4,2};//every index at its position     
        System.out.println(findduplicatenumarray(nums));
    }

    static int findduplicatenumarray(int[] arr){
        int i=0;
        while(i<arr.length){
            if(arr[i]!=i+1){
            int correct = arr[i]-1;//vlue+1 for only 1-N range numbers

            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                return arr[i];
            }
        }else{
            i++;
        }
        
    }
    return -1;
}

                static void swap(int[] arr,int start,int end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
        
            }
    
}
