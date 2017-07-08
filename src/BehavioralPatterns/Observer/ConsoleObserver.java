package BehavioralPatterns.Observer;

class ConsoleObserver implements Observer{

    @Override
    public void handleEvent(int temp, int presser) {
        System.out.println("The weather has changed. Temperature - " + temp + ". Pressure - " + presser + ".");
    }
}
