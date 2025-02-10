public class withreturn_func {
    public static void main(String[] args) {
        int a=5;
        int b=7;
        add(a,b);
    }

    public static void add(int a,int b){
        int sum=a+b;
        System.out.println("the summ is "+sum);
    }
    
}



/*public class withreturn_func {
    public static void main(String[] args) {
        int a=5;
        int b=7;
        int sum= add(a,b);
        System.out.println("the sum is "+sum);
    }

    public static int  add(int a,int b){
        int sum=a+b;
        return sum;

    }
    
}*/