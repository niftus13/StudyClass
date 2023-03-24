package project;

import java.util.Scanner;

public class Member {

	public static void main(String[] args) {
		System.out.println("허정");

		// String 타입의 이름을 저장할 수 있는 변수 name을 정의해봅시다.

		String name = null;
		// int 타입의 나이를 저장할 수 있는 변수 age를 정의해봅시다.

		int age = 0;
		// double 타입의 키를 저장할 수 있는 변수 height를 정의해봅시다
		double height = 0;
		// boolean 타입의 JAVA책의 보유 여부를 저장할 수 있는 변수 hasBook를 정의해봅시다
		boolean hasBook = false;
		// 이름과 나이, 키, 책의 보유 여부를 출력해봅시다
		System.out.printf("%d %s %f %s \n", name, age, height, hasBook);

		Scanner in = new Scanner(System.in);
		System.out.println("태어난 년도를 입력하세요");
		int year = in.nextInt();
		printCheckFreeVaccine(year);
		printCheckMedical(year);

	}
/*
	 독감예방 접종이 가능한지 여부를 확인하는 메소드를 정의합니다.
	 매개변수로 태어난 해(년도)를 전달받습니다.
	 15세 미만의 경우와 65세 이상의 경우 “무료예방접종이 가능합니다.” 메시지가 콘솔에 출력하도록 합니다.
	 위에서 정의한 조건의 범위가 아닌 나머지의 경우 “무료접종 대상이 아닙니다.”라고 출력하도록 합니다.
	 반환타입 : void
	 매개변수 : year (태어난 연도 =>int)
	 
	*/
	
	
	static void printCheckFreeVaccine(int year) {
		int y = 0;
		y = 2023 - year+1;
		if (y < 15 || y >= 65) {
			System.out.println("무료예방접종이 가능합니다.");
		} else {
			System.out.println("무료접종 대상이 아닙니다.");
		}
	}

//	 건강검진 대상 여부를 판별하고 어떤 검진이 가능한지 확인하는 메소드를 정의합니다.
//	 - 매개변수로 태어난 해(년도)를 전달받습니다.
//	 - 대한민국 성인( 20세 )의 경우 무료로 2년마다 건강검진을 받을 수 있습니다.
//	 - 짝수 해에 태어난 사람은 올해가 짝수년이라면 검사 대상이 됩니다.
//	 - 40 이상의 경우는 암 검사도 무료로 검사를 할 수 있습니다.

	static void printCheckMedical(int year) {
		int age = 0;
		age = 2023 - year +1;
		// 여부확인
		if(age>=20&&(2023+year)%2==0) {
			System.out.println("무료 건강검진 대상입니다.");
			if(age>=40) {
				System.out.println("무료 암 검진 대상입니다.");
			}
		}else {
			System.out.println("무료 건강검진 대상이 아닙니다.");
		}

	}

}
