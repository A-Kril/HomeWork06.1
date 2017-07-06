package CreationalPatterns.Builder;

class MitsubishiLancer extends CarBuilder{

    @Override
    void buildMake() {
        car.setMake("Mitsubishi Lancer");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.MANUAL);
    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(180);
    }
}
