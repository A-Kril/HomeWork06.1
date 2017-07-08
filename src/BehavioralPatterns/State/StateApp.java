package BehavioralPatterns.State;

public class StateApp {
    public static void main(String[] args) {
        Station evropaPlus = new EvropaPlus();
        Radio radio = new Radio();
        radio.setStation(evropaPlus);

        for (int i = 0; i < 10; i++) {
            radio.nextStation();
            radio.play();
        }
    }
}
