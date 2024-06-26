package prac23;
abstract class BinaryOperation extends Expression {
    protected Expression left;
    protected Expression right;
    public BinaryOperation(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
class Add extends BinaryOperation {
    public Add(Expression left, Expression right) {
        super(left, right);
    }
    @Override
    double evaluate(double x) {
        return left.evaluate(x) + right.evaluate(x);
    }
}
class Subtract extends BinaryOperation {
    public Subtract(Expression left, Expression right) {
        super(left, right);
    }
    @Override
    double evaluate(double x) {
        return left.evaluate(x) - right.evaluate(x);
    }
}
class Multiply extends BinaryOperation {
    public Multiply(Expression left, Expression right) {
        super(left, right);
    }
    @Override
    double evaluate(double x) {
        return left.evaluate(x) * right.evaluate(x);
    }
}
class Divide extends BinaryOperation {
    public Divide(Expression left, Expression right) {
        super(left, right);
    }
    @Override
    double evaluate(double x) {
        double denominator = right.evaluate(x);
        if (denominator != 0) {
            return left.evaluate(x) / denominator;
        } else {
            throw new ArithmeticException("Division by zero");
        }
    }
}