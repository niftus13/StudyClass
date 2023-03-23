package chapter04;

public class IfTest04 {

	public static void main(String[] args) {
		// 특정 숫자의 판별 : 양수 , 음수 ,0
		
		int num = -3;
		
		// 양수 : 0 보다 큰수 : num > 0 => 양수
		// 음수 : 0 보다 작은수 num < 0 => 음수
		// 0
		
		if(num > 0) {
			System.out.println("양수");
		}else if(num < 0){
			//num < 0
			System.out.println("음수");
			
		}else {
			System.out.println("0");
		}

	}

}
