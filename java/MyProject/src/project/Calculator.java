package project;

import java.util.Scanner;

public class Calculator {

	
/*	⑦ main() 메소드를 정의하고 각각의 메소드를 호출해서 결과를 콘솔에 출력해봅시다.
 *  ⑧ 콘솔에서 사용자에게 데이터를 받아 메소드를 호출할 때 
 *  	사용자에게 받은 데이터를 메소드의 매개변수의 인자로 전달하는 코드를 main() 메소드
		에 추가해봅시다.*/
	public static void main(String[] args) {
		
		System.out.println("숫자 2개를 입력하세요");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		
		
		plus(a,b);
		minus(a,b);
		multiply(a,b);
		divide(a,b);
		round(a);
		area(b);
		
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
	//실수 반지름 하나를 매개변수의 인자로 전달받아 원의 둘레를 구해 반환하는 메소드를 반환하는 메소드를 정의
	static  float round(int num1) {
		float result;
		float pi = 3.14f;
		
		result = 2*num1*pi;
		System.out.println(result);
		return result;
	}
	//	⑥ 실수 반지름 하나를 매개변수의 인자로 전달받아 원의 넓이를 구해 반환하는 메소드를 반환하는 메소드를 정의
	//	원의 둘레 : 2 x π x r , 월의 넓이 : π x r x r
	static float area(int num1) {
		float result;
		float pi = 3.14f;
		result = num1*num1*pi;
		System.out.println(result);
		return result;
	}

}

	
