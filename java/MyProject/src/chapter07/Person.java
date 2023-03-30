package chapter07;

public class Person {

	private String name;
	private String idNum;

	//Constructor
	public Person(String name, String idNum) {
		this.name = name;
		this.setIdNum(idNum);
	}
	
	//getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdNum() {
		return idNum;
	}

	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}

	//greeting method
	public void greet() {
		int age = calculateAge(getIdNum());
		System.out.println("안녕하세요 저는 " + name + "입니다 " + age + "살 입니다. ");
	}

	//CalculateAge method
	public int calculateAge(String idNumber) {
		int num = Integer.parseInt(idNumber.substring(0, 2));
		if (num < 23) {
			return (2023 - (num + 2000) + 1);
		} else {
			return (2023 - (num + 1900) + 1);
		}

	}

}
