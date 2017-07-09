package BehavioralPatterns.Visitor;

class BadBuyer implements User {

    @Override
    public void use(EngineElement engine) {
        System.out.println("Started the engine");
    }

    @Override
    public void use(BodyElement body) {
        System.out.println("Scratched the body");

    }

    @Override
    public void use(CarElement car) {
        System.out.println("Smoked in the cabin");
    }

    @Override
    public void use(WheelElement wheel) {
        System.out.println("Hit the " + wheel.getName() + " wheel");
    }
}
