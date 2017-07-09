package BehavioralPatterns.TemplateMethod;

public class TemplateMethodApp {
    public static void main(String[] args) {
        ClassC a = new ClassA();
        a.templateMethod();

        System.out.println("=======");

        ClassC b = new ClassB();
        b.templateMethod();

    }
}
