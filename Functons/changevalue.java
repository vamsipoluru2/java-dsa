import java.util.Arrays;

public class changevalue {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums) {
        nums[0] = 99;//if you make a chane to the obj via this ref variable same obj will be changed
    }
}
