package StructuralPatterns.Bridge;

abstract class Car {
    Make make;

    public Car(Make make) {
        this.make = make;
    }

    abstract void showType();

    void showDetails(){
        showType();
        make.setMake();
    }
}
