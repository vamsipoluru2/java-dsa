// package day4 searching;

public class linerarseearch {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,8};
        int target=9;
        System.out.println(search(arr, target));

    }

    static boolean search3(int[] arr,int target){
        if (arr.length==0){
            return false;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return true;
            }

           
     }
     return false;
}
     static int search(int[] arr,int target){
        if (arr.length==0){
            return -1;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }

           
     }
     return -1;
}

static int search2(int[] arr,int target){
    if (arr.length==0){
        return -1;
    }

    for (int element : arr) {//enchance for loop
            if(element==target){
                return target;
            }
    
           
     }
 return -1;
}
}
