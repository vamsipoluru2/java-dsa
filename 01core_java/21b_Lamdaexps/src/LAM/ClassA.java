package LAM;

public class ClassA {

    public static void main(String[] args) {

        // Normal implementation
        Audi a = new Audi();
        a.drive(70,"audi");

        // Anonymous class implementation
        Car c1 = new Car() {
            @Override
            public void drive(int speed,String name) {
                System.out.println(name+"Car is driving");
            }
        };

        c1.drive(70,"Bmw");

        // Lambda expression
        Car c2 = (speed,name) -> {
            System.out.println(name+"Car is driving1");
            System.out.println("Car is driving2");

            if (speed > 60)
                System.out.println("Car is driving fast");
            else
                System.out.println("Car is driving slow");
        };

        c2.drive(59,"MG");
    }

    static class Audi implements Car {

        @Override
        public void drive(int speed,String name) {
            System.out.println(name+"drove at " + speed);
        }
    }

    @FunctionalInterface
    interface Car {
        void drive(int speed, String name);
    }
}