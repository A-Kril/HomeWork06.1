package CreationalPatterns.Singleton;

class Test implements Runnable{

    @Override
    public void run() {
        Singleton.getInstance();
    }
}
