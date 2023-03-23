package chapter04;

public class SwitchCase1 {

	public static void main(String[] args) {
		
		int score = 91;
		//점수별 학점 체크
		//score / 10
		// 100 ->10
		// 90~99 -> 9 90이상
		// 80~89 -> 8 80이상
		
		switch(score/10) {
		
		case 10 :
			System.out.println("A");
			break;
		case 9 :
			System.out.println("A");
			break;
		case 8 :
			System.out.println("B");
			break;
		default :
			System.out.println("C");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
//		int key = 60;
//		
//		switch (key) {
//		case 10:  // key == 10
//			System.out.println("10");
//			break; // 감싸고 있는 블럭 탈출
//			
//		case 20:  // key == 10
//			System.out.println("20");
//			break; // 감싸고 있는 블럭 탈출
//	
//			
//		default:
//			System.out.println("10 또는 20이 아닙니다.");
//			break;
//		}
	
	}
}
