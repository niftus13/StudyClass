package chapter04.exam;

//import java.util.Scanner;

public class Exam_3 {

	public static void main(String[] args) {
		// 두 수의 큰 수를 찾아 출력하고 두 수의 차를 출력

		// 큰수 -> 두 수를 비교하여 판별
		// 두 수의 차 -> 두수의 큰 수와 작은 수를 구해서 큰 수에서 작은 수를 빼준다.

		int num1 = 50;
		int num2 = 100;

		/*
		 * System.out.println("두 수를 입력"); Scanner in = new Scanner(System.in); 
		 * 
		 * int num1= .inNextInt() int num2 = .inNextInt()
		 */

		int big = 0; // 큰수
		int diff = 0; // 차이값을 저장

		// 두 수를 비교 if문으로
		// big = (num1>num2)? num1:num2;
		// diff = (num1>num2)? num1-num2: num2-num1;

		if (num1 > num2) {
			big = num1;
			diff = num1 - num2;
		} else {
			big = num2;
			diff = num2 - num1;
		}
		// 출력
		System.out.println(big);
		System.out.println(diff);

	}

}
