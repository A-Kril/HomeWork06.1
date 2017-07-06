package CreationalPatterns.FactoryMethod;

import java.util.Scanner;

public class FactoryMethodApp {

    Scanner value = new Scanner(System.in);

    public void printMenu() {
        System.out.println("Set the clock type: ");
        System.out.println("1: Digital.");
        System.out.println("2: Rome.");
        System.out.println("3: Exit.");
        optionMenu();
    }

    public void optionMenu(){
        String a = value.next();
        switch (a) {
            case "1":
                DigitalClock();
                break;
            case "2":
                RomeClock();
                break;
            case "3":
                Exit();
                break;
            default:
                notSize();
                break;
        }
    }

    public void notSize(){
        System.out.println("====================" + "\nUnsupported watch line");
        System.out.println("Try again: ");
        optionMenu();
    }

    public void DigitalClock(){
        WatchMaker watchMaker = new DigitalWatchMaker();
        Watch watch = watchMaker.createWatch();
        watch.showTime();
        System.out.println("====================");
        printMenu();
    }

    public void RomeClock(){
        WatchMaker watchMaker = new RomeWatchMaker();
        Watch watch = watchMaker.createWatch();
        watch.showTime();
        System.out.println("====================");
        printMenu();
    }

    public void Exit(){
        System.out.println("Bye!");
    }
}
