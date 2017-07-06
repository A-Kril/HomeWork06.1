package StructuralPatterns.Decorator;

public class DecoratorApp {
    public static void main(String[] args) {
        PrinterInterface printerInterface = new QuotesDecorator(new LeftBracketDecorator(new RightBracketDecorator
                (new Printer("Hello!"))));
        printerInterface.print();
    }
}
