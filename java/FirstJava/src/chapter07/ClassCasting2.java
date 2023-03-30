package chapter07;

public class ClassCasting2 {

	public static void main(String[] args) {
		AndroidPhone androidPhone = new AndroidPhone("010-0000-0000");
		IPhone iPhone = new IPhone("010-9999-9999");

		callByPhone(androidPhone);
		callByPhone(iPhone);
		
	}
	
	// 파생 클래스가 많아질 경우 각각 타입에 맞는 메소드를 작성해야함.
//	public static void callByPhone(AndroidPhone p) {
//		p.call();
//	}
//	public static void callByPhone(IPhone p) {
//		p.call();
//}
	
	// 매개변수에 다형성을 적용 => 추가적인 메소드 생성이 필요 없음
//							(상속이 아닌경우 다형성 사용 X)
	public static void callByPhone(Phone phone) {
		phone.call();
	}
	

	
}
