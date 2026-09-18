package HYRMultithread;

public class Syncronizations {

    //everytime we run we get diff value this is called race contdition ie 2 ppll come and told i have unloaded 50 but i have added it has one personsns
    //we shuould use syncronized to overcome this
    public static void main(String[] args) throws Exception {

        BrickDairy bd = new BrickDairy();

        Runnable r1 = () -> {

            for (int i = 0; i < 10000; i += 50) {
                bd.incrementBrickCount();
            }
        };


        Runnable r2 = () -> {

            for (int i = 0; i < 15000; i += 50) {
                bd.incrementBrickCount();
            }
        };


        Runnable r3 = () -> {

            for (int i = 0; i < 5000; i += 50) {
                bd.incrementBrickCount();
            }
        };


        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);


        t1.start();
        t2.start();
        t3.start();


        // Wait for all threads to finish
        t1.join();
        t2.join();
        t3.join();


        System.out.println(bd.brickCount);
    }
}


class BrickDairy {

    int brickCount = 0;

    public synchronized void incrementBrickCount() {

        brickCount += 50;

        // if you want particuar code only to be in sync 
        // we can use method level
        // synchronized(this){
        //             brickCount += 50;

        // }
    }


}