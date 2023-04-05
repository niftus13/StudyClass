package chapter11;


public class MyClass<T> {

	// 변수, 메소드의 반환타입, 매개변수의 타입
	T val;
	
	
	public MyClass(T val) {
		super();
		this.val = val;
	}
	
	public MyClass() {
		super();
	}

	T getVal() {
		return val;
	}
	
	void setVal(T val) {
		this.val = val;
	}

	public static void main(String[] args) {
		
		MyClass<String> myClass = new MyClass<String>();
//		myClass.setVal(new Date()); // 잘못된 타입이 저장되지 않도록 처리
		myClass.setVal("KING");	//String
		System.out.println(myClass.getVal());
	}

}
