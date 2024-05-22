package prac23;
abstract class Expression {
    abstract double evaluate(double x);
}
class Const extends Expression {
    private double value;
    public Const(double value) {
        this.value = value;
    }
    @Override
    double evaluate(double x) {
        return value;
    }
}
class Variable extends Expression {
    private String name;
    public Variable(String name) {
        this.name = name;
    }
    @Override
    double evaluate(double x) {
        return x;
    }
}