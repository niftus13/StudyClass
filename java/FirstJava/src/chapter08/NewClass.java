package chapter08;

public  class NewClass extends AbstractClass{
	
	// 추상클래스를 상속하면 추상메소드를 멤버로 가지게 된다. -> 추상클래스
	
	@Override
	void abstractMethod() {
		System.out.println("추상메소드 구현했습니다.");
		
	}

	public void abstractMethod() {
		// TODO Auto-generated method stub
		
	}
	
}
