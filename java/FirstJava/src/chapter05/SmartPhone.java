package chapter05;

public class SmartPhone {
	
	//변수 선언 : 멤버변수 , 인스턴스 변수
	String color = "white";	//속성 : 색상 값 => 변수로 선언
	float size = 5.7f;		//속성 : 사이즈 => 변수로 선언
	int volume = 0;			//속성 : 볼륨의 크기 => 변수로 선언
	
	//메소드 정의 : 인스턴스 메소드
	
	//전화 걸기 기능
	void call() {
		System.out.println("전화를 겁니다.");
		
	}
	//볼륨 키우는 기능
	void volumeUp() {
		volume++;
	}
	//볼륨 줄이는 기능
	void volumeDown() {
		volume--;
	}
	
	public static void main(String[] args) {
		
		// 클래스를 인스턴트로 만든다 -> 인스턴스화
		// 인스턴스화 => 클래스에 정의된 변수와 메소드가 메모리로 로드된다
		// 참조변수 선언 = new 클래스이름();
		
		//참조변수 선언 => 클래스이름 변수이름; => 인스턴스 메모리의 주소값을 저장
		SmartPhone sp = null; 	//참조변수의 초기화 null값을 사용
		
		sp = new SmartPhone(); // new 키워드를 사용하면 인스턴스가 생성
		// 인스턴스의 생성 => 클래스에 저의된 멤버들이 메모리로 로드
		//인스턴스 메모리의 주소값을 반환 
		
		// 인스턴스 변수의 참조 => 참조변수.변수이름;
		
		System.out.println("스마트폰의 색상 : "+sp.color);
		System.out.println("스마트폰의 사이즈 : " + sp.size);
		System.out.println("스마트폰의 볼륨 크기 : "+ sp.volume);
		
		sp.color = "Gold";
		sp.size = 6.0f;
		
		System.out.println("스마트폰의 색상 : "+sp.color);
		System.out.println("스마트폰의 사이즈 : " + sp.size);
		System.out.println();
		//인스턴스 메소드의 호출 => 참조변수.메소드이름;
		sp.call();
		
		//볼륨의 값을 변경하는 방법
		//변수에 직접 대입(X)
		//메소드를 통해서 변경
		System.out.println("현재 볼륨 값 : " + sp.volume);
		sp.volumeUp();
		sp.volumeUp();
		sp.volumeUp();
		System.out.println("현재 볼륨 값 : " + sp.volume);
		sp.volumeDown();
		System.out.println("현재 볼륨 값 : " + sp.volume);
	}
	
	
}

