import java.util.Scanner;

public class CheckVowelOrConsonent {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);

	    System.out.print("Enter a character: ");
	    char x = a.next().charAt(0);

	    x = Character.toLowerCase(x);
		if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u') {
			System.out.println("it's an vowel");
		}
		else {
			System.out.println("it's an consonent");
		}
		

		//using switch to develop menu driven program
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a character: ");
	        char ch = sc.next().charAt(0);

	        switch (Character.toLowerCase(ch)) { 
	            case 'a':
	            case 'e':
	            case 'i':
	            case 'o':
	            case 'u':
	                System.out.println(ch + " is a vowel.");
	                break;
	            default:
	                System.out.println(ch + " is not a vowel.");
	        }
	        a.close();
	        sc.close();
	    }
	
	
	


}
