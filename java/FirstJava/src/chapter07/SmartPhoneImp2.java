package chapter07;

public class SmartPhoneImp2 extends Phone{

	String model;

	public SmartPhoneImp2(String phoneNumber, String model) {
		super(phoneNumber);
		this.model = model;
	}

	@Override 
	void call() {
		super.call();
		System.out.println(model +"이어팟을 이용해서 전화합니다.");
	}

	//기능 추가
	void playMusic() {
		System.out.println("음악을 듣습니다.");
	}

	public static void main(String[] args) {
		
		//다형성 : 상위타입의 참조변수에 다양한 하위타입의 인스턴스를 참조할 수 있는것
		Phone p = new SmartPhoneImp2("010-4444-2222", "IOS");
		
		p.call(); // 하위타입 인스턴스에 정의되어있는 override된 call() 메소드가 출력됨
	
//		p.playMusic();
//		SmartPhoneImp2 p2 =new SmartPhoneImp2("010-0000-0000", "test");
		
		//형변환 
		SmartPhoneImp2 p2 = (SmartPhoneImp2) p;
		p2.playMusic();
	}

	
	
}
