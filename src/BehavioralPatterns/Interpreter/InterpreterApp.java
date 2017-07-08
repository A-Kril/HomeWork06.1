package BehavioralPatterns.Interpreter;

class InterpreterApp {
    public static void main(String[] args) {
        Context context = new Context();
        Expression expression = context.evaluate("11-2+34");
        System.out.println(expression.interpret());

    }
}
