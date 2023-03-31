package chapter08;

public abstract class Phone {

	String PhoneNumber;

	public Phone(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	
	void call() {
		System.out.println(PhoneNumber + " 에서 전화를 겁니다.");
	}
	
	abstract void turnOn();
	
}
