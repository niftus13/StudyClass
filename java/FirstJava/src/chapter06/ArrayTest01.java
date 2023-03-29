package chapter06;

public class ArrayTest01 {

	public static void main(String[] args) {
		
		//배열 선언
		int[] scores; // int 타입의 배열 인스턴스 주소를 가지는 변수
		
		//배열의 생성
		scores = new int[10]; // int 타입의 요소 10개를 가지는 배열 인스턴스 생성
		
		//기본값으로 초기화 되어있음
		for(int i=0;i<scores.length;i++) {
			System.out.println(scores[i]);
		}
		System.out.println("===========");
		
		
		//배열 요소의 참조
		//배열이름 index[]
		//index => 0~ 개수-1
		//요소의 개수 -> 배열변수.length
		
		scores[0] = 60;
		scores[1] = 72;
		scores[2] = 90;
		scores[3] = 68;
		scores[4] = 70;
		scores[5] = 50;
		scores[6] = 76;
		scores[7] = 91;
		scores[8] = 70;
		scores[9] = 84;
		//scores[10] = 60; //오류 
		
		//총합
		int sum = 0;
		//평균값
		float avg = 0.0f;
		
		//출력
		//System.out.println(scores[0]);
		//index =>0~9
		for(int i = 0; i<scores.length;i++) {
			System.out.println((i+1)+" : "+scores[i]);
			sum+=scores[i];
		}
		avg = sum/(float)scores.length;
		
		System.out.println("총합은 : "+ sum);
		System.out.println("평균은 : "+ avg);
		
	}

}
