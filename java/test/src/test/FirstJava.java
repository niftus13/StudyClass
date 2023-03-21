package test;

/* 
 * 어떤 파일
 * 어떤 목적
 * 부가 작성
 * 언제 수정
 * 
 * 
 */
public class FirstJava {
	
	//주석은 컴파일시 코드로 인식 X
	//변수들 정의
	//함수들 (메소드) 정의
	
	
	//메인메소드 -> 클래스 실행시 시작 시점
	public static void main(String[] args) {
		
		// System.out.println("First Java1"); //출력, 줄바꿈
		/* 
		 *System.out.println("First Java2"); 
		 *System.out.println("First Java3");
		*/
		//System.out.println("First Java4");

		//변수 : 메모리 공간 할당,메모리 주소의 역할
		//변수 선언방법:
		//	자료형타입 변수이름 ; 
		
		
		//나이를 저장하는 변수선언 : 
		int age; // 변수선언 : 나이 값을 저장할 수 있는 변수 선언
		age = 20; //변수의 초기화 : 변수 선언후 값을 처음 대입
		
		//원주율  : pi -> 3.141592 ... <-실수
		double pi;
		pi = 3.141592;
		
		System.out.println(age);  // 20
		System.out.println(pi);   // 3.141592	
		
		//add 메소드
		int resultValue = add(10,20);
		System.out.println(resultValue);
		
		//hello 메소드
		hello();
		
		//hello2 메소드
		hello2("손흥민");
	}
	
	//정수 2개를 받아 더하기 연산한 결과를 반환하는 메소드
	//더하기 연산한  -> 내부처리
	//결과를 반환하는 메소드 -> return 결과값;
	static int add(int num1, int num2) {
		
		int result;
		result = num1 + num2;
		//결과값 반환
		return result;
	}
	
	//기능 : 인사말을 출력하는 기능을 가진 메소드
	//매개변수 : 데이터 받는 정의 -> 데이터 필요 없음
	//결과 반환 : 반환 X
	//반환타입 메소드이름(매개변수){}
	//void : 반환값이 없을 때 사용 -> return 이 없다.
	static void hello() {
		System.out.println("안녕하세요");
		System.out.println("반갑습니다.");
	}
	
	//기능: 이름을 전달받아 이름과 인사말을 출력하는 메소드
	//매개변수 : 이름(문자열)
	//반환 : 없음
	static void hello2(String name) {
		System.out.println(name);
		System.out.println("안녕하세요");
		
	}
	
}