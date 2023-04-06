package chapter11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectonsTest {

	public static void main(String[] args) {
		List<Integer> lottoNumber = new ArrayList<>();
		
		for(int i=0;i<6;i++) {
			lottoNumber.add(new Random(System.nanoTime()).nextInt(45)+1);
			
		}
		System.out.println("최초 입력 데이터");
		displayList(lottoNumber);
		System.out.println();
		System.out.println("최대 값 : "+Collections.max(lottoNumber) );
		System.out.println("최소 값 : "+Collections.min(lottoNumber) );
		
		Collections.sort(lottoNumber);
		displayList(lottoNumber);
		
		Collections.reverse(lottoNumber);
		displayList(lottoNumber);
		
		Collections.shuffle(lottoNumber);
		displayList(lottoNumber);
		
		

	}

	
	static <E> void displayList(List<E> list) {
		System.out.println("===========");
		for(E num : list) {
			System.out.println(num);
		}
	}
}
