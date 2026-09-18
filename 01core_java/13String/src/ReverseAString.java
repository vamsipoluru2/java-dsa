class ReverseAString {

    // Reverse entire String
    static String reverseString(String s) {

        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

        return rev;
    }


    // Reverse order of words
    static String reverseWords(String s) {

        String[] words = s.split(" ");

        String rev = "";

        for (int i = words.length - 1; i >= 0; i--) {
            rev = rev + words[i] + " ";
        }

        return rev.trim();
    }

        // Reverse entire String
    static String reverseStrin(String s) {

        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }

    public static void main(String[] args) {

        String s = "hello world java";

        System.out.println("Reverse String: " + reverseString(s));

        System.out.println("Reverse Words: " + reverseWords(s));
        System.out.println(reverseStrin(s));
    }
}
