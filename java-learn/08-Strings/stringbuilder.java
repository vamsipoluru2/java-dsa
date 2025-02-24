    //we need a data type it can allow us to change the value in its own object it is string builder 
//muttable changing in own object
public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder x = new StringBuilder();
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            x.append(ch);
        
    }
        // System.out.println(x);or
        System.out.println(x.toString());
        x.reverse();
        System.out.println(x.toString());
        x.deleteCharAt(0);
        System.out.println(x.toString());
        
    }
    
}
