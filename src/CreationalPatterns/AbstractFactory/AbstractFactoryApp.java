package CreationalPatterns.AbstractFactory;

import java.util.Scanner;

public class AbstractFactoryApp {
    Scanner value = new Scanner(System.in);

    public void printMenu() {
        System.out.println("Select input language: ");
        System.out.println("1. Enter 'ru' for Russian.");
        System.out.println("2. Enter 'en' for English.");
        System.out.println("3. Enter 'y' to exit.");
        optionMenu();
    }

    public void optionMenu(){
        String a = value.next();
        switch (a) {
            case "ru":
                ruCode();
                break;
            case "en":
                enCode();
                break;
            case "y":
                Exit();
                break;
            default:
                notSize();
                break;
        }
    }

    public void ruCode(){
        DeviceFactory deviceFactory = getDeviseFactoryCode("RU");
        Mouse mouse = deviceFactory.getMouse();
        Keyboard keyboard = deviceFactory.getKeyboard();
        Touchpad touchpad = deviceFactory.getTouchpad();

        mouse.click();
        keyboard.print();
        keyboard.println();
        touchpad.track(10, 35 );
        System.out.println("====================");
        printMenu();
    }

    public void enCode(){
        DeviceFactory deviceFactory = getDeviseFactoryCode("EN");
        Mouse mouse = deviceFactory.getMouse();
        Keyboard keyboard = deviceFactory.getKeyboard();
        Touchpad touchpad = deviceFactory.getTouchpad();

        mouse.click();
        keyboard.print();
        keyboard.println();
        touchpad.track(20, 45 );
        System.out.println("====================");
        printMenu();
    }

    private static DeviceFactory getDeviseFactoryCode(String lang) {
        switch (lang){
            case "RU":
                return new RuDeviceFactory();
            case "EN":
                return new EnDeviceFactory();
            default:
                throw new RuntimeException("Unsupported Country Code: " + lang);
        }
    }

    public void notSize(){
        System.out.println("====================" + "\nInvalid input");
        System.out.println("Try again: ");
        optionMenu();
    }

    public void Exit(){
        System.out.println("Bye!");
    }
}
