package Practice_Code;

// 문제 4 : SwitchBreak.java를 switch문이 아닌, if~else를 사용하는 형태로 변경해 보자.
public class SwitchBreak {

	public static void main(String[] args) {

		int n = 3;

		if (n == 1) {
			System.out.println("Simple Java");
		} else if (n == 2) {
			System.out.println("Funny Java");
		} else if (n == 3) {
			System.out.println("Fantastic Java");
		} else {
			System.out.println("The best programming language");
		}
		System.out.println("Do you like coffee?");

	}

}
