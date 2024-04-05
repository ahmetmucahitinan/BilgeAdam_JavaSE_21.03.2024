package week04.entityrelations.threads.implementstunnable;

public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
//        myRunnable.run();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}
