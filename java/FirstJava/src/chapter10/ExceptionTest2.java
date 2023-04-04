package chapter10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("프로그램을 시작합니다.");
		System.out.println("정수 하나를 입력 >");
		int num1 = 0;
		int num2 = 0;

		
		try {
			num1 = sc.nextInt(); // 예외 발생 가능
			
			System.out.println("두번째 정수 하나를 입력 >");

			num2 = sc.nextInt(); // 예외 발생 가능
			
			//try 블록은 예외가 발생 예상되는 코드를 감싸주는 역할

			System.out.println(num1/num2); // 예외발생 가능
			
			System.out.println("연산이 성공적으로 실행되었습니다.");
		} catch (ArithmeticException e) {
			// catch : 예외타입에 따라 예외처리를 해주는 블록
			System.out.println("0 으로 나눌수 없음");
			System.out.println(e.getMessage());	//예외 인스턴스 메소드
			e.printStackTrace();
//			System.out.println("프로그램을 종료합니다.");
//			return;
		} catch (InputMismatchException e) {
			System.out.println("숫자만 입력하세요");
		} catch (Exception e) {
			System.out.println("예외가 발생했습니다.");
		} finally {
			// try 블록으로 진입하면 무조건 실행
			System.out.println("무조건 실행하는 부분");
		}
		
		
		
		System.out.println(num1/num2);
		System.out.println("프로그램을 종료합니다.");


	}

}
