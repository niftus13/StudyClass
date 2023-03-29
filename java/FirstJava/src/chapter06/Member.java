package chapter06;

public class Member {

	int memberNo;
	String memberId;
	String memberName;

	public Member(int memberNo, String memberId, String memberName) {
		this.memberNo = memberNo;
		this.memberId = memberId;
		this.memberName = memberName;
	}

	//참조변수 값 대입 확인
	@Override
	public String toString() {
		return "회원 [회원번호= " + memberNo + ", memberId= " + memberId + ", 회원의 이름= " + memberName + "]";
	}

	
	
	
}
