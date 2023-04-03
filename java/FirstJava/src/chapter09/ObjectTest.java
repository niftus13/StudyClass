package chapter09;

public class ObjectTest {

	public static void main(String[] args) {
		Car c1 = new Car("14타1648");
		Car c2 = new Car("89구6587");
		Car c3 = c1;
		Car c4 = new Car("14타1648");
		
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());

		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		System.out.println(c1.equals(c4));
		System.out.println(c1.equals(null));
		System.out.println(c1.equals("14타1648"));
		

	}

}


class Car{
	String carNo;
	Car(String carNo){
		this.carNo = carNo;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		//obj -> null =< false
		Car car = null;
		if(obj !=null && obj instanceof Car) {
			// obj 가 null값이 아니여야 하고 형변환이 가능해야 함
			car = (Car)obj;
			// 문자열을 비교해서 같은지 여부 반환
			if(carNo.equals(car.carNo)) {
				return true;
			}
		}	
		return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return carNo + "차량입니다.";
	}
	
}
