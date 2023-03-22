package project;

public class Member {

	public static void main(String[] args) {
		System.out.println("허정");
		
		//String 타입의 이름을 저장할 수 있는 변수 name을 정의해봅시다.
		
		String name = null;
		//int 타입의 나이를 저장할 수 있는 변수 age를 정의해봅시다.

		int age = 0;
		// double 타입의 키를 저장할 수 있는 변수 height를 정의해봅시다
		double height = 0;
		//boolean 타입의 JAVA책의 보유 여부를 저장할 수 있는 변수 hasBook를 정의해봅시다
		boolean hasBook = false;
		//이름과 나이, 키, 책의 보유 여부를 출력해봅시다
		System.out.printf("%d %s %f %s",name,age,height,hasBook);
		
		
	}

}
