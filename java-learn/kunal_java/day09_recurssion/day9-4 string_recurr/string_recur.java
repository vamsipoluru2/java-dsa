// package day9 recurssion.day9-4 string_recurr;

public class string_recur {
    public static void main(String[] args) {
    System.out.println(skip("bacacacdah"));
    skip("","baccdah");
    System.out.println(skipapple("bacappledah"));
    System.out.println(skipappNotapple("bacappldah"));
    

        
    }
    static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char c = up.charAt(0);
        if(c == 'a'){
            skip(p, up.substring(1));//IT WILL OR SKIP THE ONE BY ONE CHAR
        }else{
            skip(p+c, up.substring(1));
        }



    }
    static String skip(String up){
        if(up.isEmpty()){
            return "";
        }
        char c = up.charAt(0);
        if(c == 'a'){
            return skip(up.substring(1));//IT WILL OR SKIP THE ONE BY ONE CHAR
        }else{
           return c+ skip(up.substring(1));
        }



    }

    static String skipapple(String up){
        if(up.isEmpty()){
            return "";
        }
       
        if(up.startsWith("apple")){ 
            return skip(up.substring(5));//IT WILL OR SKIP THE ONE BY ONE CHAR
        }else{
           return up.charAt(0)+ skipapple(up.substring(1));
        }



    }
    //only skip app if not apple int string//no recursion is skipped
    static String skipappNotapple(String up){
        if(up.isEmpty()){
            return "";
        }
       
        if(up.startsWith("app")&&!up.startsWith("apple")){ 
            return skipappNotapple(up.substring(3));//IT WILL OR SKIP THE ONE BY ONE CHAR
        }else{
           return up.charAt(0)+ skipappNotapple(up.substring(1));
        }



    }
    
    
}
