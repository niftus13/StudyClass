package chapter07;

public class Male extends Person{
	boolean mService;
	
	public Male(String name, String idNum, boolean mService) {
		super(name, idNum);
		 this.mService = mService ;
	}
	
	//Check Military Service
	public void checkMiliService() {
		if(mService) {
			System.out.println("님은 군필입니다.");
		}else {
			System.out.println("님은 미필입니다.");
		}
	}

	@Override
	
	public void greet() {
		int age = calculateAge(getIdNum());
		System.out.println("안녕하세요. 저는 " + getName() + "입니다. " + age + "살이고, " + (mService ? "군필" : "미필") + "입니다.");
	}

}
