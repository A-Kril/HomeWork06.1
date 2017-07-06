package CreationalPatterns.AbstractFactory;

public class EnMouse implements Mouse{

    @Override
    public void click() {
        System.out.println("Clicking the mouse");
    }

    @Override
    public void dbclick() {
        System.out.println("Double click on the mouse");

    }

    @Override
    public void scroll(int direction) {
        if (direction > 0)
            System.out.println("Scroll Up");
        else if (direction < 0)
            System.out.println("Scroll Down");
        else
            System.out.println("Do not scroll");

    }
}
