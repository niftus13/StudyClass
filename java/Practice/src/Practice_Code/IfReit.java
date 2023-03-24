package Practice_Code;

import java.util.Scanner;

// 문제 1: 아래 예제는 두 개의 if문을 사용하고 있다. 한 개의 if 문만 사용하는 방식으로 변경해보자.
public class IfReit {

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
