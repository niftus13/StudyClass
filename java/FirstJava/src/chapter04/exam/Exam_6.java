package chapter04.exam;

public class Exam_6 {

	public static void main(String[] args) {
		//while 문을 이용해서 1부터 99까지의 합을 구하는 프로그램을 작성.
		
		int i = 1;
		int sum = 0;

		while(i<100) {		//반복처리 
			
			sum+=i;
			i++;
		}System.out.println(sum);
		
//		for(int i = 0;i<100;i++) {
//			sum+=i;
//		}
//		System.out.println(sum);

	}

}
