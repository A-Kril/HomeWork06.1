package CreationalPatterns.Builder;

class Mazda3 extends CarBuilder{

    @Override
    void buildMake() {
        car.setMake("Mazda 3");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.AUTO);

    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(170);
    }
}
