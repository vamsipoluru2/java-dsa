public class lineaserach {
    
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int target=3;
        System.out.println(linearsearch(arr,target));
    }
    static int linearsearch(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
                return i;
        }
        return -1;
    }
}
