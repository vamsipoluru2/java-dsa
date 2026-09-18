package day12_oops.oop6.exceptionhandling;

public class Main {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try {//try everything if you ind an exception catch here
//            int c=a/b;
//            divide(a,b);

            //custom exception
            String name="vamsi";
            if(name.equals("vamsi")){
                throw  new MyExcption(("name is kunal"));
            }
        }catch (MyExcption e) {
            System.out.println(e.getMessage());
        }

        catch(ArithmeticException e){//if ARthematic exception is thrown it will call this
            System.out.println(e.getMessage());

        }catch(Exception e){//if normal exception throws it will call this //exception include evry exception  more strict rules (exception)shloud be above
            System.out.println("normal exception");

        }finally {//only one finally block it will always run
            System.out.println("this wil always excute ");
        }

    }


//    this is like instructing in way to address not to divide it by zero
    static int divide(int a,int b)throws ArithmeticException{//
        if(b==0){
        throw new ArithmeticException("please do not divide by xero") ;
    }
    return a/b;
    }
}
