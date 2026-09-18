package day12_oops.oop5.interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("electric engine starts");
    }

    @Override
    public void stop() {
        System.out.println("electric engine stops");
    }

    @Override
    public void acc() {
        System.out.println("electric engine acc");

    }
}
