package Practice_Code;

public class prac9 {
	// for 문을 이용하여 1부터 10까지를 곱해서 그 결과를 출력하는 프로그램을 작성

	public static void main(String[] args) {

		int result = 1;
		for (int i = 1; i <= 10; i++) {
			result *= i;
		}
		System.out.println("1부터 10까지의 곱은 " + result + "입니다.");

	}

}
