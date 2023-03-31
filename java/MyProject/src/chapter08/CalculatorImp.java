package chapter08;
public class CalculatorImp implements Calculator {

    @Override
    public long add(long num1, long num2) {
        return num1 + num2;
    }

    @Override
    public long sub(long num1, long num2) {
        return num1 - num2;
    }

    @Override
    public long multiply(long num1, long num2) {
        return num1 * num2;
    }

    @Override
    public double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("0으로는 나눌수 없습니다.");
        }
        return num1 / num2;
    }
}
