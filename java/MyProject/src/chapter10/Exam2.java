package chapter10;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.InputMismatchException;
import java.util.Scanner;

//Scanner 클래스로 태어난 년도를 입력 받을 때 int 타입으로 받도록 합시다. 
//이때 nextInt() 메소드를 사용하게 되는데 이때 발생하는 예외처리를 하도록 합시다.

public class Exam2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int birthYear = 0;
		boolean value = false;
		
		while(!value) {
			try {
				System.out.println("태어난 년도 : ");
				birthYear = sc.nextInt();
				value = true;
			} catch (InputMismatchException e) {
				System.out.println("정수값을 넣으세요");
				sc.nextLine();
			}
			
		}
		
		
		System.out.printf("당신의 태어난 년도는 : %d 입니다.\n",birthYear);
		LocalDate birthday = LocalDate.of(birthYear, 5, 22);
		LocalDate now = LocalDate.now();
		System.out.println("오늘은 " + now);
		System.out.println("생일은 " + birthday);
		long days = ChronoUnit.DAYS.between(birthday, now);
		System.out.println(days + "일");
		LocalDate cDay = LocalDate.parse("2023-12-25");
		System.out.println("크리스마스 " + cDay);
		long days2 = ChronoUnit.DAYS.between(now, cDay);
		System.out.println(days2);

	}

}
