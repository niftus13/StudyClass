package chapter05;

public class SingtonMain {
	public static void main(String[] args) {
		
		Singleton s = Singleton.getInstance();
		//s = new Singleton(); //외부에서 인스턴스 생성이 불가
		s.printData();
		
		
		
	}
}
