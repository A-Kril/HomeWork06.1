package BehavioralPatterns.Visitor;

public class VisitorApp {
    public static void main(String[] args) {
        Element car = new CarElement();
        car.accept(new BadBuyer());
        System.out.println("====================");
        car.accept(new Mechanic());

    }
}
