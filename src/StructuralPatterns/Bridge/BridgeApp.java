package StructuralPatterns.Bridge;

public class BridgeApp {
    public static void main(String[] args) {
        Car car0 = new Hatchback(new Mitsubishi());
        Car car1 = new Sedan(new Mitsubishi());
        Car car2 = new Hatchback(new Mazda());
        Car car3 = new Sedan(new Mazda());

        car0.showDetails();
        car1.showDetails();
        car2.showDetails();
        car3.showDetails();
    }
}
