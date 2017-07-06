package CreationalPatterns.AbstractFactory;

public interface DeviceFactory {
    Mouse getMouse();
    Keyboard getKeyboard();
    Touchpad getTouchpad();
}
