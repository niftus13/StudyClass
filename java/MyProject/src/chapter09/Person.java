package chapter09;

/*1. 위 Person 클래스의 equals() 메소드를 오버라이딩해서 
주민등록번호가 같으면 인스턴스로 판별하는 프로그램을 만들어봅시다.*/

public class Person {
	String name;
	String personNumber;

	public Person(String name, String personNumber) {
		super();
		this.name = name;
		this.personNumber = personNumber;
	}

	@Override
	public boolean equals(Object obj) {

		boolean result = false;
		// 매개변수로 받은 obj를 person타입으로 형변환 (null이 아닌 상태에서 형변환 여부 체크)
		// personNumber와 비교 결과값 반환 result 에 대입
		if (obj != null && obj instanceof Person) {
			Person p = (Person) obj;
			result = this.personNumber.equals(p.personNumber);
		}

		return result;
	}

	public static void main(String[] args) {
		Person p1 = new Person("son","780521-1888888");
		Person p2 = new Person("park","780521-1888888");
		System.out.println(p1.equals(p2));
	}
}
