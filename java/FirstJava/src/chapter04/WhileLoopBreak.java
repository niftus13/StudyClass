package chapter04;

public class WhileLoopBreak {

	public static void main(String[] args) {
		
		int num = 0; //초기식, 반복을 위한 조건에 사용하는 변수
		
		while (true) { //무한 반복을 하기 위한 조건 : true
			//탈출조건
			if(num==5) {
				break; //반복문 탈출
			}
			System.out.println(num++);
		}

	}

}
