package Practice_Code;

/*CondOp.java를 조건연산자(3항 연산자)를 사용하지 않고,
if~else를 사용하는 형태로 변경해 보자.*/
public class CondOp {

	public static void main(String[] args) {
		int num1 = 50, num2 = 100;
		int big, diff;

//      big = (num1>num2)? num1:num2;
//      System.out.println(big);
		if (num1 > num2) {
			big = num1;
			System.out.println(big);
		} else {
			big = num2;
			System.out.println(big);
		}

//      diff = (num1>num2)? num1-num2: num2-num1;
//      System.out.println(diff);
		if (num1 > num2) {
			diff = num1 - num2;
			System.out.println(diff);
		} else {
			diff = num2 - num1;
			System.out.println(diff);
		}

	}

}
