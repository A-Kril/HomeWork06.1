package CreationalPatterns.Singleton;

public class SingletonApp {
    public static void main(String[] args) throws InterruptedException{
        final int SIZE = 1000;

        Thread thread[] = new Thread[SIZE];

        for (int i = 0; i < SIZE; i++) {
            thread[i] = new Thread(new Test());
            thread[i].start();
        }
        for (int i = 0; i < SIZE; i++) {
            thread[i].join();
        }
        System.out.println(Singleton.counter);
    }
}
