package chapter04.exam;
/*문제 12.

자연수 1부터 시작해서 모든 홀수와 3의 배수인 짝수를 더해 나간다.
그리고 그 합이 언제 (몇을 더했을 때) 1000이 넘어서는지, 
그리고 1000이 넘어선 값은 얼마가 되는지 계산하여 출력하는 프로그램을 작성.
프로그램 내부에 while문을 무한 루프로 구성하여 작성.*/
public class Exam_12 {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;

		while (true) {
			if (num % 2 == 1 || (num % 2 == 0 && num % 3 == 0)) {
				sum += num;
			}
			if (sum > 1000) {
				System.out.println("1000을 넘어선 합: " + sum);
				System.out.println("합이 1000을 넘긴 수: " + num);
				break;
			}
			num++;
		}

	}

}