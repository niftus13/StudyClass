package chapter04;

public class ForLoop02 {

	public static void main(String[] args) {
		
		//행을 표현 => 외부 Loop
		//열을 표현 => 내부 Loop
		
		for(int i=1;i<10;i++) {
//			System.out.println(i);
			
			for(int j=2;j<10;j++) {
				System.out.print(j+"X"+i+"="+i*j+"\t");
			}
			System.out.println();
		}

	}

}
