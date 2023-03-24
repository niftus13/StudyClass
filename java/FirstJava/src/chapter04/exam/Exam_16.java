package chapter04.exam;

public class Exam_16 {

	public static void main(String[] args) {
		
		int num = 0;
		int sum = 0;
		
		while(num<100) {
			sum+=num;
			num++;
		}
		System.out.println("총 합은 "+sum);
		num=0;
		sum=0;
		
		do {
			sum+=num;
			num++;
			
		}while(num<100);
		
		System.out.println("총 합은 "+sum);
		
		
		sum=0;
		
		for(num=0;num<100;num++) {
			sum+=num;
		}
		System.out.println("총 합은 "+sum);
		
		

	}

}
