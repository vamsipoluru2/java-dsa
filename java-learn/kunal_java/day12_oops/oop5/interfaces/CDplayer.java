package day12_oops.oop5.interfaces;

public class CDplayer implements Media{

    @Override
    public void start() {
        System.out.println("Music start");
    }

    @Override
    public void stop() {
        System.out.println("music stops");

    }
}
