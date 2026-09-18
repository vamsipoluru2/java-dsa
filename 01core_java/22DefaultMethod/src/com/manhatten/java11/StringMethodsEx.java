package com.manhatten.java11;
public class StringMethodsEx {
    public static void main(String[] args) {
        String str = " welcome ";

     // trim (to show effect, add spaces)
        String spaced = "   \u3000welcome\u4000   ";
        System.out.println("Trim: '" + spaced.trim() + "'");
        
        //strip is better trim unicode spaces are also removed
        String spaced2=" \u3000welcome\u3000 ";
        System.out.println("Strip: "+spaced2.strip());
        
        System.out.println(str.isBlank());      
        System.out.println("   ".isBlank());     
        System.out.println("hi\nhello".lines().count()); 
        System.out.println("ha".repeat(3));      

        System.out.println(str.stripLeading());  
        System.out.println(str.stripTrailing()); 
    }
}
