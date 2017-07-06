package CreationalPatterns.AbstractFactory;

public class RuMouse implements Mouse{

    @Override
    public void click() {
        System.out.println("Щелчок мишью");
    }

    @Override
    public void dbclick() {
        System.out.println("Двойной щелчок мишью");
    }

    @Override
    public void scroll(int direction) {
        if (direction > 0)
            System.out.println("Скролим вверх");
        else if (direction < 0)
            System.out.println("Скролим вниз");
        else
            System.out.println("Не скролим");
    }
}
