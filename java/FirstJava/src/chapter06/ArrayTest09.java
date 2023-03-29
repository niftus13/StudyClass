package chapter06;

import java.nio.channels.MembershipKey;

public class ArrayTest09 {

	public static void main(String[] args) {
		
		// Member 타입의 배열 생성 : 요소는 5개 저장
		Member[] members = new Member[5];

//		Member member1 = new Member(1, "cool", "시원한");
		members[0] = new Member(1, "cool", "시원한");
		members[1] = new Member(2, "hot", "뜨거운");
		members[2] = new Member(3, "son", "손흥민");
		members[3] = new Member(4, "park", "박지성");
		members[4] = new Member(5, "cha", "차두리");

//		System.out.println(members[0].memberId);
//		System.out.println(members[0].memberName);
//		System.out.println(members[0]);// 객체 넣을시 자동으로 .toString
		// members[0] =>Member 타입의 참조변수
		System.out.println("====회원 리스트 =======");
		
//		for (int i=0; i<members.length;i++) {
//			System.out.println(members[i]);
//		}
		
		//향샹된 for(0~끝)
		for(Member member:members) {
			//member = members[0]
			System.out.println(member);
		}
	}

}
