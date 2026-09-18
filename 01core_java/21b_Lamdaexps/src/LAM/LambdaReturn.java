package LAM;

public class LambdaReturn{

    public static void main(String[] args) {

        // 1. Normal class implementation

        Bike b = new Bike();

        System.out.println(b.getSpeed());


        // 2. Anonymous class implementation

        Vehicle v1 = new Vehicle() {

            @Override
            public int getSpeed() {
                return 70;
            }
        };

        System.out.println(v1.getSpeed());


        // 3. Lambda expression

        Vehicle v2 = () -> 100;

        System.out.println(v2.getSpeed());


        // Another lambda expression

        Vehicle v3 = () -> 120;

        System.out.println(v3.getSpeed());
    }


    // Normal class implementing interface

    static class Bike implements Vehicle {

        @Override
        public int getSpeed() {

            System.out.println("Bike is running");

            return 50;
        }
    }


    // Functional interface

    @FunctionalInterface
    interface Vehicle {

        int getSpeed();
    }
}