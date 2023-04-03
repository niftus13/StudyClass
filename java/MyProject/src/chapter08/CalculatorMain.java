package chapter08;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator calculator = new CalculatorImp();

		long result1 = calculator.add(10, 20);
		long result2 = calculator.sub(30, 5);
		long result3 = calculator.multiply(4, 8);
		double result4 = calculator.divide(100, 5);

		System.out.println("더하기 " + result1);
		System.out.println("빼기 " + result2);
		System.out.println("곱하기 " + result3);
		System.out.println("나누기 " + result4);
		

	}

}
