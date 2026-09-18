import java.util.Arrays;   // top of file

public class leftrotatearray {
    public static void main(String[] args) {
                int[] arr = {1,2,3,4,5};
                System.out.println(Arrays.toString(leftrot(arr)));
    }

    static int[] leftrot(int[] arr){
        int temp=arr[0];
        int i=1;
        while(i<arr.length){
            arr[i-1]=arr[i];
            i++;
        }
        arr[arr.length-1]=temp;
        
        return arr;

    }
}
