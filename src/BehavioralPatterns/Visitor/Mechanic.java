package BehavioralPatterns.Visitor;

class Mechanic implements User {

    @Override
    public void use(EngineElement engine) {
        System.out.println("Checked the engine");
    }

    @Override
    public void use(BodyElement body) {
        System.out.println("Polished the body");

    }

    @Override
    public void use(CarElement car) {
        System.out.println("Brushed the salon");
    }

    @Override
    public void use(WheelElement wheel) {
        System.out.println("Pumped the " + wheel.getName() + " wheel");
    }
}
