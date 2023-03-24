package chapter04.exam;

public class Exam_14 {

	public static void main(String[] args) {
		for (int a = 0; a <= 9; a++) {
			for (int b = 0; b <= 9; b++) {
				int top = a * 10 + b;
				int bot = b * 10 + a;
				if (top + bot == 99) {
					System.out.println("A = " + a + ", B = " + b);

				}
			}
		}

	}

}
