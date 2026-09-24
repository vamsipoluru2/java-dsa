public class stringreverse {
    public static void main(String[] args) {
        String original = "hello";
        StringBuilder reversed = new StringBuilder();

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed.append(original.charAt(i));
        }

        System.out.println(reversed.toString()); // Output: "olleh"
    }
}




//class Solution {
//    public void reverseString(char[] s) {
//        int left=0;
//        int right=s.length-1;
//// twopointer
//        while(left<right){
//            char temp=s[left];
//            s[left]=s[right];
//            s[right]=temp;
//
//            left++;
//            right--;
//        }
//    }
//}