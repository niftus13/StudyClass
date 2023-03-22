package chapter03;

public class Operator13 {
	//SCE(Short - Circuit Evaluation)
	public static void main(String[] args) { 
		
		
		//초기화
		int num1 = 0;
		int num2 = 0;
		boolean result = false;
		
		result = (num1 += 10)<0 && (num2 +=10)>0;//num1 += 10 => num1 = num1+10
		
		System.out.println(result);
		System.out.println("num1 : " + num1 + " num2 : " + num2);
		
		// or연산
		result = (num1 += 10) > 0 || (num2 += 10) > 0;
		
		System.out.println(result);
		System.out.println("num1 : " + num1 + " num2 : " + num2);
		
		
		
	}

}
