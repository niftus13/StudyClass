package chapter08.phone;

public class Main {

	public static void main(String[] args) {
		
//		//null 값을 넣어줘서 인스턴스 사용가능
//		Phone phone = null; // = new 구현한 클래스();
//		 
//		//1. 전원을 킨다.
//		phone.turnOn();
//		//2. 통화
//		phone.call();
//		//3. 전원을 끈다.
//		phone.turnOff();
		
		Phone phone2 = new SmartPhone2();
		/////////////
		// 1. 전원을 키고
		phone2.turnOn();
		// 2. 전화를 걸고
		phone2.call();
		// 3. 게임을 하고
		((SmartPhone2)phone2).gamePlay();
		// 4. 전원을 끈다
		phone2.turnOff();

	}

}
