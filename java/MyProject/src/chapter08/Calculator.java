package chapter08;

public interface Calculator {
    long add(long num1, long num2);
    long sub(long num1, long num2);
    long multiply(long num1, long num2);
    double divide(double num1, double num2) throws ArithmeticException;
}
