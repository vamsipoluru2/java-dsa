import java.util.Arrays;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // string is a class
		String s="hello";
		String s1=new String("hello");//since stirng is a class wee can creagte an obj to it  
		String s2=new String("hello");
		String s3="hello";
		
		System.out.println(s==s3);
		System.out.println(s1==s2);

		


        //strings are compared address when you use == if you want to cheek data we use  .equals method 
		System.out.println(s1.equals(s2));
		
		char ch[]= {'w','e','l','c','o'};
		
		for(char c:ch) {
			System.out.println(c);
		}
		String d=new String(ch);
		System.out.println(d);
		
//		new String(ch, offset, length) creates a String from index 2, length 3.
		String d1=new String(ch,2,3);
		System.out.println(d1);
		
		//methods
		String c2 = new String("welcome");
		// Length
        System.out.println("Length: " + c2.length());

        // charAt
        System.out.println("CharAt(3): " + c2.charAt(3));

        // equals
        System.out.println("Equals 'welcome': " + c2.equals("welcome"));
        System.out.println("EqualsIgnoreCase 'WELCOME': " + c2.equalsIgnoreCase("WELCOME"));

        // concat
        System.out.println("Concat: " + c2.concat(" user"));//new obj is created
        
        // compareTo
        System.out.println("CompareTo 'apple': " + c2.compareTo("apple"));

        // toUpperCase & toLowerCase
        System.out.println("Upper: " + c2.toUpperCase());
        System.out.println("Lower: " + c2.toLowerCase());

        // Convert to char array
        char[] arr = c2.toCharArray();
        System.out.println("To Char Array: "+Arrays.toString(arr));

        System.out.println();
        
        // substring
        System.out.println("Substring(3): " + c2.substring(3));
        System.out.println("Substring(1,4): " + c2.substring(1,4));

        
        // indexOf & lastIndexOf
        System.out.println("IndexOf 'c': " + c2.indexOf('c'));
        System.out.println("LastIndexOf 'e': " + c2.lastIndexOf('e'));
        

        // trim (to show effect, add spaces)
        String spaced = "   \u3000welcome\u4000   ";
        System.out.println("Trim: '" + spaced.trim() + "'");
        
        //strip is better trim unicode spaces are also removed
        String spaced2=" \u3000welcome\u3000 ";
        System.out.println("Strip: "+spaced2.strip());
        
        // replace
        System.out.println("Replace 'e' with 'x': " + c2.replace('e','x'));


        // Count number of words in a String
        String sentence = "I am learning Java";
        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {

            if (sentence.charAt(i) != ' ' &&
                (i == 0 || sentence.charAt(i - 1) == ' ')) {
                count++;
            }
        }

        System.out.println("Number of words: " + count);

        
        

        
        
     


      

	}

}