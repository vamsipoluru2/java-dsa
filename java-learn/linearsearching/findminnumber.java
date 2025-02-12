// package day4 searching;

public class findminnumber {
    public static void main(String[] args) {
        int[] arr= {5,2,4,-1,-2,9};
        int min=arr[0];
        System.out.println(minimum(arr, min));

    }
    static int minimum(int[] arr,int min){
        if (arr.length==0){
            return -1;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }


           
     }
     return min;
}

    
}
