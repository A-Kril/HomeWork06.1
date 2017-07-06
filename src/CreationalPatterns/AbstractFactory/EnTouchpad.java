package CreationalPatterns.AbstractFactory;

public class EnTouchpad implements Touchpad{

    @Override
    public void track(int deltaX, int deltaY) {
        int s = (int) Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY,2));
        System.out.println("Moved by " + s + " pixels");
    }
}
