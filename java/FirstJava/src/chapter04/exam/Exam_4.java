package chapter04.exam;

public class Exam_4 {

	public static void main(String[] args) {
		int key = 3;
		
//		switch(key) {
//		case 1: // key == 1
//			System.out.println("AAA");
//			break;
//		case 2:	// key == 2
//			System.out.println("BBB");
//			break;
//		case 3:	// key == 3
//			System.out.println("CCC");
//			break;
//		default:
//			System.out.println("DDD");
//		}
		if(key==1) {
			System.out.println("AAA");
		}else if(key==2) {
			System.out.println("BBB");
		}else if(key==3) {
			System.out.println("CCC");
		}else {
			System.out.println("DDD");
		}

		System.out.println("프로그램 종료");
	}

}
