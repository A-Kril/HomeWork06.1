package CreationalPatterns.Builder;

class Director {

    CarBuilder builder;

    void setBuilder(CarBuilder builder) {
        this.builder = builder;
    }

    Car buildCar(){
        builder.createCar();
        builder.buildMake();
        builder.buildTransmission();
        builder.buildMaxSpeed();

        Car car = builder.getCar();
        return car;
    }
}
