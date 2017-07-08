package BehavioralPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

class MeteoStation implements Observed{
    int temperature;
    int pressure;

    List<Observer> observers = new ArrayList<>();

    public void setMeasurements(int t, int p) {
        this.temperature = t;
        this.pressure = p;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.handleEvent(temperature, pressure);
        }
    }
}
