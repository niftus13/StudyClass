package Practice_Code;

//while 문을 이용해서 1부터 99까지의 합을 구하는 프로그램을 작성.

public class Prac6 {

	public static void main(String[] args) {

		int num = 0;
		int sum = 0;

		while (num < 100) {
			sum += num;
			num++;
		}
		System.out.println(sum);

	}

}
