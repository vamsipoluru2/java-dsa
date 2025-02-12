// package day4 searching;

public class searchinrange {

        public static void main(String[] args) {
            int[] arr= {1,2,3,4,5,6,7,8,9,10,11,12};
            int target=5;
            int start=2;
            int end=5;
            System.out.println(search(arr, target,start,end));
    
        }
        static int search(int[] arr,int target,int start,int end){
            if (arr.length==0){
                return -1;
            }
    
            for(int i=start;i<end;i++){
                if(arr[i]==target){
                    return i;
                }
    
               
         }
         return -1;
    }
    

}
