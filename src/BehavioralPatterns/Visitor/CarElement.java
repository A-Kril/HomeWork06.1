package BehavioralPatterns.Visitor;

class CarElement implements Element{
    Element[] elements;

    public CarElement() {
        this.elements = new Element[] {new WheelElement("front left"),
                new WheelElement("front right"), new WheelElement("rear left"),
                new WheelElement("rear right"), new BodyElement(), new EngineElement()};
    }

    @Override
    public void accept(User user) {
        for (Element elem : elements) {
            elem.accept(user);
        }
        user.use(this);
    }
}
