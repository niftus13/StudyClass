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
		
		
		add(a,b);
		sub(a,b);
		mul(a,b);
		div (a,b);
		
		
		System.out.println("반지름 값을 입력해주세요");
		int r = in.nextInt();
		round(r);
		area(r);
		
	}
	//숫자 두 개를 매개변수의 인자로 전달받아 더하기 메소드를 추가합시다.
	static int add(int num1, int num2) {
		int result;
		result = num1 + num2;
		System.out.println(result);
		return result;
	}
	//숫자 두 개를 매개변수의 인자로 전달받아 빼기 메소드를 추가합시다.
	static int sub(int num1, int num2) {
		int result;
		result = num1 - num2;
		System.out.println(result);
		return result;
	}
	//숫자 두 개를 매개변수의 인자로 전달받아 곱하기 메소드를 추가합시다
	static int mul(int num1, int num2) {
		int result;
		result = num1 * num2;
		System.out.println(result);
		return result;
		
	}	
	//숫자 두 개를 매개변수의 인자로 전달받아 나누기 메소드를 추가합시다.

	static int div(int num1, int num2) {
		int result;
		result = num1 / num2;
		System.out.println(result);
		return result;
		
	}
	//실수 반지름 하나를 매개변수의 인자로 전달받아 원의 둘레를 구해 반환하는 메소드를 반환하는 메소드를 정의
	static  double round(int num1) {
		double result;
		result = 2*num1*Math.PI;
		System.out.println(result);
		return result;
	}
	//	⑥ 실수 반지름 하나를 매개변수의 인자로 전달받아 원의 넓이를 구해 반환하는 메소드를 반환하는 메소드를 정의
	//	원의 둘레 : 2 x π x r , 월의 넓이 : π x r x r
	static double area(int num1) {
		double result;
		result = num1*num1*Math.PI;
		System.out.println(result);
		return result;
	}

}

	
