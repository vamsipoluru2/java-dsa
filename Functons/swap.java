import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int a=10;
        int b=22;

        int[] arr = {1, 2};
        Swap(arr);
        System.out.println(Arrays.toString(arr));
//swap
//        int temp=a;
//        a=b;
//        b=temp;
//        System.out.println(a+" "+b);

//        a=a+b;//32
//        b=a-b;//32-22=10
//        a=a-b;
//        System.out.println(a+" "+b);\

        swap(a,b);
        System.out.println(a+" "+b);//didnot swap primitive data are jus pass by value
        //non4opy of the value of the reference



    }

    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }



static void Swap(int[] nums) {
    int temp=nums[0];
    nums[0]=nums[1];
    nums[1]=temp;
    }
}