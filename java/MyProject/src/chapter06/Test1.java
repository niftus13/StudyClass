package chapter06;

public class Test1 {
	//국어, 영어, 수학 점수 10개씩을 저장하는 배열을 정의하고 점수를 모두 출력하고,
	//평균 점수를 출력하는 프로그램을 작성해봅시다.
	public static void main(String[] args) {
		//입력
		
		int[][] student = {        //student = 국어 영어 수학
				{90, 70, 40},
				{80, 80, 60},
				{80, 60, 40},
				{60,40,20},
				{70,80,90},
				{70,80,90},
				{70,80,90},
				{70,80,90},
				{70,80,90},
				{70,80,90}
		};
		
		

		for(int i[] :student) {
			int sum=0;
			float avg = 0.0f;
			for(int j : i) {
				System.out.print(j+"\t");
				sum+=j;
			}
			avg=sum/i.length;
			System.out.println("합 = "+sum+" 평균 = "+avg+"\n");
		}
		
		
		

	}

}
