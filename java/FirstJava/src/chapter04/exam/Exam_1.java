package chapter04.exam;

import java.util.Scanner;

public class Exam_1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("여기에 숫자를 입력하세요 >>");
		
		int num = 0;
		
		num= in.nextInt();
		
		

		if (num > 0 && num % 2 == 0) {
			System.out.println("양수이면서 짝수");

		}else {
			System.out.println("음수 혹은 홀수");
		}

	}

}
