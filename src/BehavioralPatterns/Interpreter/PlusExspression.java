package BehavioralPatterns.Interpreter;

class PlusExspression implements Expression{
    Expression left;
    Expression right;

    public PlusExspression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() + right.interpret();
    }
}
