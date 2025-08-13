package calculator;

class AddOperation implements Operation {
    @Override
    public double calculate(double a, double b) {
        return a + b;
    }
}
class SubtractOperation implements Operation {
    @Override
    public double calculate(double a, double b) {
        return a - b;
    }
}
class MultiplyOperation implements Operation {
    @Override
    public double calculate(double a, double b) {
        return a * b;
    }
}
class DivideOperation implements Operation {
    @Override
    public double calculate(double a, double b) {
        return a / b;
    }
}