package chapter11;

public class MyInterfaceImp<T1, T2> implements MyInterface<T1, T2>{

	@Override
	public T1 method1(T1 t) {
		
		return t;
	}

	@Override
	public T2 method2(T2 t) {
		
		return t;
	}
	
	public static void main(String[] args) {
		
		MyInterfaceImp<String, Integer> my = null;
		//my = new MyInterfaceImp<String , Integer>();
		my = new MyInterfaceImp();
		
		System.out.println(my.method1("Ten"));
		System.out.println(my.method2(10));
		
	}

}
