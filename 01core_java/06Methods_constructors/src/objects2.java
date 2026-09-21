public class objects2 {
    int a;
    int b;
    public objects2(){
        a=10;
        b=20;
    }
    public objects2(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println("i am a parameterized constructor");
    }
    public static void main(String[] args) {
        objects2 t1=new objects2();
        objects2 t2=new objects2(30,40);
        objects2 t3=new objects2(50,60);
        System.out.println(t1.add());//obj method call
        System.out.println(t2.add());
        System.out.println(t3.add());
        System.out.println(t1.a);//obj variable call


    }
    public int add() {
        return a+b;
    }
}
