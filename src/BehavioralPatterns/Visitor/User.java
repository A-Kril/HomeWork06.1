package BehavioralPatterns.Visitor;

interface User {
    void use(EngineElement engine);
    void use(BodyElement body);
    void use(CarElement car);
    void use(WheelElement wheel);
}
