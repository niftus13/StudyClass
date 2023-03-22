package chapter2;
import java.util.Scanner;

public class VarRefferenceType {

	public static void main(String[] args) {
		String str = null; // 참조변수 : 객체의 주소값, null -> 아직 주소값을 저장하고 있지 않다. 

		str = "JAVA"; // "문자열" => String 타입의 객체로 생성
		
		System.out.println(str);
	}

}
