package func_interface;

@FunctionalInterface 
public interface car {
    //functional interface is an interface which has only one abstract method, but it can have multiple default and static methods.*
    void start();// abstract method 
    //we can have multiple default and static methods in functional interface but only one abstract method is allowed.
    default void stop() {
        System.out.println("Car stopped");
    }
    private void privateMethod() {
        System.out.println("Private method in interface");
    }
    static void honk() {
        System.out.println("Car honking");
    }
    
}
