package func_interface;

//its an annomonus class which implements the functional interface car and provides implementation for the abstract method start().
//it wont show in files and reduce no of classes in the project. we can use it when we need to use the functional interface only once in the project.
public class user{
    public static void main(String[] args) {
        car c = new car() {
            @Override
            public void start() {
                System.out.println("Car started");
            }
        };
        c.start();
        c.stop();
        car.honk();
    }

}