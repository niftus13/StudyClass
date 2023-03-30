package chapter07;

public class Female extends Person{

	//new
	boolean married;

	//Constructor
	public Female(String name, String idNum, boolean married) {
		super(name, idNum);
		married = this.married;
	}
	
	//Check Married
	public void checkMarried() {
		if(married) {
			System.out.println("님은 기혼입니다.");
		}else {
			System.out.println("님은 미혼입니다.");
		}
	}

	
	@Override
	public void greet() {
		int age = calculateAge(getIdNum());
		System.out.println("안녕하세요. 저는 " + getName() + "입니다. " + age + "살이고, " + (married ? "기혼" : "미혼") + "입니다.");
	}
	
	
	
}
