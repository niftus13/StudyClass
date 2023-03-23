package chapter04;

public class IfTest05 {

	public static void main(String[] args) {
		// if 구문 내부에 If 구문 중첩
		
		//양수 , 음수, 0 선별
		
		int num = 10;
		
		if(num > 0) {
			System.out.println("양수");
			if(num%2 == 0) {
				System.out.println("짝수");
			}else {
				System.out.println("홀수");
			}
		}else {
			if(num<0) {
				System.out.println("음수");
			}else {
				System.out.println("0");
			}
		}

	}

}
