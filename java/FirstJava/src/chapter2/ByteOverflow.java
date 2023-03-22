package chapter2;

public class ByteOverflow {

	public static void main(String[] args) {
		
		//다루어야 하는 데이터의 범위에 따라서 타입설정이 달라져야 한다.
		//0~270
		byte b = 0;
		int i = 0;
		
		// 반복문을 통해 0부터 1씩 증가 270까지
		// 반복문 :
		// for(초기식; 비교식; 증감식;){ 반복해야 하는 코드}
		
		for(int x=0; x <=270; x++) {
//			System.out.println(1);
			System.out.println(b + "\t" + i);
			b++;
			i++;
		}

	}

}
