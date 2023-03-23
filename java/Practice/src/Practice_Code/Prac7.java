package Practice_Code;

/*1부터 100까지 출력한 후, 다시 거꾸로 100부터 1까지 출력하는 프로그램을 작성. 
while문과 do~while 문을 각각 한번씩 사용해서 작성*/



public class Prac7 {

	public static void main(String[] args) {
		
		int num = 1;
		
		while(num<100) {
			System.out.println(num);
			num++;
		}
		System.out.println(num);
		do {
			System.out.println(num);
			num--;
		}while(num>=1);

	}

}
