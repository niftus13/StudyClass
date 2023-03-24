package Practice_Code;

public class Prac14 {

	public static void main(String[] args) {
		// 10A+B + 10B+A = 99 => 11A+11B=99 =>A+B=9 => B-9=A
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
