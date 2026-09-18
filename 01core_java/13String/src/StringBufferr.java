public class StringBufferr{
    public static void main(String[] args) {
        
        String s1 = "Yadagiri";
        String s2 = "Yadagiri";

        System.out.println(s1 == s2);///true 

        s1 = s1 + "Reddy";//YadagiriReddy

        System.out.println(s1 == s2);//false but address is same right if you update the data then adddress is changing
        //so when any manuplation happens th string it creates new sting and point the var to it 

        String s3 = "YadagiriReddy";

        System.out.println(s1 == s3);//false

        //for every manupulation op the string is creating new string memory wastage is happening
        //java introducted string uilder and buffer


        // Create a StringBuffer  address wont change if you change or modify the existing string unlike strings
        StringBuffer sb = new StringBuffer("Hello");
        StringBuffer sb1 = new StringBuffer("Hello");
        StringBuffer sb2 = new StringBuffer(" chitti");
        System.out.println(sb==sb1);//false due to thre dfif obj

        // append()
        sb.append(" World");
        System.out.println("After append: " + sb);   // Hello World
        System.out.println(sb==sb1);//false due to string buffer wont add new obj it modifiys exixting obj 

        
        sb.append(sb2);
        System.out.println("after append: " + sb);//modified to existing obj
        
        //compare 
        System.out.println(sb.compareTo(sb2)  );
        //capacity()//defult is 16
        System.out.println("Capacity: " + sb.capacity());

        //length()
        System.out.println("Length: " + sb.length());

        // insert()
        sb.insert(6, "Java ");
        System.out.println("After insert: " + sb);   // Hello Java World

        // replace()
        sb.replace(6, 10, "C++");  // (start, end, new text)
        System.out.println("After replace: " + sb); // Hello C++ World

        // delete()
        sb.delete(6, 10);
        System.out.println("After delete: " + sb);  // Hello  World

        // reverse()
        sb.reverse();
        System.out.println("After reverse: " + sb); // dlroW  olleH
        
        System.out.println();
        System.out.println("String builder");
        
     // Create a StringBuilder
        StringBuilder sb3 = new StringBuilder("Hello");

        // 1. append()
        sb3.append(" World");
        System.out.println("After append: " + sb3);   // Hello World

        // 2. insert()
        sb3.insert(6, "Java ");
        System.out.println("After insert: " + sb3);   // Hello Java World

        // 3. replace()
        sb3.replace(6, 10, "C++");
        System.out.println("After replace: " + sb3); // Hello C++ World

        // 4. delete()
        sb3.delete(6, 10);
        System.out.println("After delete: " + sb3);  // Hello  World

        // 5. reverse()
        sb3.reverse();
        System.out.println("After reverse: " + sb3); // dlroW  olleH

        // 6. capacity()
        System.out.println("Capacity: " + sb3.capacity());

        // 7. length()
        System.out.println("Length: " + sb3.length());
    

    }
}
