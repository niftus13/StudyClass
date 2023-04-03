package chapter08;
public class CalculatorImp implements Calculator {
	//구현하는 인터페이스의 추상메소드 중 하나라도 미구현 하면 => 추상클래스
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
        return num1 / num2;
    }
}
