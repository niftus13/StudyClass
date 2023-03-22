package chapter03;

public class Operator07 {

	public static void main(String[] args) {
		char c1 = 'A';//유니코드 값
		
		int n1 = c1; //n1 = 65
		
		char c2 = (char)(c1+1);// int + int 변환되기 때문에 char로 형변환
		
		
		System.out.println(c1); // A
		System.out.println(n1); // 65
		System.out.println(c2); // B

	}

}
