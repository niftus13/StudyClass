package project;

public class Calculator {

	public static void main(String[] args) {

	}



	//숫자 두 개를 매개변수의 인자로 전달받아 더하기 메소드를 추가합시다.
	static int plus(int num1, int num2) {
		int result;
		result = num1 + num2;
		System.out.println(result);
		return result;
	}
	//숫자 두 개를 매개변수의 인자로 전달받아 빼기 메소드를 추가합시다.

	static int minus(int num1, int num2) {
		int result;
		result = num1 - num2;
		System.out.println(result);
		return result;
		
	}
	//숫자 두 개를 매개변수의 인자로 전달받아 곱하기 메소드를 추가합시다
	static int multiply(int num1, int num2) {
		int result;
		result = num1 * num2;
		System.out.println(result);
		return result;
		
	}	
	//숫자 두 개를 매개변수의 인자로 전달받아 나누기 메소드를 추가합시다.

	static int divide(int num1, int num2) {
		int result;
		result = num1 / num2;
		System.out.println(result);
		return result;
		
	}


}

	
