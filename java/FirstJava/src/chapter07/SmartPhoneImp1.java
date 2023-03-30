package chapter07;

public class SmartPhoneImp1 extends Phone{

	String model;

	public SmartPhoneImp1(String phoneNumber, String model) {
		super(phoneNumber);
		this.model = model;
	}

	@Override 
	void call() {
		super.call();
		System.out.println(model +"이어팟을 이용해서 전화합니다.");
	}

	public static void main(String[] args) {
		SmartPhoneImp1 phone = new SmartPhoneImp1("010-1111-2222", "google");
		
		phone.call();
	}

	
	
}
