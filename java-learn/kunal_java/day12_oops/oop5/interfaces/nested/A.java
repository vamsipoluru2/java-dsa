package day12_oops.oop5.interfaces.nested;

public class A {//A s role	Just a container/organizer for the interface
    public interface NestedInterfaace{
        boolean isOdd(int num);
    }
}
class B implements A.NestedInterfaace{//inside a there is nested interface
    @Override
    public boolean isOdd(int num) {
        return (num&1)==1;
    }
}

