package BehavioralPatterns.Interpreter;

class NumberExpression implements Expression{
    int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return number;
    }
}
