package contact;

import java.util.Scanner;

public class ContactMain3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("전화번호 정보 입력 시작");
		
		System.out.println("이름>");
		String name = in.nextLine();
		System.out.println("전화번호>");
		String phoneNumber = in.nextLine();
		System.out.println("이메일>");
		String email = in.nextLine();
		System.out.println("주소>");
		String address = in.nextLine();
		System.out.println("생일>");
		String birth = in.nextLine();
		System.out.println("그룹>");
		String group = in.nextLine();
		
		
		Contact contact = new Contact(name, phoneNumber, email, address, birth, group);
				
		System.out.println("입력결과  ===========");
		//인스턴스 출력 메소드
		contact.showData();
		
		
		
	}

}
