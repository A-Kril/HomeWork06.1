package CreationalPatterns.AbstractFactory;

public class EnKeyboard implements Keyboard{
    @Override
    public void print() {
        System.out.println("Print the line");
    }

    @Override
    public void println() {
        System.out.println("Print a line with line feed");
    }
}
