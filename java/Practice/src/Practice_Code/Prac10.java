package Practice_Code;


/*문제 10.

for 문을 이용하여 구구단 중 5단을 출력하는 프로그램 작성*/

public class Prac10 {

	public static void main(String[] args) {
		int num=5;
		
		for(int i=1;i<10;i++) {
			System.out.println(num+"X"+i+"="+num*i+"\t");
		}

	}

}
