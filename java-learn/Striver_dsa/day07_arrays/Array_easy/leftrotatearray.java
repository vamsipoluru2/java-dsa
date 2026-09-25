import java.util.Arrays;   // top of file

public class leftrotatearray {
    public static void main(String[] args) {
                int[] arr = {1,2,3,4,5};
                System.out.println(Arrays.toString(leftrot(arr,arr.length)));
                int[] arr1 = {1,2,3,4,5};
                System.out.println(Arrays.toString(leftrotK(arr1,arr1.length,2)));
                reverse(arr1,0,arr1.length-1);
                
    }

    static int[] leftrot(int[] arr,int n){
        int temp=arr[0];
        int i=1;
        while(i<n){
            arr[i-1]=arr[i];
            i++;
        }
        arr[n-1]=temp;
        
        return arr;

    }

    static int[] leftrotK(int[] arr,int n,int k){
        k=k%n;

        //stroing the fisrt k ele in temop
        int temp[]=new int[k];
        for(int i=0;i<k;i++){
            temp[i]=arr[i];
        }

        //shifting the rest to frony
        for(int i=k;i<n;i++){
            arr[i-k]=arr[i];
        }
        //copying the temp to the end
        for(int i=n-k;i<n;i++){
            arr[i]=temp[i-(n-k)];
        }
        return arr;        
    }

    //optimal solution

}
