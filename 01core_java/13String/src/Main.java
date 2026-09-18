public class Main {

    static void countCharacters(String s) {

        int upper = 0;
        int lower = 0;
        int digit = 0;
        int special = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (Character.isUpperCase(ch)) {
                upper++;
            }
            else if (Character.isLowerCase(ch)) {
                lower++;
            }
            else if (Character.isDigit(ch)) {
                digit++;
            }
            else {
                special++;
            }
        }

        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
        System.out.println("Digits: " + digit);
        System.out.println("Special Characters: " + special);
    }

    public static void main(String[] args) {

        String s = "Hello@123!Java";

        countCharacters(s);
    }
}    
