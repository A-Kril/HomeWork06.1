package BehavioralPatterns.Interpreter;

class MinusExspression implements Expression{
    Expression left;
    Expression right;

    public MinusExspression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() - right.interpret();
    }
}
