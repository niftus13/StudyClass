package chapter04.exam;

public class Exam_5 {

	public static void main(String[] args) {
		// num < 0 이라면 “0 미만” 출력 부분은 if문을 사용하고 나머지 조건에 대해 변경하세요.

		int num = 100;
		if (num < 0) {
			System.out.println("0미만");
		} else {
			switch (num / 100) {
			case 0: //num<100
				System.out.println("0이상 100 미만");
				break;
			case 1:	//100<= num <200
				System.out.println("100이상 200 미만");
				break;
			case 2:	//200<= num <300
				System.out.println("200이상 300 미만");
				break;
			default: //num>=300
				System.out.println("300이상");
				break;
			}
		}

	}

}
