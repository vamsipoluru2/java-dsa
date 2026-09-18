package basic;

public class _04Armstrong_palindrom3e {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
        System.out.println(palindrome(5455));
    }

    // print all the 3 digits armstrong numbers
static boolean isArmstrong(int n) {
    int original = n;
    int sum = 0;
    int rev=0;

    while (n > 0) {
        int rem = n % 10;
        n = n / 10;
        sum = sum + rem*rem*rem;
    }

    return sum == original;
}

    static boolean palindrome(int n) {
        int original = n;
        int rev=0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            rev=rev*10+rem;//revesing

        }

        return rev == original;
    }


}
