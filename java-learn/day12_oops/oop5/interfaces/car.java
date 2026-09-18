package day12_oops.oop5.interfaces;

public class car implements Engine,brake,Media{

    @Override
    public void start() {
        System.out.println("i start engine  like normall car");
    }
    // if the bothb interfacce has same method also fine it will override  it wont matter

    @Override
    public void stop() {
        System.out.println("i stop engine like a normal car");
    }

    @Override
    public void acc() {
        System.out.println("i acc like a normal car");
    }

    @Override
    public void brake() {
        System.out.println("i braek like normal car");
    }
}
