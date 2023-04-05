package chapter11;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		
		List<Integer> numbers = new LinkedList<Integer>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(10);
		numbers.add(20);
		
		//반복자 : Iterator<E> => Collection<E> 구현하는 객체들의 전체 참조 목적으로 사용
		Iterator<Integer> itr = numbers.iterator();
		
		System.out.println("Iterator 를 이용한 전체 참조");
		while(itr.hasNext()) {
//			System.out.println(itr.next());
			int num = itr.next();
			System.out.println(100+num);
		}
		
//		
//		for(int n : numbers) {
//			System.out.println(n);
//		}
		
		
		
		// Collection<E> => List<E> => ArrayList<E>
		// String 타입의 객체를 저장 => String 타입의 인스턴스를 참조하는 참조값을 저장
		LinkedList<String> list = new LinkedList<String>();

		// 인스턴스 저장 => 요소를 저장 add()
		list.add("손흥민");
		list.add(new String("박지성"));
		list.add(new String("이강인"));

		// 데이터 참조 : get()
		String name = list.get(0);
		System.out.println(name);
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println("--------------");
		// 특정 위치의 요소 삽입
		list.add(1, "안정환");

		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));

		// 저장된 요소의 개수 : size()
		System.out.println("저장된 이름의 개수 : " + list.size());
		System.out.println("index = 0 ~ " + (list.size() - 1));
		System.out.println("----------");
		// 반복문을 사용해서 일괄처리
		for (int i = 0; i < list.size(); ++i) {
			System.out.println(list.get(i) + " : " + list.get(i).charAt(0));
		}
		System.out.println("-----------");
		for (String playerName : list) { // 배열for문
			System.out.println(playerName + " : " + playerName.charAt(2));
		}

		// 포함여부
		if (list.contains("손흥민")) {
			System.out.println("우승하자");
		}

		if (list.contains("안정환")) {
			// 요소 제거
			list.remove("안정환");
			list.remove(0);
		}
		
		
		System.out.println("----------");
		for (String playerName : list) { // 배열for문
			System.out.println(playerName + " : " + playerName.charAt(2));
		}

		// 전체요소 삭제 : clear
		list.clear();
		System.out.println(list.size());
		System.out.println(list.isEmpty());

	}

}
