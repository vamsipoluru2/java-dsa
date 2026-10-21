public class Sum_ofDigits {
    public static void main(String[] args) {
        Solution solution = new Solution(); 
        int num = 529;
 
        // Call the addDigits method and print the result
        int result = solution.addDigits(num);
        System.out.println("Sum of digits: " + result); 
    }
     public int addDigits(int num) {
        if (num < 10) {
            return num;
        }
         int sum = sumDigits(num);
        return addDigits(sum);
    }
    
    private int sumDigits(int num) {
        if (num == 0) return 0;
 
        return sumDigits(num / 10) + (num % 10);
    }
}
