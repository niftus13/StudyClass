package Practice_Code;

public class Exam_13 {

	public static void main(String[] args) {
		for (int i = 2; i < 9; i *= 2) {
			if(i==6) {
				continue;
			}
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "X" + j + "=" + i * j + "\t");
				if (j >= i) {
					break;
				}
			}
		}

	}

}
