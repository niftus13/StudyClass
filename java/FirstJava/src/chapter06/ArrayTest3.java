package chapter06;

public class ArrayTest3 {

	public static void main(String[] args) {
		
		//배열 선언
		int[] scores; // int 타입의 배열 인스턴스 주소를 가지는 변수
		
		//배열의 생성
		scores = new int[15]; // int 타입의 요소 10개를 가지는 배열 인스턴스 생성
		
		
		
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
		scores[10] = 70;
		scores[11] = 94;
		scores[12] = 96;
		scores[13] = 72;
		scores[14] = 64;
		
		resultPrint(scores);
		
		
	}
	//점수를 저장하고 있는 배열을 전달받아 총점과 평균값을 출력하는 메소드
	
	static void resultPrint(int arr[]) { //int[] arr = scores;
		//전달받은 배열은 : int 타입의 배열. size제약 없음
		int sum = 0;
		float avg = 0.0f;
		
		for (int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		avg = sum/(float)arr.length;
		
		System.out.println("===========");
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+avg);
	}
	
	
	

}
